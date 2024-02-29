package engine_logic.read_and_write

import okio.IOException
import java.io.File

// IP handler
object ReadWriterIP {
    private const val RWI_PATH = "MTData/RWI"
    init { File(RWI_PATH).mkdirs() // Ensure the directory exists
        // Create files if they do not exist
        for (i in  0 until  12) { // Number of files
            val fileName = "rwIP0$i.hdi"
            val file = File("$RWI_PATH/$fileName")
            if (!file.exists()) {
                file.createNewFile() // Create the file if it does not exist
            }
        }
    }
    fun writeIpToFile(ipAddress: String, index: Int) {
        val fileName = "rwIP0$index.hdi"
        val file = File("$RWI_PATH/$fileName")
        try { file.writeText(ipAddress)
        } catch (e: IOException) {
            println("Write ip file error${e.message}")
        }
    }
    fun readIpFile(index: Int): String {
        val fileName = "rwIP0$index.hdi"
        val file = File("$RWI_PATH/$fileName")
        return try {
            file.readText()
        } catch (e: IOException) {
            println("Read ip error${e.message}")
            ""
        }
    }
}
