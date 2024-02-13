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
import read_and_write.SLFObjectA.loadFontSizeA
import read_and_write.*

////////////////////////////// Third column of boxes located in Ip settings
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

// Font size ram
    val fontSizedSA by remember { mutableStateOf(loadFontSizeA().sp) }

    Column( modifier = Modifier.padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
////////////////////////////// Edit box C0 - 8
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
/////////////// Title input C0
                TextField(
                    value = ipTitleC0,
                    onValueChange = { newValue ->
                        ipTitleC0 = newValue
                        writeTiToFile8(newValue)
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
/////////////// Divider line C0
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input C0
                TextField(
                    value = ipAddressC0,
                    onValueChange = { newValue ->
                        ipAddressC0= newValue
                        writeIpToFile8(newValue)
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
////////////////////////////// Edit box C1 - 9
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// Title input C1
                TextField(
                    value = ipTitleC1,
                    onValueChange = { newValue ->
                        ipTitleC1 = newValue
                        writeTiToFile9(newValue)
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
/////////////// Divider line C1
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input C1
                TextField(
                    value = ipAddressC1,
                    onValueChange = { newValue ->
                        ipAddressC1 = newValue
                        writeIpToFile9(newValue)
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
////////////////////////////// Edit box C2 - 10
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// Title input C2
                TextField(
                    value = ipTitleC2,
                    onValueChange = { newValue ->
                        ipTitleC2 = newValue
                        writeTiToFile10(newValue)
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
/////////////// Divider line C2
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input C2
                TextField(
                    value = ipAddressC2,
                    onValueChange = { newValue ->
                        ipAddressC2 = newValue
                        writeIpToFile10(newValue)
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
////////////////////////////// Edit box C3 - 11
        settingSpacerH()
        Box(
            modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(5.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
/////////////// Title input C3
                TextField(
                    value = ipTitleC3,
                    onValueChange = { newValue ->
                        ipTitleC3 = newValue
                        writeTiToFile11(newValue)
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
/////////////// Divider line C3
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input C3
                TextField(
                    value = ipAddressC3,
                    onValueChange = { newValue ->
                        ipAddressC3 = newValue
                        writeIpToFile11(newValue)
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
