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
fun pingSettingBoxesB() {
    var ipAddress4 by remember { mutableStateOf(readIpFile4()) }
    var ipAddress5 by remember { mutableStateOf(readIpFile5()) }
    var ipAddress6 by remember { mutableStateOf(readIpFile6()) }
    var ipAddress7 by remember { mutableStateOf(readIpFile7()) }

    var ipTitle4 by remember { mutableStateOf(readTiFile4()) }
    var ipTitle5 by remember { mutableStateOf(readTiFile5()) }
    var ipTitle6 by remember { mutableStateOf(readTiFile6()) }
    var ipTitle7 by remember { mutableStateOf(readTiFile7()) }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
//// Edit box B4
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
// title input B4
                TextField(
                    value = ipTitle4,
                    onValueChange = { newValue ->
                        ipTitle4 = newValue
                        writeTiToFile4(newValue)
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
// ip input B4
                TextField(
                    value = ipAddress4,
                    onValueChange = { newValue ->
                        ipAddress4 = newValue
                        writeIpToFile4(newValue)
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
//// Edit box B5
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
// title input B5
                TextField(
                    value = ipTitle5,
                    onValueChange = { newValue ->
                        ipTitle5 = newValue
                        writeTiToFile5(newValue)
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
// ip input B5
                TextField(
                    value = ipAddress5,
                    onValueChange = { newValue ->
                        ipAddress5 = newValue
                        writeIpToFile5(newValue)
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
//// Edit box B6
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
// title input B6
                TextField(
                    value = ipTitle6,
                    onValueChange = { newValue ->
                        ipTitle6 = newValue
                        writeTiToFile6(newValue)
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
// ip input B6
                TextField(
                    value = ipAddress6,
                    onValueChange = { newValue ->
                        ipAddress6 = newValue
                        writeIpToFile6(newValue)
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
//// Edit box B7
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
// title input B7
                TextField(
                    value = ipTitle7,
                    onValueChange = { newValue ->
                        ipTitle7 = newValue
                        writeTiToFile7(newValue)
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
// ip input B7
                TextField(
                    value = ipAddress7,
                    onValueChange = { newValue ->
                        ipAddress7 = newValue
                        writeIpToFile7(newValue)
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