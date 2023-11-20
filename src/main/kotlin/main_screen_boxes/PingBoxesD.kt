package main_screen_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGreen
import custom_resources.ErgoRed

@Composable
@Preview
fun pingBoxesD(pingSuccessfulD12: Boolean, pingSuccessfulD13: Boolean, pingSuccessfulD14: Boolean, pingSuccessfulD15: Boolean) {

    val pingSuccessfulList = listOf(pingSuccessfulD12, pingSuccessfulD13, pingSuccessfulD14, pingSuccessfulD15)
    val titleList = listOf("12", "13", "14", "15")

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        repeat(4) {
            Box(
                modifier = Modifier
                    .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                    .padding(5.dp)
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background((if (pingSuccessfulList[it]) ErgoGreen else ErgoRed), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = titleList[it],
                        color = Color.White,
                        fontSize = 20.sp,
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = if (pingSuccessfulList[it]) "Online" else "Offline",
                        color = Color.White,
                        fontSize = 12.sp,
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}