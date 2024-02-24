package engine_logic.read_and_write

import java.io.File

// Save and Load On/Off state A
object SaveLoadOnOffA {
    private const val SLM_PATH = "MTData/SLM"
    private const val FILEPATH0 = "$SLM_PATH/msStateA.hdi"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityA(): List<Boolean> {
        val currentState = loadOnOffFileA()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun loadOnOffFileA(): String {
        return try {
            File(FILEPATH0).readText()
        } catch (e: Exception) {
            ""
        }
    }

    fun saveVisibilityA(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileA(stateAsString)
    }

    private fun saveOnOffFileA(scState: String) {
        try {
            val onOffFileA = File(FILEPATH0)
            onOffFileA.writeText(scState)
        } catch (e: Exception) {
            // Log the exception
            e.printStackTrace()
        }
    }
}
