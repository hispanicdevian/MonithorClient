package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.doneButton
import custom_resources.spbSpacerW
import engine_logic.Navi
import pingsetting_boxes.pingSettingBoxesA
import pingsetting_boxes.pingSettingBoxesB
import pingsetting_boxes.pingSettingBoxesC
import views.mainScreen
import views.settingScreen

//////////////////////////////////////// Screen/View for IP settings
@Composable
@Preview
fun settingPingBoxes() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingPingBxs) }

//////////////////////////////////////// Navi head
    when (currentScreen) {
        is Navi.SettingPingBxs -> {
////////////////////////////// Done button
            doneButton {
                currentScreen = Navi.SettingScn
            }

//////////////////////////////////////// UI container
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 55.dp)
                    .padding(horizontal = 15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
////////////////////////////// Box set A
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesA()
                }
                spbSpacerW()
////////////////////////////// Box set B
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesB()
                }
                spbSpacerW()
////////////////////////////// Box set C
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesC()
                }
            }
        }
//////////////////////////////////////// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingScn -> settingScreen()
        Navi.SettingFontSz -> settingFontSize()
        Navi.SettingOnOffBxs -> settingOnOffBoxes()
    }
}