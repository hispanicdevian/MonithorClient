package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 08
fun readIpFile8(): String {
    return try {
        val file8 = File("rwIP08.hdi").readText()
        file8
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile8(ipAddress: String) {
    try {
        val file8 = File("rwIP08.hdi")
        file8.writeText(ipAddress)
        ipAddress8 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 09
fun readIpFile9(): String {
    return try {
        val file9 = File("rwIP09.hdi").readText()
        file9
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile9(ipAddress: String) {
    try {
        val file9 = File("rwIP09.hdi")
        file9.writeText(ipAddress)
        ipAddress9 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 10
fun readIpFile10(): String {
    return try {
        val file10 = File("rwIP10.hdi").readText()
        file10
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile10(ipAddress: String) {
    try {
        val file10 = File("rwIP10.hdi")
        file10.writeText(ipAddress)
        ipAddress10 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 11
fun readIpFile11(): String {
    return try {
        val file11 = File("rwIP11.hdi").readText()
        file11
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile11(ipAddress: String) {
    try {
        val file11 = File("rwIP11.hdi")
        file11.writeText(ipAddress)
        ipAddress11 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
