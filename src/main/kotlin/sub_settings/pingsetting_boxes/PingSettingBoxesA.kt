package sub_settings.pingsetting_boxes

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import custom_resources.misc.ErgoGray
import custom_resources.misc.smartText
import engine_logic.read_and_write.ReWrTitle.readTiFile
import engine_logic.read_and_write.ReWrTitle.writeTiToFile
import engine_logic.read_and_write.ReadWriterIP.readIpFile
import engine_logic.read_and_write.ReadWriterIP.writeIpToFile

@Composable
@Preview
fun pingSettingBoxesA() {
    val placeHolderTitle = "Title"
    val placeHolderIP = "IP/Hostname"
    val ipTitle = List(4) { index ->
        remember { mutableStateOf(readTiFile(index)) }
    }
    val ipAddresses = List(4) { index ->
        remember { mutableStateOf(readIpFile(index)) }
    }
    val boxNumber = List(4) { index -> remember { mutableStateOf((index)) } }
    Column(modifier = Modifier.padding(top = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        for (index in boxNumber.indices) {
            Box(modifier = Modifier
                .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                .padding(4.dp)
                .weight(1f)
                .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp)), // color based on ping result
                contentAlignment = Alignment.Center) {
                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {
                    TextField(value = ipTitle[index].value,
                        onValueChange = { newValue ->
                            ipTitle[index].value = newValue
                            writeTiToFile(newValue, index) // Write to file
                        },
                        modifier = Modifier.fillMaxSize().weight(1f),
                        textStyle = TextStyle(
                            fontSize = smartText(.8f),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        ),
                        placeholder = {
                            Box(modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center) {
                                Text(text = placeHolderTitle, fontSize = smartText(0.8f),
                                    color = Color.White, textAlign = TextAlign.Center
                                )
                            }
                        }
                    )
                    Divider(modifier = Modifier.fillMaxWidth(), color = Color.Black, thickness = 1.5.dp
                    )
// Ip input A0
                    TextField(value = ipAddresses[index].value,
                        onValueChange = { newValue ->
                            ipAddresses[index].value = newValue
                            writeIpToFile(newValue, index) // Write to file
                        },
                        modifier = Modifier.fillMaxSize().weight(1f),
                        textStyle = TextStyle(
                            fontSize = smartText(.8f),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        ),
                        placeholder = {
                            Box(modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center) {
                                Text(text = placeHolderIP, fontSize = smartText(0.8f),
                                    color = Color.White, textAlign = TextAlign.Center
                                )
                            }
                        }
                    )
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}
