package engine_logic.read_and_write

import okio.IOException
import java.io.File

// IP handler
object IpFileManager {
    private const val RWI_PATH = "MTData/RWI"
    init { File(RWI_PATH).mkdirs() }
    fun writeIpToFile(ipAddress: String, index: Int) {
        val fileName = "rwIP0$index.hdi"
        val file = File("$RWI_PATH/$fileName")
        try { file.writeText(ipAddress)
        } catch (e: IOException) {
            // println("${e.message}")
        }
    }
    fun readIpFile(index: Int): String {
        val fileName = "rwIP0$index.hdi"
        val file = File("$RWI_PATH/$fileName")
        return try {
            file.readText()
        } catch (e: IOException) {
            // println("${e.message}")
            ""
        }
    }
}
