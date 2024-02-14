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
import custom_resources.ErgoGray
import custom_resources.smartText
import engine_logic.placeHolderIP
import engine_logic.placeHolderTitle
import engine_logic.read_and_write.*

@Composable
@Preview
fun pingSettingBoxesC() {
    var ipAddress8 by remember { mutableStateOf(readIpFile8()) }
    var ipAddress9 by remember { mutableStateOf(readIpFile9()) }
    var ipAddress10 by remember { mutableStateOf(readIpFile10()) }
    var ipAddress11 by remember { mutableStateOf(readIpFile11()) }

    var ipTitle8 by remember { mutableStateOf(readTiFile8()) }
    var ipTitle9 by remember { mutableStateOf(readTiFile9()) }
    var ipTitle10 by remember { mutableStateOf(readTiFile10()) }
    var ipTitle11 by remember { mutableStateOf(readTiFile11()) }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
//// Edit box C8
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
// title input C8
                TextField(
                    value = ipTitle8,
                    onValueChange = { newValue ->
                        ipTitle8 = newValue
                        writeTiToFile8(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderTitle, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 1.5.dp
                )
// ip input C8
                TextField(
                    value = ipAddress8,
                    onValueChange = { newValue ->
                        ipAddress8 = newValue
                        writeIpToFile8(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderIP, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
//// Edit box C9
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
// title input C9
                TextField(
                    value = ipTitle9,
                    onValueChange = { newValue ->
                        ipTitle9 = newValue
                        writeTiToFile9(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderTitle, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 1.5.dp
                )
// ip input C9
                TextField(
                    value = ipAddress9,
                    onValueChange = { newValue ->
                        ipAddress9 = newValue
                        writeIpToFile9(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderIP, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
//// Edit box C10
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
// title input C10
                TextField(
                    value = ipTitle10,
                    onValueChange = { newValue ->
                        ipTitle10 = newValue
                        writeTiToFile10(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderTitle, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 1.5.dp
                )
// ip input C10
                TextField(
                    value = ipAddress10,
                    onValueChange = { newValue ->
                        ipAddress10 = newValue
                        writeIpToFile10(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderIP, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
//// Edit box C11
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
// title input C11
                TextField(
                    value = ipTitle11,
                    onValueChange = { newValue ->
                        ipTitle11 = newValue
                        writeTiToFile11(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderTitle, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
                Divider(
                    modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 1.5.dp
                )
// ip input C11
                TextField(
                    value = ipAddress11,
                    onValueChange = { newValue ->
                        ipAddress11 = newValue
                        writeIpToFile11(newValue)
                    },
                    modifier = Modifier.fillMaxSize().weight(1f),
                    textStyle = TextStyle(
                        fontSize = smartText(.8f),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    placeholder = {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = placeHolderIP, fontSize = smartText(0.8f),
                                color = Color.White, textAlign = TextAlign.Center
                            )
                        }
                    }
                )
            }
        }
    }
}