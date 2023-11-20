package main_screen_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import custom_resources.ErgoGray

@Composable
@Preview
fun tempHumidBoxes(tempSuccessfulA: String, humidSuccessfulA: String, tempSuccessfulB: String, humidSuccessfulB: String) {

    val tempHumidSuccessfulList = listOf(tempSuccessfulA, humidSuccessfulA, tempSuccessfulB, humidSuccessfulB)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(15.dp))

        for (value in tempHumidSuccessfulList) {
            Box(
                modifier = Modifier
                    .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                    .padding(5.dp)
                    .weight(1f)
                    .aspectRatio(1.5f)
                    .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            )
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}