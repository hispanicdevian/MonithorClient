package engine_logic.read_and_write

import java.io.File

const val SLM_PATH = "MTData/SLM"

// Save and Load On/Off state
object SLOnOffManager {
    private fun getFilePath(suffix: String) = "$SLM_PATH/msState$suffix.hdi"
    init { File(SLM_PATH).mkdirs() }
    private fun loadOnOffFile(filePath: String): String {
        return try {
            File(filePath).readText()
        } catch (e: Exception) {
            ""
        }
    }

    private fun saveOnOffFile(filePath: String, scState: String) {
        try {
            val onOffFile = File(filePath)
            onOffFile.writeText(scState)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun loadVisibility(suffix: String): List<Boolean> {
        val currentState = loadOnOffFile(getFilePath(suffix))
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            if (suffix == "D") listOf(true, true) else listOf(true, true, true, true)
        }
    }

    fun saveVisibility(suffix: String, visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFile(getFilePath(suffix), stateAsString)
    }
}