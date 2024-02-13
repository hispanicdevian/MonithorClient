package custom_resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun smartText(scaleFactor: Float =  1f): TextUnit {
    val displayState = LocalWindowInfo.current.containerSize.height
    return when {
        displayState <=   525 -> (15 * scaleFactor).sp
        displayState in   526..725 ->  (25 * scaleFactor).sp
        displayState in   726..825 ->  (35 * scaleFactor).sp
        displayState in   826..1125 ->  (45 * scaleFactor).sp
        displayState in   1126..1325 ->  (55 * scaleFactor).sp
        displayState in   1326..1525 ->  (65 * scaleFactor).sp
        displayState >=   1527 ->  (85 * scaleFactor).sp
        else ->  (20 * scaleFactor).sp // Default size
    }
}