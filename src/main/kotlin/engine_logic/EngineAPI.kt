package engine_logic

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
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

const val WEATHER_API_BASE_URL = "http://api.weatherapi.com/v1/current.json"
const val API_KEY = "api key goes here"
val json = Json { ignoreUnknownKeys = true }

@Serializable
data class WeatherData(val current: Current?)

@Serializable
data class Current(val temp_c: Double?, val condition: Condition?)

@Serializable
data class Condition(val text: String?)

fun getCurrentTemperature(cityName: String): Pair<Double?, String?> = try {
    json.decodeFromString<WeatherData>(OkHttpClient().newCall(buildRequest(cityName)).execute().body?.string()
        ?: "").let { it.current?.temp_c to it.current?.condition?.text }
} catch (e: IOException) {
    println("Error making API call: ${e.message}")
    null to null
}

fun buildRequest(cityName: String): Request =
    Request.Builder().url("$WEATHER_API_BASE_URL?key=$API_KEY&q=$cityName").build()
