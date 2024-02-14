package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.*
import engine_logic.Navi
import sub_settings.onoffsetting_boxes.onOffSettingBoxesA
import sub_settings.onoffsetting_boxes.onOffSettingBoxesB
import sub_settings.onoffsetting_boxes.onOffSettingBoxesC
import sub_settings.onoffsetting_boxes.onOffSettingBoxesD
import views.mainScreen
import views.settingScreen

// Screen/view for turning On/Off UI
@Composable
@Preview
fun settingOnOffBoxes() {
// Current screen ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingOnOffBxs) }

// Navi head
    when (currentScreen) {
        is Navi.SettingOnOffBxs -> {

// UI Parent
            Column(modifier = Modifier.fillMaxSize().background(ErgoGray),
                horizontalAlignment = Alignment.CenterHorizontally) {
// Done button
                Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {
                    doneButton { currentScreen = Navi.SettingScn
                    }
                }
                Row(modifier = Modifier.fillMaxSize().weight(10f).padding(top = 10.dp).padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
// Box set A
                    Column(modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesA() }
                    soobSpacerW()
// Box set B
                    Column(modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesB() }
                    soobSpacerW()
// Box set C
                    Column(modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesC() }
                    soobSpacerW()
// Box set D
                    Column(modifier = Modifier.weight(1.5f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesD() }
                }
            }
        }
// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingPingBxs -> settingPingBoxes()
        Navi.SettingScn -> settingScreen()
    }
}
