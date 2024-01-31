package mainscreen_boxes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.CustomGrayA
import custom_resources.MainColorA
import engine_logic.Navi
import engine_logic.SLFObjectA.loadFontSizeA
import engine_logic.SLOnOffObjectD.loadOnOffFileD
import sub_views.settingFontSize
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes
import views.settingScreen

////////////////////////////// Weather boxes shown in the last column of the main screen
@Composable
fun weatherBoxesA(currentTempA: String, currentSkyA: String) {
    val currentWeatherListA = listOf(currentTempA, currentSkyA)
// Ram for active View/Screen
    val currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }
// Font size ram
    val loadedFontSize by remember { mutableStateOf(loadFontSizeA()) }
    val fontSizedA = if (loadedFontSize < 1) { // adds 20 if value less than 1, but adds 20 if higher than 1
        loadedFontSize
    } else {
        loadedFontSize + 12
    }

/////////////// Loads the last state of On/Off settings
    val visibilityList = remember {
        val currentState = loadOnOffFileD()
        if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.toBoolean() }
        } else {
            listOf(true, true)
        }
    }

////////////////////////////// UI container
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
/////////////// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
/////////////// Creates boxes based on # of titles, and its visibility based on settings file
                for (index in currentWeatherListA.indices) {
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
                                    text = currentWeatherListA[index],
                                    color = CustomGrayA,
                                    fontSize = fontSizedA.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
/////////////// Navi tail
            Navi.SettingFontSz -> settingFontSize()
            Navi.SettingOnOffBxs -> settingOnOffBoxes()
            Navi.SettingPingBxs -> settingPingBoxes()
            Navi.SettingScn -> settingScreen()
        }
    }
}
