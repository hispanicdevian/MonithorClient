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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
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
                modifier = Modifier.fillMaxSize().padding(start = 15.dp, end = 15.dp, top = 4.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(ErgoGray),
                        onClick = { currentScreen = Navi.Settings }
                    ) {
                        Text("Done", color = Color.White)
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