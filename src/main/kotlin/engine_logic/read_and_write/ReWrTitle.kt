package engine_logic.read_and_write

import okio.IOException
import java.io.File

// Title handler
object TiFileManager {
    private const val RWT_PATH = "MTData/RWT"
    init { File(RWT_PATH).mkdirs() }
    fun writeTiToFile(ipTitle: String, index: Int) {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        try { file.writeText(ipTitle)
        } catch (e: IOException) {
            // println("${e.message}")
        }
    }
    fun readTiFile(index: Int): String {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        return try {
            file.readText()
        } catch (e: IOException) {
            // println("${e.message}")
            ""
        }
    }
}

/*
    fun writeTiToFile(ipTitle: String, index: Int) {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        try { file.writeText(ipTitle)
        } catch (e: IOException) {
            println("Error writing file: ${e.message}")
        }
    }

    fun readTiFile(index: Int): Result<String> {
        val fileName = "rwTi0$index.hdi"
        val file = File("$RWT_PATH/$fileName")
        return try { Result.success(file.readText())
        } catch (e: IOException) {
            Result.failure(e)
        }
    }
}
*/