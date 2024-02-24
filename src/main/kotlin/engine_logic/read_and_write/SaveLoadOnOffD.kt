package engine_logic.read_and_write

import java.io.File

// Save and Load On/Off state D
object SaveLoadOnOffD {
    private const val SLM_PATH = "MTData/SLM"
    private const val FILEPATH3 = "$SLM_PATH/msStateD.hdi"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityD(): List<Boolean> {
        val currentState = loadOnOffFileD()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true)
        }
    }

    fun loadOnOffFileD(): String {
        return try {
            File(FILEPATH3).readText()
        } catch (e: Exception) {
            ""
        }
    }

    fun saveVisibilityD(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileD(stateAsString)
    }

    private fun saveOnOffFileD(scState: String) {
        try {
            val onOffFileD = File(FILEPATH3)
            onOffFileD.writeText(scState)
        } catch (e: Exception) {
            // Log the exception
            e.printStackTrace()
        }
    }
}