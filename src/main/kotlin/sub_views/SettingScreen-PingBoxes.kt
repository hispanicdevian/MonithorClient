package sub_views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray
import pingsetting_boxes.*

@Composable
@Preview
fun settingScreenPingBoxes() {

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
