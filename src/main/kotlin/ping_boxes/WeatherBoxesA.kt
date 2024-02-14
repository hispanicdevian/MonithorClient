package ping_boxes

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
import custom_resources.ErgoGray
import custom_resources.TurquoiseColor
import custom_resources.smartText
import engine_logic.Navi
import engine_logic.read_and_write.SLOnOffObjectD.loadOnOffFileD
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes
import views.settingScreen

// Weather boxes shown in the last column of the main screen
@Composable
fun weatherBoxesA(currentTempA: String, currentSkyA: String) {
    val currentWeatherListA = listOf(currentTempA, currentSkyA)
// Ram for active View/Screen
    val currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }

// Load and save on/off state D
    val visibilityList = remember {
        val currentState = loadOnOffFileD()
        if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.toBoolean() }
        } else {
            listOf(true, true)
        }
    }
// UI container
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
// Creates boxes based on # of titles, and its visibility based on settings file
                for (index in currentWeatherListA.indices) {
                    if (visibilityList[index]) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1.5f)
                                .background(TurquoiseColor, shape = AbsoluteRoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = currentWeatherListA[index],
                                    color = ErgoGray,
                                    fontSize = smartText(1f),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
// Navi tail
            Navi.SettingOnOffBxs -> settingOnOffBoxes()
            Navi.SettingPingBxs -> settingPingBoxes()
            Navi.SettingScn -> settingScreen()
        }
    }
}
