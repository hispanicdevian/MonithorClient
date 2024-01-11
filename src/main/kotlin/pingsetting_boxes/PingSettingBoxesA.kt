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
fun pingSettingBoxesA() {
    var ipAddressA0 by remember { mutableStateOf(readIpFile0()) }
    var ipAddressA1 by remember { mutableStateOf(readIpFile1()) }
    var ipAddressA2 by remember { mutableStateOf(readIpFile2()) }
    var ipAddressA3 by remember { mutableStateOf(readIpFile3()) }

    var ipTitle0A by remember { mutableStateOf(readTiFile0()) }
    var ipTitle0B by remember { mutableStateOf(readTiFile0()) }
    var ipTitle0C by remember { mutableStateOf(readTiFile0()) }
    var ipTitle0D by remember { mutableStateOf(readTiFile0()) }

    Column(
        modifier = Modifier.padding(bottom = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
//////////////////////////////////////////////////////////// Edit Box 1A
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// title input 1A
                BasicTextField(
                    value = ipTitle0A,
                    onValueChange = { newValue ->
                        ipTitle0A = newValue
                        writeTiToFile0(newValue)
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
////////////////////////////// ip input 1A
                BasicTextField(
                    value = ipAddressA0,
                    onValueChange = { newValue ->
                        ipAddressA0 = newValue
                        writeIpToFile0(newValue)
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
//////////////////////////////////////////////////////////// Edit Box 2A
/*
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
////////////////////////////// title input 2A
                BasicTextField(
                    value = ipTitle0A,
                    onValueChange = { newValue ->
                        ipTitle0A = newValue
                        writeTiToFile0(newValue)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
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
////////////////////////////// ip input 2A
            BasicTextField(
                value = ipAddressA1,
                onValueChange = { newValue ->
                    ipAddressA1 = newValue
                    writeIpToFile1(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
//////////////////////////////////////////////////////////// Edit Box 02
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressA2,
                onValueChange = { newValue ->
                    ipAddressA2 = newValue
                    writeIpToFile2(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }
//////////////////////////////////////////////////////////// Edit Box 03
        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .aspectRatio(1.5f)
                .background((CustomGrayA), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = ipAddressA3,
                onValueChange = { newValue ->
                    ipAddressA3 = newValue
                    writeIpToFile3(newValue)
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                )
            )
        }

 */
    }
}
