package engine_logic

import java.io.File

// 08
fun readIpFile8(): String {
    return try {
        val file8 = File("file8.txt").readText()
        file8
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile8(ipAddress: String) {
    try {
        val file8 = File("file8.txt")
        file8.writeText(ipAddress)
        ipAddress8 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 09
fun readIpFile9(): String {
    return try {
        val file9 = File("file9.txt").readText()
        file9
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile9(ipAddress: String) {
    try {
        val file9 = File("file9.txt")
        file9.writeText(ipAddress)
        ipAddress9 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 10
fun readIpFile10(): String {
    return try {
        val file10 = File("file10.txt").readText()
        file10
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile10(ipAddress: String) {
    try {
        val file10 = File("file10.txt")
        file10.writeText(ipAddress)
        ipAddress10 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 11
fun readIpFile11(): String {
    return try {
        val file11 = File("file11.txt").readText()
        file11
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile11(ipAddress: String) {
    try {
        val file11 = File("file11.txt")
        file11.writeText(ipAddress)
        ipAddress11 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}