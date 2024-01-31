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

//////////////////////////////////////////////////////////// Screen/View for IP Settings
@Composable
@Preview
fun settingPingBoxes() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingPingBxs) }

//////////////////////////////////////////////////////////// Navi Head (Navi = Navigation)
    when (currentScreen) {
        is Navi.SettingPingBxs -> {
//////////////////////////////////////////////////////////// Done Button
            doneButton {
                currentScreen = Navi.SettingScn
            }
//////////////////////////////////////////////////////////// UI Container

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 55.dp)
                    .padding(horizontal = 15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
//////////////////////////////////////////////////////////// Box Set A
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesA()
                }
                spbSpacerW()
//////////////////////////////////////////////////////////// Box Set B
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesB()
                }
                spbSpacerW()
//////////////////////////////////////////////////////////// Box Set C
                Column(modifier = Modifier
                    .weight(1f)
                ) {
                    pingSettingBoxesC()
                }
            }
        }
//////////////////////////////////////////////////////////// Navi Tail (Navi = Navigation)
        Navi.MainScn -> mainScreen()
        Navi.SettingScn -> settingScreen()
        Navi.SettingFontSz -> settingFontSize()
        Navi.SettingOnOffBxs -> settingOnOffBoxes()
    }
}