package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.CustomGrayA
import custom_resources.MainColorA
import engine_logic.Navi
import onoffsetting_boxes.onOffSettingBoxesA
import onoffsetting_boxes.onOffSettingBoxesB
import onoffsetting_boxes.onOffSettingBoxesC
import views.mainScreen
import views.settingScreen

@Composable
@Preview
fun settingOnOffBoxes() {
/////////////// Ram for active View/Screen
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingOnOffBxs) }
//////////////////////////////////////////////////////////// Navi head
    when (currentScreen) {
        is Navi.SettingOnOffBxs -> {
////////////////////////////// Done button -> Setting screen
            Box(
                modifier = Modifier.fillMaxSize().padding(start = 4.dp, end = 4.dp, top = 3.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(CustomGrayA),
                        onClick = { currentScreen = Navi.SettingScn }
                    ) {
                        Text("Done", color = MainColorA, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
//////////////////////////////////////////////////////////// UI container
            Box(
                modifier = Modifier.fillMaxSize().padding(top = 60.dp)
                    .background(CustomGrayA)
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
                    Spacer(modifier = Modifier.width(12.dp))
////////////////////////////// Box set B
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesB() }
                    Spacer(modifier = Modifier.width(12.dp))
////////////////////////////// Box set C
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) { onOffSettingBoxesC() }
                    Spacer(modifier = Modifier.width(12.dp))
                }
            }
        }
//////////////////////////////////////////////////////////// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingFontSz -> settingFontSize()
        Navi.SettingPingBxs -> settingPingBoxes()
        Navi.SettingScn -> settingScreen()
    }
}