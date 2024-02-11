import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import custom_resources.olrScn
import custom_resources.smartText
import views.mainScreen

// Starts in default screen size
fun main() = application {
    val initialWindowState = rememberWindowState()
    val windowState by remember { mutableStateOf(initialWindowState) }
    Window(onCloseRequest = ::exitApplication, state = initialWindowState) {
        mainScreen()
        olrScn("\uD83C\uDF35olr")
        smartText(windowState)
    }
}

// Start in full screen size
/*
fun main() {
    application {
        val windowState = rememberWindowState(size = DpSize.Unspecified)
        Window(onCloseRequest = ::exitApplication, state = windowState) {
            mainScreen()
            hdiScn("\uD83C\uDF35hdi\uD83C\uDF35")
        }
    }
}
*/