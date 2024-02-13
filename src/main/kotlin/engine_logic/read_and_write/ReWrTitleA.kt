package engine_logic.read_and_write

import engine_logic.*
import java.io.File

// Read/Write for PingSettingBoxesA.kt A0
fun writeTiToFile0(ipTitle: String) {
    try {
        val file0 = File("$RWT_PATH/rwTi00.hdi")
        file0.parentFile?.mkdirs()
        file0.writeText(ipTitle)
        ipTitle00 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile0(): String {
    return try {
        val file0 = File(RWT_PATH,"rwTi00.hdi").readText()
        file0
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesA.kt A1
fun writeTiToFile1(ipTitle: String) {
    try {
        val file1 = File("$RWT_PATH/rwTi01.hdi")
        file1.parentFile?.mkdirs()
        file1.writeText(ipTitle)
        ipTitle01 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile1(): String {
    return try {
        val file1 = File(RWT_PATH,"rwTi01.hdi").readText()
        file1
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesA.kt A2
fun writeTiToFile2(ipTitle: String) {
    try {
        val file2 = File("$RWT_PATH/rwTi02.hdi")
        file2.parentFile?.mkdirs()
        file2.writeText(ipTitle)
        ipTitle02 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile2(): String {
    return try {
        val file2 = File(RWT_PATH,"rwTi02.hdi").readText()
        file2
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesA.kt A3
fun writeTiToFile3(ipTitle: String) {
    try {
        val file3 = File("$RWT_PATH/rwTi03.hdi")
        file3.parentFile?.mkdirs()
        file3.writeText(ipTitle)
        ipTitle03 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
fun readTiFile3(): String {
    return try {
        val file3 = File(RWT_PATH,"rwTi03.hdi").readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
