package sub_settings.pingsetting_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.settingSpacerH
import engine_logic.*
import engine_logic.read_and_write.SLFObjectA.loadFontSizeA
import engine_logic.read_and_write.*

////////////////////////////// First column of boxes located in Ip settings
@Composable
@Preview
fun pingSettingBoxesA() {
    var ipAddressA0 by remember { mutableStateOf(readIpFile0()) }
    var ipAddressA1 by remember { mutableStateOf(readIpFile1()) }
    var ipAddressA2 by remember { mutableStateOf(readIpFile2()) }
    var ipAddressA3 by remember { mutableStateOf(readIpFile3()) }

    var ipTitleA0 by remember { mutableStateOf(readTiFile0()) }
    var ipTitleA1 by remember { mutableStateOf(readTiFile1()) }
    var ipTitleA2 by remember { mutableStateOf(readTiFile2()) }
    var ipTitleA3 by remember { mutableStateOf(readTiFile3()) }
// Font size ram
    val fontSizedSA by remember { mutableStateOf(loadFontSizeA().sp) }

    Column( modifier = Modifier.padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
////////////////////////////// Edit box A0 - ReWr0
        Box( modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(4.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// Title input A0
                TextField(
                    value = ipTitleA0,
                    onValueChange = { newValue ->
                        ipTitleA0 = newValue
                        writeTiToFile0(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = placeHolderTitle, fontSize = fontSizedSA,
                                color = Color.White, textAlign = TextAlign.Center)
                        }
                    }
                )
/////////////// Divider line A0
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input A0
                TextField(
                    value = ipAddressA0,
                    onValueChange = { newValue ->
                        ipAddressA0 = newValue
                        writeIpToFile0(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = { Box( modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center ) {
                        Text( text = placeHolderIP, fontSize = fontSizedSA,
                            color = Color.White, textAlign = TextAlign.Center ) }
                    }
                )
            }
        }
////////////////////////////// Edit box A1 - ReWr1
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(4.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// title input A1
                TextField(
                    value = ipTitleA1,
                    onValueChange = { newValue ->
                        ipTitleA1 = newValue
                        writeTiToFile1(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = placeHolderTitle, fontSize = fontSizedSA,
                                color = Color.White, textAlign = TextAlign.Center)
                        }
                    }
                )
/////////////// Divider line A1
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// ip input A1
                TextField(
                    value = ipAddressA1,
                    onValueChange = { newValue ->
                        ipAddressA1 = newValue
                        writeIpToFile1(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = { Box( modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center ) {
                        Text( text = placeHolderIP, fontSize = fontSizedSA,
                            color = Color.White, textAlign = TextAlign.Center ) }
                    }
                )
            }
        }
////////////////////////////// Edit box A2 - ReWr2
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(4.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// title input A2
                TextField(
                    value = ipTitleA2,
                    onValueChange = { newValue ->
                        ipTitleA2 = newValue
                        writeTiToFile2(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = placeHolderTitle, fontSize = fontSizedSA,
                                color = Color.White, textAlign = TextAlign.Center)
                        }
                    }
                )
/////////////// Divider line A2
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input A2
                TextField(
                    value = ipAddressA2,
                    onValueChange = { newValue ->
                        ipAddressA2 = newValue
                        writeIpToFile2(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = { Box( modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center ) {
                        Text( text = placeHolderIP, fontSize = fontSizedSA,
                            color = Color.White, textAlign = TextAlign.Center ) }
                    }
                )
            }
        }
////////////////////////////// Edit box A3 - ReWr3
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(4.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// title input A3
                TextField(
                    value = ipTitleA3,
                    onValueChange = { newValue ->
                        ipTitleA3 = newValue
                        writeTiToFile3(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = placeHolderTitle, fontSize = fontSizedSA,
                                color = Color.White, textAlign = TextAlign.Center)
                        }
                    }
                )
/////////////// Divider line A3
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input A3
                TextField(
                    value = ipAddressA3,
                    onValueChange = { newValue ->
                        ipAddressA3 = newValue
                        writeIpToFile3(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = fontSizedSA,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = { Box( modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center ) {
                        Text( text = placeHolderIP, fontSize = fontSizedSA,
                            color = Color.White, textAlign = TextAlign.Center ) }
                    }
                )
            }
        }
    }
}
