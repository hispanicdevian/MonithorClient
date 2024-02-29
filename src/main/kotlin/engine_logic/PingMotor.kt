package engine_logic

import kotlinx.coroutines.*
import java.io.IOException

class PingMotor {
    suspend fun pingIP(ipAddress: String): Boolean = coroutineScope {
        val deferred = CompletableDeferred<Boolean>()

        val scope = CoroutineScope(Dispatchers.IO)
        scope.launch {
            try {
                val process = ProcessBuilder("ping", "-c", "4", ipAddress).start()

                // Redirect error stream to standard output to capture errors
                process.errorStream.bufferedReader().use { reader ->
                    reader.forEachLine { line -> println(line) }
                }

                // Read process output
                process.inputStream.bufferedReader().use { reader ->
                    reader.forEachLine { line -> println(line) }
                }

                // Wait for process to finish
                val exitVal = process.waitFor()

                if (exitVal ==  0) {
                    println("Ping mtr: true")
                    deferred.complete(true)
                } else {
                    println("Ping mtr failed: $exitVal")
                    deferred.complete(false)
                }
            } catch (e: IOException) {
                println("Ping mtr failed: ${e.message}")
                deferred.complete(false)
            } catch (e: InterruptedException) {
                println("Ping mtr failed: ${e.message}")
                deferred.complete(false)
            }
        }
        // Wait for the coroutine to complete and return its result
        deferred.await()
    }
}