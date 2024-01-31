package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Save and Write A
fun saveFontSizeV1A(fontSize: Float) {
    try {
        val file0 = File("$SLF_PATH/fontSizeA.hdi")
        file0.parentFile?.mkdirs()
        file0.writeText(fontSize.toString())
        println("Font Size A saved successfully: $fontSize")
    } catch (e: Exception) {
        println("Error saving Font Size A: ${e.message}")
    }
}

fun loadFontSizeV1A(): Float {
    val file0 = File(SLF_PATH,"fontSizeA.hdi")
    return if (file0.exists()) {
        try {
            val fontSize = file0.readText().toFloat()
            println("Font Size A loaded: $fontSize")
            fontSize
        } catch (e: Exception) {
            println("Error loading Font Size A: ${e.message}")
            20.0f // Return default value if there's an error
        }
    } else {
        println("Font Size A file not found, returning default.")
        20.0f // Return default value if file doesn't exist
    }
}
