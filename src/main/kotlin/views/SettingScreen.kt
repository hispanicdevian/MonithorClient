package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import setting_screen_boxes.settingBoxesA
import setting_screen_boxes.settingBoxesB
import setting_screen_boxes.settingBoxesC
import setting_screen_boxes.settingBoxesD

@Composable
@Preview
fun settingScreen() {
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
                settingBoxesA()
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
