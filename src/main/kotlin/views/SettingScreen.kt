package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import engine_logic.readIpFile0
import engine_logic.readIpFile1
import engine_logic.readIpFile2
import engine_logic.readIpFile3
import setting_screen_boxes.settingBoxesA
import setting_screen_boxes.settingBoxesB
import setting_screen_boxes.settingBoxesC
import setting_screen_boxes.settingBoxesD

@Composable
@Preview
fun settingScreen() {
    val ipAddressA0 by remember { mutableStateOf(readIpFile0()) }
    val ipAddressA1 by remember { mutableStateOf(readIpFile1()) }
    val ipAddressA2 by remember { mutableStateOf(readIpFile2()) }
    val ipAddressA3 by remember { mutableStateOf(readIpFile3()) }

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
            Spacer(modifier = Modifier.width(12.dp))
// Box Set A
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxesA(ipAddressA0, ipAddressA1, ipAddressA2, ipAddressA3)
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set B
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxesB()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set C
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxesC()
            }
            Spacer(modifier = Modifier.width(12.dp))
// Box Set D
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                settingBoxesD()
            }
        }
    }
}
