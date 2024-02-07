package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import custom_resources.doneButton
import custom_resources.soobSpacerW
import engine_logic.Navi
import onoffsetting_boxes.onOffSettingBoxesA
import onoffsetting_boxes.onOffSettingBoxesB
import onoffsetting_boxes.onOffSettingBoxesC
import onoffsetting_boxes.onOffSettingBoxesD
import views.mainScreen
import views.settingScreen

////////////////////////////// Screen/view for turning On/Off UI
@Composable
@Preview
fun settingOnOffBoxes() {
// Current screen ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingOnOffBxs) }

////////////////////////////// Navi head
    when (currentScreen) {
        is Navi.SettingOnOffBxs -> {
////////////////////////////// Done button -> Setting screen
            doneButton {
                currentScreen = Navi.SettingScn
            }
////////////////////////////// UI container
            Box(
                modifier = Modifier.fillMaxSize().padding(top = 60.dp)
                    .background(ErgoGray)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
////////////////////////////// Box set A
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesA() }
                    soobSpacerW()
////////////////////////////// Box set B
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesB() }
                    soobSpacerW()
////////////////////////////// Box set C
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesC() }
                    soobSpacerW()
////////////////////////////// Box set D
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesD() }
                }
            }
        }
////////////////////////////// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingFontSz -> settingFontSize()
        Navi.SettingPingBxs -> settingPingBoxes()
        Navi.SettingScn -> settingScreen()
    }
}
