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
import custom_resources.ErgoGray
import custom_resources.NbtColor
import engine_logic.Navi
import pingsetting_boxes.pingSettingBoxesA
import pingsetting_boxes.pingSettingBoxesB
import pingsetting_boxes.pingSettingBoxesC
import pingsetting_boxes.pingSettingBoxesD
import views.mainScreen
import views.settingScreen

@Composable
@Preview
fun settingPingBxs() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingsPingBoxes) }

    when (currentScreen) {
        is Navi.SettingsPingBoxes -> {

            Box(
                modifier = Modifier.fillMaxSize().padding(start = 4.dp, end = 4.dp, top = 3.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(ErgoGray),
                        onClick = { currentScreen = Navi.Settings }
                    ) {
                        Text("Done", color = NbtColor, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                    }
                }
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
// Box Set A
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            pingSettingBoxesA()
                        }
                        Spacer(modifier = Modifier.width(12.dp))
// Box Set B
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            pingSettingBoxesB()
                        }
                        Spacer(modifier = Modifier.width(12.dp))
// Box Set C
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            pingSettingBoxesC()
                        }
                        Spacer(modifier = Modifier.width(12.dp))
// Box Set D
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            pingSettingBoxesD()
                        }
                    }
                }
            }

        }
        Navi.Main -> mainScreen()
        Navi.Settings -> settingScreen()
    }
}