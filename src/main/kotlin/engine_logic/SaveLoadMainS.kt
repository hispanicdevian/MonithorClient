package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Save and Load A
object SLOnOffHandlerA {
    private const val FILE_NAME0 = "msStateA.hdi"
    private const val FILEPATH0 = "$SLM_PATH/$FILE_NAME0"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityListA(): List<Boolean> {
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

    fun saveVisibilityListA(visibilityList: List<Boolean>) {
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
//////////////////////////////////////////////////////////// Save and Load B
object SLOnOffHandlerB {
    private const val FILE_NAME1 = "msStateB.hdi"
    private const val FILEPATH1 = "$SLM_PATH/$FILE_NAME1"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityListB(): List<Boolean> {
        val currentState = SLOnOffHandlerA.loadOnOffFileA()
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

    fun saveVisibilityListB(visibilityList: List<Boolean>) {
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
//////////////////////////////////////////////////////////// Save and Load C
object SLOnOffHandlerC {
    private const val FILE_NAME2 = "msStateC.hdi"
    private const val FILEPATH2 = "$SLM_PATH/$FILE_NAME2"

    init {
        File(SLM_PATH).mkdirs()
    }

    fun loadVisibilityListC(): List<Boolean> {
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

    fun saveVisibilityListC(visibilityList: List<Boolean>) {
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