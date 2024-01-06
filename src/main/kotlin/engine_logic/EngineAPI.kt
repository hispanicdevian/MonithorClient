package engine_logic

import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


//////////////////////////////////////////////////////////// IP List that passes into the APIs function
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

//////////////////////////////////////////////////////////// Ping API (Adjust to match APIs IP address)
fun pingEngineAPI(ip: String): Boolean {
    val client = OkHttpClient()
    val formBody = FormBody.Builder()
        .add("ip", ip)
        .build()

    val request = Request.Builder()
        .url("http://192.168.:8080/pingMotor") // API IP
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

//////////////////////////////////////////////////////////// Weather API