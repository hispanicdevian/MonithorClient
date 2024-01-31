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
//////////////////////////////////////////////////////////// Save and Write B
fun saveFontSizeV1B(fontSize: Float) {
    val file1 = File("$SLF_PATH/fontSizeB.hdi")
    file1.parentFile?.mkdirs()
    file1.writeText(fontSize.toString())
}

fun loadFontSizeV1B(): Float {
    val file1 = File(SLF_PATH,"fontSizeB.hdi")
    return if (file1.exists()) {
        file1.readText().toFloat()
    } else {
        20.0f
    }
}
//////////////////////////////////////////////////////////// Save and Write C
fun saveFontSizeV1C(fontSize: Float) {
    val file2 = File("$SLF_PATH/fontSizeC.hdi")
    file2.parentFile?.mkdirs()
    file2.writeText(fontSize.toString())
}

fun loadFontSizeV1C(): Float {
    val file2 = File(SLF_PATH,"fontSizeC.hdi")
    return if (file2.exists()) {
        file2.readText().toFloat()
    } else {
        20.0f
    }
}
//////////////////////////////////////////////////////////// Save and Write D
fun saveFontSizeV1D(fontSize: Float) {
    val file3 = File("$SLF_PATH/fontSizeD.hdi")
    file3.parentFile?.mkdirs()
    file3.writeText(fontSize.toString())
}

fun loadFontSizeV1D(): Float {
    val file3 = File(SLF_PATH,"fontSizeD.hdi")
    return if (file3.exists()) {
        file3.readText().toFloat()
    } else {
        20.0f
    }
}