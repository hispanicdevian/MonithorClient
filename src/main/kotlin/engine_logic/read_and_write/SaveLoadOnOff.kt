package engine_logic.read_and_write

import java.io.File

// Save and Load On/Off state
object SaveLoadOnOff {
    private const val SLM_PATH = "MTData/SLM"
    private fun getFilePath(suffix: String) = "$SLM_PATH/msState$suffix.hdi"
    init { File(SLM_PATH).mkdirs() // Ensure the directory exists
        // Create files if they do not exist
        for (l in  'A'..'D') { // Number of files
            val fileName = "msState$l.hdi"
            val file = File("${SLM_PATH}/$fileName")
            if (!file.exists()) {
                file.createNewFile() // Create the file if it does not exist
            }
        }
    }
    private fun loadOnOffFile(filePath: String): String {
        return try {
            File(filePath).readText()
        } catch (e: Exception) {
            println("Load on/off file error${e.message}")
            ""
        }
    }

    private fun saveOnOffFile(filePath: String, scState: String) {
        try {
            val onOffFile = File(filePath)
            onOffFile.writeText(scState)
        } catch (e: Exception) {
            println("Save on/off file error${e.message}")
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