package engine_logic.read_and_write

import java.io.File

// Save and Load On/Off state B
object SaveLoadOnOffB {
    private const val SLM_PATH = "MTData/SLM"
    private const val FILEPATH1 = "$SLM_PATH/msStateB.hdi"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityB(): List<Boolean> {
        val currentState = loadOnOffFileB()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun loadOnOffFileB(): String {
        return try {
            File(FILEPATH1).readText()
        } catch (e: Exception) {
            ""
        }
    }

    fun saveVisibilityB(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileB(stateAsString)
    }

    private fun saveOnOffFileB(scState: String) {
        try {
            val onOffFileB = File(FILEPATH1)
            onOffFileB.writeText(scState)
        } catch (e: Exception) {
            // Log the exception
            e.printStackTrace()
        }
    }
}