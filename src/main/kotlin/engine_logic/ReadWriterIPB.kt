package engine_logic

import java.io.File

////////////////////////////// Read/Write for PingSettingBoxesB.kt B4
fun writeIpToFile4(ipAddress: String) {
    try {
        val file4 = File("$RWI_PATH/rwIP04.hdi")
        file4.parentFile?.mkdirs()
        file4.writeText(ipAddress)
        ipAddress4 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile4(): String {
    return try {
        val file4 = File("$RWI_PATH/rwIP04.hdi").readText()
        file4
    } catch (e: Exception) {
        ""
    }
}

////////////////////////////// Read/Write for PingSettingBoxesB.kt B5
fun writeIpToFile5(ipAddress: String) {
    try {
        val file5 = File("$RWI_PATH/rwIP05.hdi")
        file5.parentFile?.mkdirs()
        file5.writeText(ipAddress)
        ipAddress5 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile5(): String {
    return try {
        val file5 = File("$RWI_PATH/rwIP05.hdi").readText()
        file5
    } catch (e: Exception) {
        ""
    }
}

////////////////////////////// Read/Write for PingSettingBoxesB.kt B6
fun writeIpToFile6(ipAddress: String) {
    try {
        val file6 = File("$RWI_PATH/rwIP06.hdi")
        file6.parentFile?.mkdirs()
        file6.writeText(ipAddress)
        ipAddress6 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile6(): String {
    return try {
        val file6 = File("$RWI_PATH/rwIP06.hdi").readText()
        file6
    } catch (e: Exception) {
        ""
    }
}

////////////////////////////// Read/Write for PingSettingBoxesB.kt B7
fun writeIpToFile7(ipAddress: String) {
    try {
        val file7 = File("$RWI_PATH/rwIP07.hdi")
        file7.parentFile?.mkdirs()
        file7.writeText(ipAddress)
        ipAddress7 = ipAddress // Update the in-memory value
    } catch (e: Exception) {
        // Log the exception
        e.printStackTrace()
    }
}
fun readIpFile7(): String {
    return try {
        val file7 = File("$RWI_PATH/rwIP07.hdi").readText()
        file7
    } catch (e: Exception) {
        ""
    }
}
