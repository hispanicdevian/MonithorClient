package engine_logic

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import engine_logic.read_and_write.ReadWriterIP.readIpFile
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive

@Composable
fun effectLauncher(pingResults: (List<Boolean>) -> Unit, weatherResults: (String, String) -> Unit) {
// Ping motor bridge
    val pingMotor = remember { PingMotor() }
// IP/hostname source to be pinged
    val ipAddresses = remember { listOf(
            readIpFile(0),
            readIpFile(1),
            readIpFile(2),
            readIpFile(3),
            readIpFile(4),
            readIpFile(5),
            readIpFile(6),
            readIpFile(7),
            readIpFile(8),
            readIpFile(9),
            readIpFile(10),
            readIpFile(11)
        )
    }
// Ping -> ip/hostname launcher
    LaunchedEffect(ipAddresses) {
        val resultsA = ipAddresses.mapIndexed { _, ipAddress ->
            async { pingMotor.pingIP(ipAddress) }
        }
        val results = resultsA.map { it.await() }
        pingResults(results)

    delay(10000) // 10-second delay
}
// Get -> weather launcher
    LaunchedEffect(Unit) {
        while (isActive) {
            val (temperatureA, skyA) = getCurrentTemperatureA("North Vancouver")
            weatherResults(
                if (temperatureA != null) "$temperatureA°C" else "Error OL101",
                if (skyA != null) "$skyA Sky" else "Error OL102"
            )
            delay(60000 *  10) //  10-minute delay
        }
    }
}