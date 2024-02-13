package engine_logic.read_and_write

import engine_logic.SLF_PATH
import java.io.File

////////////////////////////// Saves and loads the selected font size
object SLFObjectA {
    private const val PATH0 = "$SLF_PATH/fontSizeA.hdi"
    fun saveFontSizeA(fontSize: Float) {

        try {
            val file0 = File(PATH0)
            file0.parentFile?.mkdirs()
            file0.writeText(fontSize.toString())
            println("saveFontSizeA successful $fontSize")
        } catch (e: Exception) {
            println("saveFontSizeA Error!: ${e.message}")
        }
    }

    fun loadFontSizeA(): Float {
        val file0 = File(PATH0)
        return if (file0.exists()) {
            try {
                val fontSize = file0.readText().toFloat()
                println("loadFontSizeA: $fontSize")
                fontSize
            } catch (e: Exception) {
                println("Error, back to font 20: ${e.message}")
                20.0f // Return default value if null
            }
        } else {
            println("Default font 20")
            20.0f // Return default value if null
        }
    }
}