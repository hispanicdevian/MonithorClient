package engine_logic

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

var ipAddress0 = readIpFile0()
var ipAddress1 = readIpFile1()
var ipAddress2 = readIpFile2()
var ipAddress3 = readIpFile3()
var ipAddress4 = readIpFile4()
var ipAddress5 = readIpFile5()
var ipAddress6 = readIpFile6()
var ipAddress7 = readIpFile7()
var ipAddress8 = readIpFile8()
var ipAddress9 = readIpFile9()
var ipAddress10 = readIpFile10()
var ipAddress11 = readIpFile11()
var ipAddress12 = readIpFile12()
var ipAddress13 = readIpFile13()
var ipAddress14 = readIpFile14()
var ipAddress15 = readIpFile15()

fun pingEngineAPI(ip: String): Boolean {
    val client = OkHttpClient()
    val formBody = FormBody.Builder()
        .add("ip", ip)
        .build()

    val request = Request.Builder()
        .url("http://xxxxxxxxx:8080/pingMotor") // API IP
        .post(formBody)
        .build()

    return try {
        val response = client.newCall(request).execute()
        val responseBody = response.body?.string()
        responseBody == "true"
    } catch (e: IOException) {
        println("Error in pingEngineAPI: ${e.message}")
        false
    }
}
// 701
suspend fun snmpTempEngineA(): String = withContext(Dispatchers.IO) {
    try {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("http://xxxxxxxxx:8080/snmpTempRequestA") // Temp API IP A
            .build()

        val response = client.newCall(request).execute()

        return@withContext response.body?.string() ?: ""
    } catch (e: IOException) {
        println("Error in snmpTempEngineA: ${e.message}")
        return@withContext ""
    }
}

suspend fun snmpHumidEngineA(): String = withContext(Dispatchers.IO) {
    try {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("http://xxxxxxxxx:8080/snmpHumidRequestA") // Humid API IP A
            .build()

        val response = client.newCall(request).execute()

        return@withContext response.body?.string() ?: ""
    } catch (e: IOException) {
        println("Error in snmpHumidEngineA: ${e.message}")
        return@withContext ""
    }
}

// BB
suspend fun snmpTempEngineB(): String = withContext(Dispatchers.IO) {
    try {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("http://xxxxxxxxx:8080/snmpTempRequestB") // Temp API IP B
            .build()

        val response = client.newCall(request).execute()

        return@withContext response.body?.string() ?: ""
    } catch (e: IOException) {
        println("Error in snmpTempEngineB: ${e.message}")
        return@withContext ""
    }
}

suspend fun snmpHumidEngineB(): String = withContext(Dispatchers.IO) {
    try {
        val client = OkHttpClient.Builder().build()
        val request = Request.Builder()
            .url("http://xxxxxxxxx:8080/snmpHumidRequestB") // Humid API IP B
            .build()

        val response = client.newCall(request).execute()

        return@withContext response.body?.string() ?: ""
    } catch (e: IOException) {
        println("Error in snmpHumidEngineB: ${e.message}")
        return@withContext ""
    }
}