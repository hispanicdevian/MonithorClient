package pingsetting_boxes

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
import engine_logic.SLFObjectA.loadFontSizeA

////////////////////////////// Second column of boxes located in Ip settings
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
// Font size ram
    val fontSizedSA by remember { mutableStateOf(loadFontSizeA().sp) }

    Column( modifier = Modifier.padding(top = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
////////////////////////////// Edit box B0 - ReWr4
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
/////////////// Title input B0
                TextField(
                    value = ipTitleB0,
                    onValueChange = { newValue ->
                        ipTitleB0 = newValue
                        writeTiToFile4(newValue)
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
/////////////// Divider line B0
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input B0
                TextField(
                    value = ipAddressB0,
                    onValueChange = { newValue ->
                        ipAddressB0 = newValue
                        writeIpToFile4(newValue)
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
////////////////////////////// Edit box B1 - ReWr5
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
/////////////// Title input B1
                TextField(
                    value = ipTitleB1,
                    onValueChange = { newValue ->
                        ipTitleB1 = newValue
                        writeTiToFile5(newValue)
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
/////////////// Divider line B1
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input B1
                TextField(
                    value = ipAddressB1,
                    onValueChange = { newValue ->
                        ipAddressB1 = newValue
                        writeIpToFile5(newValue)
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
////////////////////////////// Edit box B2 - ReWr6
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
/////////////// Title input B2
                TextField(
                    value = ipTitleB2,
                    onValueChange = { newValue ->
                        ipTitleB2 = newValue
                        writeTiToFile6(newValue)
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
/////////////// Divider line B2
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input B2
                TextField(
                    value = ipAddressB2,
                    onValueChange = { newValue ->
                        ipAddressB2 = newValue
                        writeIpToFile6(newValue)
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
////////////////////////////// Edit box B3 - ReWr7
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
/////////////// Title input B3
                TextField(
                    value = ipTitleB3,
                    onValueChange = { newValue ->
                        ipTitleB3 = newValue
                        writeTiToFile7(newValue)
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
/////////////// Divider line B3
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black,
                    thickness = 1.5.dp
                )
/////////////// Ip input B3
                TextField(
                    value = ipAddressB3,
                    onValueChange = { newValue ->
                        ipAddressB3 = newValue
                        writeIpToFile7(newValue)
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
