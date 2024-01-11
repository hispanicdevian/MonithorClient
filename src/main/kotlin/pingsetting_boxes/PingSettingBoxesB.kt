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
fun pingSettingBoxesB() {
    var ipAddressB0 by remember { mutableStateOf(readIpFile4()) }
    var ipAddressB1 by remember { mutableStateOf(readIpFile5()) }
    var ipAddressB2 by remember { mutableStateOf(readIpFile6()) }
    var ipAddressB3 by remember { mutableStateOf(readIpFile7()) }

    var ipTitleB0 by remember { mutableStateOf(readTiFile4()) }
    var ipTitleB1 by remember { mutableStateOf(readTiFile5()) }
    var ipTitleB2 by remember { mutableStateOf(readTiFile6()) }
    var ipTitleB3 by remember { mutableStateOf(readTiFile7()) }

    Column(
        modifier = Modifier.padding(bottom = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//////////////////////////////////////////////////////////// Edit Box B0 - 4
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
////////////////////////////// title input B0
                BasicTextField(
                    value = ipTitleB0,
                    onValueChange = { newValue ->
                        ipTitleB0 = newValue
                        writeTiToFile4(newValue)
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
////////////////////////////// ip input B0
                BasicTextField(
                    value = ipAddressB0,
                    onValueChange = { newValue ->
                        ipAddressB0= newValue
                        writeIpToFile4(newValue)
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
//////////////////////////////////////////////////////////// Edit Box B1 - 5
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
////////////////////////////// title input B1
                BasicTextField(
                    value = ipTitleB1,
                    onValueChange = { newValue ->
                        ipTitleB1 = newValue
                        writeTiToFile5(newValue)
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
////////////////////////////// ip input B1
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
