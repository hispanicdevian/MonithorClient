package engine_logic.read_and_write

import okio.IOException
import java.io.File

// Title handler
object ReWrTitle {
    private const val RWT_PATH = "MTData/RWT"
    init { File(RWT_PATH).mkdirs() // Ensure the directory exists
        // Create files if they do not exist
        for (i in  0 until  12) { // Number of files
            val fileName = "rwTi0$i.hdi"
            val file = File("${RWT_PATH}/$fileName")
            if (!file.exists()) {
                file.createNewFile() // Create the file if it does not exist
            }
        }
    }
    fun writeTiToFile(ipTitle: String, index: Int) {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        try { file.writeText(ipTitle)
        } catch (e: IOException) {
            println("Write title file error${e.message}")
        }
    }
    fun readTiFile(index: Int): String {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        return try {
            file.readText()
        } catch (e: IOException) {
            println("Read title error${e.message}")
            ""
        }
    }
}
