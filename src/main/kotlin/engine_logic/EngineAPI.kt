package engine_logic

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

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

//////////////////////////////////////////////////////////// Weather API A
const val WEATHER_API_BASE_URLA = "http://api.weatherapi.com/v1/current.json"
const val API_KEYA = "API Key from https://www.weatherapi.com/ goes here"
val jsonA = Json { ignoreUnknownKeys = true }

@Serializable
data class WeatherDataA(val current: CurrentA? = null)

@Serializable
data class CurrentA(val temp_c: Double? = null, val condition: ConditionA? = null)

@Serializable
data class ConditionA(val text: String? = null)

fun getCurrentTemperatureA(cityName: String): Pair<Double?, String?> = try {
    jsonA.decodeFromString<WeatherDataA>(OkHttpClient().newCall(buildRequestA(cityName)).execute().body?.string()
        ?: "").let { it.current?.temp_c to it.current?.condition?.text }
} catch (e: IOException) {
    println("Error making API call: ${e.message}")
    null to null
}

fun buildRequestA(cityNameA: String): Request =
    Request.Builder().url("$WEATHER_API_BASE_URLA?key=$API_KEYA&q=$cityNameA").build()

//////////////////////////////////////////////////////////// Weather API B
const val WEATHER_API_BASE_URLB = "http://api.weatherapi.com/v1/current.json"
const val API_KEYB = "API Key from https://www.weatherapi.com/ goes here"
private val clientB = OkHttpClient()
private val jsonB = Json { ignoreUnknownKeys = true }

@Serializable
data class WeatherDataB(val current: CurrentB?)

@Serializable
data class CurrentB(val temp_c: Double?, val condition: ConditionB?)

@Serializable
data class ConditionB(val text: String?)

fun getCurrentTemperatureB(cityName: String): Pair<Double?, String?> = try {
    val response = clientB.newCall(buildRequestB(cityName)).execute()
    val body = response.body?.string() ?: ""
    val weatherData = jsonB.decodeFromString<WeatherDataB>(body)
    weatherData.current?.temp_c to weatherData.current?.condition?.text
} catch (e: IOException) {
    println("Error making API call: ${e.message}")
    null to null
}

fun buildRequestB(cityNameB: String): Request =
    Request.Builder().url("$WEATHER_API_BASE_URLB?key=$API_KEYB&q=$cityNameB").build()
