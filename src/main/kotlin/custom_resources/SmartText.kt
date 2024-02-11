package custom_resources

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.WindowState

// This right here is what you need; make sure to pass the value from /Main.kt/windowsState/initialWindowState
fun smartText(windowState: WindowState): TextUnit {
    val displayState = windowState.size.height

    return when {
        displayState <= 720.dp -> 25.sp
        displayState in 730.dp..820.dp -> 30.sp
        displayState >= 830.dp -> 40.sp
        else -> 20.sp // Default size
    }
}

/*
fun smartText(windowState: WindowState): TextUnit {
    val displayState = windowState.size.height

    val textSize = when {
        displayState <=  720.dp ->  25.sp
        displayState in  730.dp..820.dp ->  30.sp
        displayState >=  830.dp ->  40.sp
        else ->  20.sp // Default size
    }
    return textSize
}
 */