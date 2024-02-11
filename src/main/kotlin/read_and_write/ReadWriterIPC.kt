package read_and_write

import engine_logic.*
import java.io.File

// Read/Write for PingSettingBoxesC.kt C8
fun writeIpToFile8(ipAddress: String) {
    try {
        val file8 = File("$RWI_PATH/rwIP08.hdi")
        file8.parentFile?.mkdirs()
        file8.writeText(ipAddress)
        ipAddress8 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile8(): String {
    return try {
        val file8 = File("$RWI_PATH/rwIP08.hdi").readText()
        file8
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesC.kt C9
fun writeIpToFile9(ipAddress: String) {
    try {
        val file9 = File("$RWI_PATH/rwIP09.hdi")
        file9.writeText(ipAddress)
        ipAddress9 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile9(): String {
    return try {
        val file9 = File("$RWI_PATH/rwIP09.hdi").readText()
        file9
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesC.kt C10
fun writeIpToFile10(ipAddress: String) {
    try {
        val file10 = File("$RWI_PATH/rwIP10.hdi")
        file10.writeText(ipAddress)
        ipAddress10 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile10(): String {
    return try {
        val file10 = File("$RWI_PATH/rwIP10.hdi").readText()
        file10
    } catch (e: Exception) {
        ""
    }
}

// Read/Write for PingSettingBoxesC.kt C11
fun writeIpToFile11(ipAddress: String) {
    try {
        val file11 = File("$RWI_PATH/rwIP11.hdi")
        file11.writeText(ipAddress)
        ipAddress11 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile11(): String {
    return try {
        val file11 = File("$RWI_PATH/rwIP11.hdi").readText()
        file11
    } catch (e: Exception) {
        ""
    }
}
