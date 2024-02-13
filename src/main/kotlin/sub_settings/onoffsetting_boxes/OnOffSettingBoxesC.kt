package sub_settings.onoffsetting_boxes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.SeaColor
import custom_resources.oosbSpacerHBot
import read_and_write.SLOnOffObjectC.loadVisibilityC
import read_and_write.SLOnOffObjectC.saveVisibilityC

@Composable
fun onOffSettingBoxesC() {
// Ram for active View/Screen
    var visibilityList by remember { mutableStateOf(loadVisibilityC()) }

////////////////////////////// UI container
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
////////////////////////////// On/Off index control
        visibilityList.forEachIndexed { index, isVisible ->
            Box(modifier = Modifier.background(color = if (isVisible) SeaColor else Color.Black,
                shape = AbsoluteRoundedCornerShape(8.dp))
                    .padding(5.dp)
                    .background(color = ErgoGray, shape = AbsoluteRoundedCornerShape(5.dp))
                    .weight(1f)
                    .fillMaxSize()
                    .clickable {
                        visibilityList = visibilityList.toMutableList().apply {
                            this[index] = !this[index]
                        }
////////////////////////////// Saves the updated state when the box is clicked
                        saveVisibilityC(visibilityList)
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(text = if (isVisible) "ON" else "OFF", color = Color.White, fontSize = 20.sp)
            }
            oosbSpacerHBot()
        }
    }
}