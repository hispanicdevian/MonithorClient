import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import views.mainScreen

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        mainScreen()
    }
}

// to start in full screen mode
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