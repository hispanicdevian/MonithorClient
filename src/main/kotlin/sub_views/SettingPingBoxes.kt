package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.buttons.doneButton
import custom_resources.misc.ErgoGray
import custom_resources.misc.TurquoiseColor
import custom_resources.misc.settingPingBoxesSideSpacer
import engine_logic.Navi
import sub_settings.pingsetting_boxes.pingSettingBoxesA
import sub_settings.pingsetting_boxes.pingSettingBoxesB
import sub_settings.pingsetting_boxes.pingSettingBoxesC
import views.mainScreen
import views.settingScreen

@Composable
@Preview
fun settingPingBoxes() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingPingBxs) }

// Navi head
    when (currentScreen) {
        is Navi.SettingPingBxs -> {
// UI container
            Column(modifier = Modifier.fillMaxSize().background(ErgoGray),
                horizontalAlignment = Alignment.CenterHorizontally) {
// Done button
                Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {
                    doneButton { currentScreen = Navi.SettingScn
                    }
                }
                Row(modifier = Modifier.fillMaxWidth().weight(10f).padding(horizontal = 5.dp).padding(top = 5.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
// Box set A
                    Column( modifier = Modifier.weight(2f))
                    { pingSettingBoxesA() }
                    settingPingBoxesSideSpacer()
// Box set B
                    Column( modifier = Modifier.weight(2f))
                    { pingSettingBoxesB() }
                    settingPingBoxesSideSpacer()
// Box set C
                    Column( modifier = Modifier.weight(2f))
                    { pingSettingBoxesC() }
                }
            }
        }
// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingScn -> settingScreen()
        Navi.SettingOnOffBxs -> settingOnOffBoxes()
    }
}
