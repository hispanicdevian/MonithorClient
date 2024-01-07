package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 04
fun readIpFile4(): String {
    return try {
        val file4 = File("rwIP04.hdi").readText()
        file4
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile4(ipAddress: String) {
    try {
        val file4 = File("rwIP04.hdi")
        file4.writeText(ipAddress)
        ipAddress4 = ipAddress // Update the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 05
fun readIpFile5(): String {
    return try {
        val file5 = File("rwIP05.hdi").readText()
        file5
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile5(ipAddress: String) {
    try {
        val file5 = File("rwIP05.hdi")
        file5.writeText(ipAddress)
        ipAddress5 = ipAddress // Update the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 06
fun readIpFile6(): String {
    return try {
        val file6 = File("rwIP06.hdi").readText()
        file6
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile6(ipAddress: String) {
    try {
        val file6 = File("rwIP06.hdi")
        file6.writeText(ipAddress)
        ipAddress6 = ipAddress // Update the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 07
fun readIpFile7(): String {
    return try {
        val file7 = File("rwIP07.hdi").readText()
        file7
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile7(ipAddress: String) {
    try {
        val file7 = File("rwIP07.hdi")
        file7.writeText(ipAddress)
        ipAddress7 = ipAddress // Updates the in-memory value
    } catch (e: Exception) { // Log the exception
        e.printStackTrace()
    }
}
