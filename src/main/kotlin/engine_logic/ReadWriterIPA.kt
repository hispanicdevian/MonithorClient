package engine_logic

import java.io.File

// 00
fun readIpFile0(): String {
    return try {
        val file0 = File("file0.txt").readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile0(ipAddress: String) {
    try {
        val file0 = File("file0.txt")
        file0.writeText(ipAddress)
        ipAddress0 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 01
fun readIpFile1(): String {
    return try {
        val file1 = File("file1.txt").readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile1(ipAddress: String) {
    try {
        val file1 = File("file1.txt")
        file1.writeText(ipAddress)
        ipAddress1 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

// 02
fun readIpFile2(): String {
    return try {
        val file2 = File("file2.txt").readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile2(ipAddress: String) {
    try {
        val file2 = File("file2.txt")
        file2.writeText(ipAddress)
        ipAddress2 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}

//03
fun readIpFile3(): String {
    return try {
        val file3 = File("file3.txt").readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile3(ipAddress: String) {
    try {
        val file3 = File("file3.txt")
        file3.writeText(ipAddress)
        ipAddress3 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Handle exceptions
    }
}