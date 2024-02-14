package ping_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import custom_resources.*
import engine_logic.*
import engine_logic.read_and_write.SLOnOffObjectB.loadOnOffFileB
import engine_logic.read_and_write.TiFileManager
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes
import views.settingScreen

////////////////////////////// Ping boxes shown in the first column of the main screen
@Composable
@Preview
fun pingBoxesB(pingSuccessfulB4: Boolean, pingSuccessfulB5: Boolean, pingSuccessfulB6: Boolean, pingSuccessfulB7: Boolean) {
// Ram for active View/Screen
    val currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }
// Pass through ram for ping state
    val pingSuccessfulList = listOf(pingSuccessfulB4, pingSuccessfulB5, pingSuccessfulB6, pingSuccessfulB7)
// Title
    val ipTitleA0 by remember { mutableStateOf(TiFileManager.readTiFile(0)) }
    val ipTitleA1 by remember { mutableStateOf(TiFileManager.readTiFile(1)) }
    val ipTitleA2 by remember { mutableStateOf(TiFileManager.readTiFile(2)) }
    val ipTitleA3 by remember { mutableStateOf(TiFileManager.readTiFile(3)) }

    val titleList = listOf(ipTitleA0, ipTitleA1, ipTitleA2, ipTitleA3)

/////////////// Loads the last state of On/Off settings
    val visibilityList = remember {
        val currentState = loadOnOffFileB()
        if (currentState.isNotEmpty()) {
            currentState.split(",").map { it.toBoolean() }
        } else {
            listOf(true, true, true, true)
        }
    }

////////////////////////////// UI container
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        pbSpacerHTop()
/////////////// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
/////////////// Creates boxes based on # of titles, and its visibility based on settings file
                for (index in titleList.indices) {
                    if (visibilityList[index]) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1.5f)
                                .background((if (pingSuccessfulList[index]) TurquoiseColor else RedAlert), shape = AbsoluteRoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = titleList[index],
                                    color = ErgoGray,
                                    fontWeight = FontWeight.W900,
                                    fontSize = smartText(),
                                    textAlign = TextAlign.Center
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = if (pingSuccessfulList[index]) "On" else "Off",
                                    color = ErgoGray,
                                    fontWeight = FontWeight.W800,
                                    fontSize = smartText(),
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        pbSpacerHBot()
                    }
                }
            }
/////////////// Navi tail
            Navi.SettingPingBxs -> settingPingBoxes()
            Navi.SettingScn -> settingScreen()
            Navi.SettingOnOffBxs -> settingOnOffBoxes()
        }
    }
}