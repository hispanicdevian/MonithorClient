package engine_logic

import java.io.File

// 12
fun readIpFile12(): String {
    return try {
        val file12 = File("file12.txt").readText()
        file12
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile12(ipAddress: String) {
    try {
        val file12 = File("file12.txt")
        file12.writeText(ipAddress)
        ipAddress12 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 13
fun readIpFile13(): String {
    return try {
        val file13 = File("file13.txt").readText()
        file13
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile13(ipAddress: String) {
    try {
        val file13 = File("file13.txt")
        file13.writeText(ipAddress)
        ipAddress13 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 14
fun readIpFile14(): String {
    return try {
        val file14 = File("file14.txt").readText()
        file14
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile14(ipAddress: String) {
    try {
        val file14 = File("file14.txt")
        file14.writeText(ipAddress)
        ipAddress14 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 15
fun readIpFile15(): String {
    return try {
        val file15 = File("file15.txt").readText()
        file15
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile15(ipAddress: String) {
    try {
        val file15 = File("file15.txt")
        file15.writeText(ipAddress)
        ipAddress15 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}