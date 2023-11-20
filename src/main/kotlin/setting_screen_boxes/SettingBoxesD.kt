package setting_screen_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import engine_logic.*

@Composable
@Preview
fun settingBoxesD() {
    var ipAddressD12 by remember { mutableStateOf(readIpFile12()) }
    var ipAddressD13 by remember { mutableStateOf(readIpFile13()) }
    var ipAddressD14 by remember { mutableStateOf(readIpFile14()) }
    var ipAddressD15 by remember { mutableStateOf(readIpFile15()) }

    Column(
        modifier = Modifier.padding(bottom = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
// Edit Box 00
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressD12,
                onValueChange = { newValue ->
                    ipAddressD12 = newValue
                    writeIpToFile12(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
// Edit Box 01
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressD13,
                onValueChange = { newValue ->
                    ipAddressD13 = newValue
                    writeIpToFile13(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
// Edit Box 02
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressD14,
                onValueChange = { newValue ->
                    ipAddressD14 = newValue
                    writeIpToFile14(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
// Edit Box 03
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressD15,
                onValueChange = { newValue ->
                    ipAddressD15 = newValue
                    writeIpToFile15(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}
