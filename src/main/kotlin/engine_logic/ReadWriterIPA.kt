package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 00
fun writeIpToFile0(ipAddress: String) {
    try {
        val file0 = File("$RWI_PATH/rwIP00.hdi")
        file0.parentFile?.mkdirs()
        file0.writeText(ipAddress)
        ipAddress0 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile0(): String {
    return try {
        val file0 = File("$RWI_PATH/rwIP00.hdi").readText()
        file0
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for Boxes IPs value 01
fun writeIpToFile1(ipAddress: String) {
    try {
        val file1 = File("$RWI_PATH/rwIP01.hdi")
        file1.parentFile?.mkdirs()
        file1.writeText(ipAddress)
        ipAddress1 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile1(): String {
    return try {
        val file1 = File("$RWI_PATH/rwIP01.hdi").readText()
        file1
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 02
fun writeIpToFile2(ipAddress: String) {
    try {
        val file2 = File("$RWI_PATH/rwIP02.hdi")
        file2.parentFile?.mkdirs()
        file2.writeText(ipAddress)
        ipAddress2 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile2(): String {
    return try {
        val file2 = File("$RWI_PATH/rwIP02.hdi").readText()
        file2
    } catch (e: Exception) {
        ""
    }
}
//////////////////////////////////////////////////////////// Read/Write File for IPs value, Boxes 03
fun writeIpToFile3(ipAddress: String) {
    try {
        val file3 = File("$RWI_PATH/rwIP03.hdi")
        file3.parentFile?.mkdirs()
        file3.writeText(ipAddress)
        ipAddress3 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile3(): String {
    return try {
        val file3 = File("$RWI_PATH/rwIP03.hdi").readText()
        file3
    } catch (e: Exception) {
        ""
    }
}
