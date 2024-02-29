package engine_logic

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

// Weather API A
const val WEATHER_API_BASE_URL = "http://api.weatherapi.com/v1/current.json"
const val API_KEY = "API Key from https://www.weatherapi.com/ goes here"
val jsonA = Json { ignoreUnknownKeys = true }

@Serializable
data class WeatherDataA(val current: CurrentA? = null)

@Serializable
data class CurrentA(val tempC: Double? = null, val condition: ConditionA? = null)

@Serializable
data class ConditionA(val text: String? = null)

fun getCurrentTemperatureA(cityName: String): Pair<Double?, String?> = try {
    jsonA.decodeFromString<WeatherDataA>(OkHttpClient().newCall(buildRequestA(cityName)).execute().body?.string()
        ?: "").let { it.current?.tempC to it.current?.condition?.text }
} catch (e: IOException) {
    println("Weather call failed: ${e.message}")
    null to null
}

fun buildRequestA(cityNameA: String): Request =
    Request.Builder().url("$WEATHER_API_BASE_URL?key=$API_KEY&q=$cityNameA").build()

