package engine_logic

import java.io.File

// 04
fun readIpFile4(): String {
    return try {
        val file4 = File("file4.txt").readText()
        file4
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile4(ipAddress: String) {
    try {
        val file4 = File("file4.txt")
        file4.writeText(ipAddress)
        ipAddress4 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 05
fun readIpFile5(): String {
    return try {
        val file5 = File("file5.txt").readText()
        file5
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile5(ipAddress: String) {
    try {
        val file5 = File("file5.txt")
        file5.writeText(ipAddress)
        ipAddress5 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 06
fun readIpFile6(): String {
    return try {
        val file6 = File("file6.txt").readText()
        file6
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile6(ipAddress: String) {
    try {
        val file6 = File("file6.txt")
        file6.writeText(ipAddress)
        ipAddress6 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

//07
fun readIpFile7(): String {
    return try {
        val file7 = File("file7.txt").readText()
        file7
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile7(ipAddress: String) {
    try {
        val file7 = File("file7.txt")
        file7.writeText(ipAddress)
        ipAddress7 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}