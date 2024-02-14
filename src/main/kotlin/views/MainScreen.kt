package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import custom_resources.TurquoiseColor
import custom_resources.msSpacerW
import custom_resources.smartText
import engine_logic.Navi
import engine_logic.getCurrentTemperatureA
import engine_logic.pingEngineAPI
import engine_logic.read_and_write.*
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import ping_boxes.pingBoxesA
import ping_boxes.pingBoxesB
import ping_boxes.pingBoxesC
import ping_boxes.weatherBoxesA
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes

// Main screen/view of the app
@Composable
@Preview
fun mainScreen() {
// Current screen ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }
// IPs
    val ipAddress0 = readIpFile0()
    val ipAddress1 = readIpFile1()
    val ipAddress2 = readIpFile2()
    val ipAddress3 = readIpFile3()
    val ipAddress4 = readIpFile4()
    val ipAddress5 = readIpFile5()
    val ipAddress6 = readIpFile6()
    val ipAddress7 = readIpFile7()
    val ipAddress8 = readIpFile8()
    val ipAddress9 = readIpFile9()
    val ipAddress10 = readIpFile10()
    val ipAddress11 = readIpFile11()
// Ping results ram
    var pingSuccessful0 by remember { mutableStateOf(false) }
    var pingSuccessful1 by remember { mutableStateOf(false) }
    var pingSuccessful2 by remember { mutableStateOf(false) }
    var pingSuccessful3 by remember { mutableStateOf(false) }
    var pingSuccessful4 by remember { mutableStateOf(false) }
    var pingSuccessful5 by remember { mutableStateOf(false) }
    var pingSuccessful6 by remember { mutableStateOf(false) }
    var pingSuccessful7 by remember { mutableStateOf(false) }
    var pingSuccessful8 by remember { mutableStateOf(false) }
    var pingSuccessful9 by remember { mutableStateOf(false) }
    var pingSuccessful10 by remember { mutableStateOf(false) }
    var pingSuccessful11 by remember { mutableStateOf(false) }
// Weather results ram
    var currentTempA by remember { mutableStateOf("Loading...") }
    var currentSkyA by remember { mutableStateOf("Loading...") }

// Ping request engine (coroutine list)
    LaunchedEffect(Unit) {
        while (isActive) {
            val resultsA = listOf(
                async { pingEngineAPI(ipAddress0) },
                async { pingEngineAPI(ipAddress1) },
                async { pingEngineAPI(ipAddress2) },
                async { pingEngineAPI(ipAddress3) },
                async { pingEngineAPI(ipAddress4) },
                async { pingEngineAPI(ipAddress5) },
                async { pingEngineAPI(ipAddress6) },
                async { pingEngineAPI(ipAddress7) },
                async { pingEngineAPI(ipAddress8) },
                async { pingEngineAPI(ipAddress9) },
                async { pingEngineAPI(ipAddress10) },
                async { pingEngineAPI(ipAddress11) }
            )
// Ping request engine result
            pingSuccessful0 = resultsA[0].await()
            pingSuccessful1 = resultsA[1].await()
            pingSuccessful2 = resultsA[2].await()
            pingSuccessful3 = resultsA[3].await()
            pingSuccessful4 = resultsA[4].await()
            pingSuccessful5 = resultsA[5].await()
            pingSuccessful6 = resultsA[6].await()
            pingSuccessful7 = resultsA[7].await()
            pingSuccessful8 = resultsA[8].await()
            pingSuccessful9 = resultsA[9].await()
            pingSuccessful10 = resultsA[10].await()
            pingSuccessful11 = resultsA[11].await()

            delay(10000) // Adds a 10-second delay
        }
    }

// Weather request engine
    LaunchedEffect(Unit) {
        while (isActive) {
            val (temperatureA, skyA) = getCurrentTemperatureA("North Vancouver")
// Updates the UI state for WeatherBoxesA.kt
            currentTempA = if (temperatureA != null) {
                "$temperatureA°C"
            } else {
                "Error Code hd101"
            }
            currentSkyA = if (skyA != null) {
                "$skyA Sky"
            } else {
                "Error Code hd102"
            }

            delay(60000 * 10) // Adds a 10-minute delay
        }
    }

// UI container
    Column( modifier = Modifier.fillMaxSize().background(ErgoGray),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {

// Home button
            Box(modifier = Modifier.fillMaxSize().weight(1f)
                .size(24.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = rememberRipple(bounded = false, radius = 10.dp),
                    onClick = { currentScreen = Navi.MainScn })
            ) { Image(painter = painterResource("HomePng240.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(5.dp)
                )
            }

// Clickable title
            Box(modifier = Modifier.fillMaxSize().weight(1f)) {

                Text("Monithor Client",
                    fontSize = smartText(1.2f),
                    color = ErgoGray,
                    fontWeight = FontWeight.W900,
                    modifier = Modifier
                        .fillMaxSize()
                        .wrapContentSize(Alignment.Center)
                        .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            onClick = { currentScreen = Navi.MainScn }
                        )
                )
            }

// Settings button
            Box(modifier = Modifier.fillMaxSize().weight(1f)
                .size(24.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = rememberRipple(bounded = false, radius = 10.dp),
                    onClick = { currentScreen = Navi.SettingScn })
            ) { Image(painter = painterResource("SettingsPng240F.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(6.5.dp))
            }
        }

// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
                Row(modifier = Modifier.fillMaxWidth().weight(10f).padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
// Box set A
                    Column(modifier = Modifier
                            .padding(5.dp)
                            .weight(2f)
                    ) { pingBoxesA(pingSuccessful0, pingSuccessful1, pingSuccessful2, pingSuccessful3) }
                    msSpacerW()
// Box set B
                    Column(modifier = Modifier
                            .padding(5.dp)
                            .weight(2f)
                    ) { pingBoxesB(pingSuccessful4, pingSuccessful5, pingSuccessful6, pingSuccessful7) }
                    msSpacerW()
// Box set C
                    Column(modifier = Modifier
                            .padding(5.dp)
                            .weight(2f)
                    ) { pingBoxesC(pingSuccessful8, pingSuccessful9, pingSuccessful10, pingSuccessful11) }
                    msSpacerW()
// Box set D
                    Column(modifier = Modifier
                            .padding(5.dp)
                            .weight(2f)
                    ) { weatherBoxesA(currentTempA, currentSkyA) }
                }
            }
// Navi tail
            Navi.MainScn -> mainScreen()
            Navi.SettingOnOffBxs -> settingOnOffBoxes()
            Navi.SettingPingBxs -> settingPingBoxes()
            Navi.SettingScn -> settingScreen()
        }
    }
}
