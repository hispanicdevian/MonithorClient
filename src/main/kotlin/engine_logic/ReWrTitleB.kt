package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 04
fun readTiFile4(): String {
    return try {
        val file4 = File("rwTi04.hdi").readText()
        file4
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile4(ipTitle: String) {
    try {
        val file4 = File("rwTi04.hdi")
        file4.writeText(ipTitle)
        ipTitle04 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 05
fun readTiFile5(): String {
    return try {
        val file5 = File("rwTi05.hdi").readText()
        file5
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile5(ipTitle: String) {
    try {
        val file5 = File("rwTi05.hdi")
        file5.writeText(ipTitle)
        ipTitle05 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 06
fun readTiFile6(): String {
    return try {
        val file6 = File("rwTi06.hdi").readText()
        file6
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile6(ipTitle: String) {
    try {
        val file6 = File("rwTi06.hdi")
        file6.writeText(ipTitle)
        ipTitle06 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 07
fun readTiFile7(): String {
    return try {
        val file7 = File("rwTi07.hdi").readText()
        file7
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile7(ipTitle: String) {
    try {
        val file7 = File("rwTi07.hdi")
        file7.writeText(ipTitle)
        ipTitle07 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
