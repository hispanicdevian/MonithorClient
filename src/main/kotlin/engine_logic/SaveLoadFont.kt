package engine_logic

import java.io.File

//////////////////////////////////////////////////////////// Save and Write A
fun saveFontSizeV1A(fontSize: Float) {
    try {
        val file = File("fontSizeA.hdi")
        file.writeText(fontSize.toString())
        println("Font Size A saved successfully: $fontSize")
    } catch (e: Exception) {
        println("Error saving Font Size A: ${e.message}")
    }
}

fun loadFontSizeV1A(): Float {
    val file = File("fontSizeA.hdi")
    return if (file.exists()) {
        try {
            val fontSize = file.readText().toFloat()
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
//////////////////////////////////////////////////////////// Save and Write B
fun saveFontSizeV1B(fontSize: Float) {
    val file = File("fontSizeB.hdi")
    file.writeText(fontSize.toString())
}

fun loadFontSizeV1B(): Float {
    val file = File("fontSizeB.hdi")
    return if (file.exists()) {
        file.readText().toFloat()
    } else {
        20.0f
    }
}
//////////////////////////////////////////////////////////// Save and Write C
fun saveFontSizeV1C(fontSize: Float) {
    val file = File("fontSizeC.hdi")
    file.writeText(fontSize.toString())
}

fun loadFontSizeV1C(): Float {
    val file = File("fontSizeC.hdi")
    return if (file.exists()) {
        file.readText().toFloat()
    } else {
        20.0f
    }
}
//////////////////////////////////////////////////////////// Save and Write D
fun saveFontSizeV1D(fontSize: Float) {
    val file = File("fontSizeD.hdi")
    file.writeText(fontSize.toString())
}

fun loadFontSizeV1D(): Float {
    val file = File("fontSizeD.hdi")
    return if (file.exists()) {
        file.readText().toFloat()
    } else {
        20.0f
    }
}
