package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 00
fun readIpFile0(): String {
    return try {
        val file0 = File("rwIP00.hdi").readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile0(ipAddress: String) {
    try {
        val file0 = File("rwIP00.hdi")
        file0.writeText(ipAddress)
        ipAddress0 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 01
fun readIpFile1(): String {
    return try {
        val file1 = File("rwIP01.hdi").readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile1(ipAddress: String) {
    try {
        val file1 = File("rwIP01.hdi")
        file1.writeText(ipAddress)
        ipAddress1 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 02
fun readIpFile2(): String {
    return try {
        val file2 = File("rwIP02.hdi").readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile2(ipAddress: String) {
    try {
        val file2 = File("rwIP02.hdi")
        file2.writeText(ipAddress)
        ipAddress2 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}

//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 03
fun readIpFile3(): String {
    return try {
        val file3 = File("rwIP03.hdi").readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
fun writeIpToFile3(ipAddress: String) {
    try {
        val file3 = File("rwIP03.hdi")
        file3.writeText(ipAddress)
        ipAddress3 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
