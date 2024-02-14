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
fun pingSettingBoxesA() {
    var ipAddress0 by remember { mutableStateOf(readIpFile0()) }
    var ipAddress1 by remember { mutableStateOf(readIpFile1()) }
    var ipAddress2 by remember { mutableStateOf(readIpFile2()) }
    var ipAddress3 by remember { mutableStateOf(readIpFile3()) }

    var ipTitle0 by remember { mutableStateOf(readTiFile0()) }
    var ipTitle1 by remember { mutableStateOf(readTiFile1()) }
    var ipTitle2 by remember { mutableStateOf(readTiFile2()) }
    var ipTitle3 by remember { mutableStateOf(readTiFile3()) }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
//// Edit box A0
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
// title input A0
                TextField(
                    value = ipTitle0,
                    onValueChange = { newValue ->
                        ipTitle0 = newValue
                        writeTiToFile0(newValue)
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
// ip input A0
                TextField(
                    value = ipAddress0,
                    onValueChange = { newValue ->
                        ipAddress0 = newValue
                        writeIpToFile0(newValue)
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
//// Edit box A1
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
// title input A1
                TextField(
                    value = ipTitle1,
                    onValueChange = { newValue ->
                        ipTitle1 = newValue
                        writeTiToFile1(newValue)
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
// ip input A1
                TextField(
                    value = ipAddress1,
                    onValueChange = { newValue ->
                        ipAddress1 = newValue
                        writeIpToFile1(newValue)
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
//// Edit box A2
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
// title input A2
                TextField(
                    value = ipTitle2,
                    onValueChange = { newValue ->
                        ipTitle2 = newValue
                        writeTiToFile2(newValue)
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
// ip input A2
                TextField(
                    value = ipAddress2,
                    onValueChange = { newValue ->
                        ipAddress2 = newValue
                        writeIpToFile2(newValue)
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
//// Edit box A3
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
// title input A3
                TextField(
                    value = ipTitle3,
                    onValueChange = { newValue ->
                        ipTitle3 = newValue
                        writeTiToFile3(newValue)
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
// ip input A3
                TextField(
                    value = ipAddress3,
                    onValueChange = { newValue ->
                        ipAddress3 = newValue
                        writeIpToFile3(newValue)
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