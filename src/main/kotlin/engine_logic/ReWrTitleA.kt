package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 00
fun readTiFile0(): String {
    return try {
        val file0 = File("rwTi00.hdi").readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile0(ipTitle: String) {
    try {
        val file0 = File("rwTi00.hdi")
        file0.writeText(ipTitle)
        ipTitle00 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 01
fun readTiFile1(): String {
    return try {
        val file1 = File("rwTi01.hdi").readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile1(ipTitle: String) {
    try {
        val file1 = File("rwTi01.hdi")
        file1.writeText(ipTitle)
        ipTitle01 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 02
fun readTiFile2(): String {
    return try {
        val file2 = File("rwTi02.hdi").readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile2(ipTitle: String) {
    try {
        val file2 = File("rwTi02.hdi")
        file2.writeText(ipTitle)
        ipTitle02 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 03
fun readTiFile3(): String {
    return try {
        val file3 = File("rwTi03.hdi").readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile3(ipTitle: String) {
    try {
        val file3 = File("rwTi03.hdi")
        file3.writeText(ipTitle)
        ipTitle03 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
