package read_and_write

import engine_logic.*
import java.io.File

// Read/Write for PingSettingBoxesB.kt B4
fun writeTiToFile4(ipTitle: String) {
    try {
        val file4 = File("$RWT_PATH/rwTi04.hdi")
        file4.parentFile?.mkdirs()
        file4.writeText(ipTitle)
        ipTitle04 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile4(): String {
    return try {
        val file4 = File("$RWT_PATH/rwTi04.hdi").readText()
        file4
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesB.kt B5
fun writeTiToFile5(ipTitle: String) {
    try {
        val file5 = File("$RWT_PATH/rwTi05.hdi")
        file5.parentFile?.mkdirs()
        file5.writeText(ipTitle)
        ipTitle05 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile5(): String {
    return try {
        val file5 = File("$RWT_PATH/rwTi05.hdi").readText()
        file5
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesB.kt B6
fun writeTiToFile6(ipTitle: String) {
    try {
        val file6 = File("$RWT_PATH/rwTi06.hdi")
        file6.parentFile?.mkdirs()
        file6.writeText(ipTitle)
        ipTitle06 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile6(): String {
    return try {
        val file6 = File("$RWT_PATH/rwTi06.hdi").readText()
        file6
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesB.kt B7
fun writeTiToFile7(ipTitle: String) {
    try {
        val file7 = File("$RWT_PATH/rwTi07.hdi")
        file7.parentFile?.mkdirs()
        file7.writeText(ipTitle)
        ipTitle07 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile7(): String {
    return try {
        val file7 = File("$RWT_PATH/rwTi07.hdi").readText()
        file7
    } catch (e: Exception) {
        ""
    }
}
