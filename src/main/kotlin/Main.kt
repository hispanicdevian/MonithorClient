import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import custom_resources.hdiScn
import views.mainScreen

////////////////////////////// Starts in default screen size
fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
        hdiScn("\uD83C\uDF35hdi\uD83C\uDF35")
    }
}

////////////////////////////// Start in full screen size
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