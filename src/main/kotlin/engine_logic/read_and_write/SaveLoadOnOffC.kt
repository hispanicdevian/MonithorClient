package engine_logic.read_and_write

import java.io.File

// Save and Load On/Off state C
object SaveLoadOnOffC {
    private const val SLM_PATH = "MTData/SLM"
    private const val FILEPATH2 = "$SLM_PATH/msStateC.hdi"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityC(): List<Boolean> {
        val currentState = loadOnOffFileC()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun loadOnOffFileC(): String {
        return try {
            File(FILEPATH2).readText()
        } catch (e: Exception) {
            ""
        }
    }

    fun saveVisibilityC(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileC(stateAsString)
    }

    private fun saveOnOffFileC(scState: String) {
        try {
            val onOffFileC = File(FILEPATH2)
            onOffFileC.writeText(scState)
        } catch (e: Exception) {
            // Log the exception
            e.printStackTrace()
        }
    }
}