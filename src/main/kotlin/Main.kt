import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.misc.olrScn
import views.mainScreen

// Starts in default screen size
fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        olrScn("olr")
    }
}

// Start in full screen size
/*
fun main() {
    application {
        val windowState = rememberWindowState(size = DpSize.Unspecified)
        Window(onCloseRequest = ::exitApplication) {
            mainScreen()
            hdiScn("\uD83C\uDF35hdi\uD83C\uDF35")
        }
    }
}
*/