package mainscreen_boxes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.CustomGrayA
import custom_resources.MainColorA
import engine_logic.Navi
import engine_logic.SLOnOffHandlerA
import engine_logic.loadFontSizeV1A

//////////////////////////////////////////////////////////// Weather boxes shown in the last column of the main screen
@Composable
fun weatherBoxesA() {

// Ram for active View/Screen
    val currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }
// Font size ram
    val fontSizedA by remember { mutableStateOf(loadFontSizeV1A().sp) }
// Loads the last state of On/Off settings
    val visibilityList = remember {
        val currentState = SLOnOffHandlerA.loadOnOffFileA()
        if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }
//////////////////////////////////////////////////////////// UI container
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
//////////////////////////////////////////////////////////// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
////////////////////////////// Creates boxes based on # of titles, and its visibility based on settings file
                for (index in titleList.indices) {
                    if (visibilityList[index]) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1.5f)
                                .background(MainColorA, shape = AbsoluteRoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = currentTemperature,
                                    color = CustomGrayA,
                                    fontWeight = FontWeight.W900,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }

            Navi.SettingFontSz -> TODO()
            Navi.SettingOnOffBxs -> TODO()
            Navi.SettingPingBxs -> TODO()
            Navi.SettingScn -> TODO()
        }
    }
}