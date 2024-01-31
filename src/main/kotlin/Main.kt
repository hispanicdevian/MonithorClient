import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.watermarkScreen
import views.mainScreen

//////////////////////////////////////////////////////////// Start Normal Screen Mode
fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        watermarkScreen("hdi\uD83C\uDF35")
    }
}

//////////////////////////////////////////////////////////// Start Full Screen Mode
/*
fun main() {
    application {
        val windowState = rememberWindowState(size = DpSize.Unspecified)
        Window(onCloseRequest = ::exitApplication, state = windowState) {
            mainScreen()
        }
    }
}
*/