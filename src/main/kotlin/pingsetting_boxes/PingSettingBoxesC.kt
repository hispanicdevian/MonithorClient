package pingsetting_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.CustomGrayA
import engine_logic.*

@Composable
@Preview
fun pingSettingBoxesC() {
    var ipAddressC0 by remember { mutableStateOf(readIpFile8()) }
    var ipAddressC1 by remember { mutableStateOf(readIpFile9()) }
    var ipAddressC2 by remember { mutableStateOf(readIpFile10()) }
    var ipAddressC3 by remember { mutableStateOf(readIpFile11()) }

    var ipTitleC0 by remember { mutableStateOf(readTiFile8()) }
    var ipTitleC1 by remember { mutableStateOf(readTiFile9()) }
    var ipTitleC2 by remember { mutableStateOf(readTiFile10()) }
    var ipTitleC3 by remember { mutableStateOf(readTiFile11()) }

    Column(
        modifier = Modifier.padding(bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//////////////////////////////////////////////////////////// Edit Box C0 - 8
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(2f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// title input C0
                BasicTextField(
                    value = ipTitleC0,
                    onValueChange = { newValue ->
                        ipTitleC0 = newValue
                        writeTiToFile8(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
/////////////// Spacer/Separator
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
                Spacer(modifier = Modifier.height(10.dp))
////////////////////////////// ip input C0
                BasicTextField(
                    value = ipAddressC0,
                    onValueChange = { newValue ->
                        ipAddressC0= newValue
                        writeIpToFile8(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
//////////////////////////////////////////////////////////// Edit Box C1 - 9
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(2f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// Title input C1
                BasicTextField(
                    value = ipTitleC1,
                    onValueChange = { newValue ->
                        ipTitleC1 = newValue
                        writeTiToFile9(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
/////////////// Spacer/Separator
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
                Spacer(modifier = Modifier.height(10.dp))
////////////////////////////// ip input C1
                BasicTextField(
                    value = ipAddressB1,
                    onValueChange = { newValue ->
                        ipAddressB1 = newValue
                        writeIpToFile5(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
//////////////////////////////////////////////////////////// Edit Box B2 - 6
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(2f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// title input B2
                BasicTextField(
                    value = ipTitleB2,
                    onValueChange = { newValue ->
                        ipTitleB2 = newValue
                        writeTiToFile6(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
/////////////// Spacer/Separator
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
                Spacer(modifier = Modifier.height(10.dp))
////////////////////////////// ip input B2
                BasicTextField(
                    value = ipAddressB2,
                    onValueChange = { newValue ->
                        ipAddressB2 = newValue
                        writeIpToFile6(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
//////////////////////////////////////////////////////////// Edit Box B3 - 7
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(2f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// title input A3
                BasicTextField(
                    value = ipTitleB3,
                    onValueChange = { newValue ->
                        ipTitleB3 = newValue
                        writeTiToFile7(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
/////////////// Spacer/Separator
                Spacer(modifier = Modifier.height(10.dp))
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
                Spacer(modifier = Modifier.height(10.dp))
////////////////////////////// ip input B3
                BasicTextField(
                    value = ipAddressB3,
                    onValueChange = { newValue ->
                        ipAddressB3 = newValue
                        writeIpToFile7(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}