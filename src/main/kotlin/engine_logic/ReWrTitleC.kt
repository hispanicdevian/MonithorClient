package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes Title value 08
fun readTiFile8(): String {
    return try {
        val file8 = File("rwTi08.hdi").readText()
        file8
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile8(ipTitle: String) {
    try {
        val file8 = File("rwTi08.hdi")
        file8.writeText(ipTitle)
        ipTitle08 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 09
fun readTiFile9(): String {
    return try {
        val file9 = File("rwTi09.hdi").readText()
        file9
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile9(ipTitle: String) {
    try {
        val file9 = File("rwTi09.hdi")
        file9.writeText(ipTitle)
        ipTitle09 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 10
fun readTiFile10(): String {
    return try {
        val file10 = File("rwTi10.hdi").readText()
        file10
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile10(ipTitle: String) {
    try {
        val file10 = File("rwTi10.hdi")
        file10.writeText(ipTitle)
        ipTitle10 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 11
fun readTiFile11(): String {
    return try {
        val file11 = File("rwTi11.hdi").readText()
        file11
    } catch (e: Exception) {
        ""
    }
}
fun writeTiToFile11(ipTitle: String) {
    try {
        val file11 = File("rwTi11.hdi")
        file11.writeText(ipTitle)
        ipTitle11 = ipTitle // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
