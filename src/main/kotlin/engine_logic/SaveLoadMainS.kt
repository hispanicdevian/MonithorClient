package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Save and Load A
object SLOnOffHandlerA {
    private const val FILEPATH0 = "msStateA.hdi"

    fun loadVisibilityListA(): List<Boolean> {
        val currentState = loadOnOffFileA()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun saveVisibilityListA(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileA(stateAsString)
    }

    fun loadOnOffFileA(): String {
        return try {
            File(FILEPATH0).readText()
        } catch (e: Exception) {
            ""
        }
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
    private const val FILEPATH1 = "msStateB.hdi"

    fun loadVisibilityListB(): List<Boolean> {
        val currentState = loadOnOffFileB()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun saveVisibilityListB(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileB(stateAsString)
    }

    fun loadOnOffFileB(): String {
        return try {
            File(FILEPATH1).readText()
        } catch (e: Exception) {
            ""
        }
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
    private const val FILEPATH2 = "msStateC.hdi"

    fun loadVisibilityListC(): List<Boolean> {
        val currentState = loadOnOffFileC()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun saveVisibilityListC(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileC(stateAsString)
    }

    fun loadOnOffFileC(): String {
        return try {
            File(FILEPATH2).readText()
        } catch (e: Exception) {
            ""
        }
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

//////////////////////////////////////////////////////////// Save and Load D
object SLOnOffHandlerD {
    private const val FILEPATH3 = "msStateD.hdi"

    fun loadVisibilityListD(): List<Boolean> {
        val currentState = loadOnOffFileD()
        return if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.trim().toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

    fun saveVisibilityListD(visibilityList: List<Boolean>) {
        val stateAsString = visibilityList.joinToString(",")
        saveOnOffFileD(stateAsString)
    }

    fun loadOnOffFileD(): String {
        return try {
            File(FILEPATH3).readText()
        } catch (e: Exception) {
            ""
        }
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