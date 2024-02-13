package engine_logic.read_and_write

import engine_logic.SLM_PATH
import java.io.File

////////////////////////////// Save and Load On/Off state A
object SLOnOffObjectA {
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

////////////////////////////// Save and Load On/Off state B
object SLOnOffObjectB {
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

////////////////////////////// Save and Load On/Off state C
object SLOnOffObjectC {
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

////////////////////////////// Save and Load On/Off state D
object SLOnOffObjectD {
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
