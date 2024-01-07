package sub_views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.NbtColor
import engine_logic.Navi
import engine_logic.saveFontSizeV1A
import views.mainScreen
import views.settingScreen

//////////////////////////////////////////////////////////// Screen/View for Font Size Settings
@Composable
fun settingFontSize() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingFontSz) }
//////////////////////////////////// These vars contain the value saved and loaded from .hdi files, see (SaveLoadFont.kt)
    var fontSizedA: TextUnit
    /*
    var fontSizedB: TextUnit
    var fontSizedC: TextUnit
    var fontSizedD: TextUnit

     */
//////////////////////////////////////////////////////////// Lists of shown buttons
    val fontSizeMapA = mapOf(
        "Default" to 20.sp,
        "Small" to 25.sp,
        "Medium" to 30.sp,
        "Large" to 35.sp,
        "None" to 0.sp
    )
    /*
    val fontSizeMapB = mapOf(
        "Default" to 20.sp,
        "Small" to 25.sp,
        "Medium" to 30.sp,
        "Large" to 35.sp,
        "None" to 0.sp
    )
    val fontSizeMapC = mapOf(
        "Default" to 20.sp,
        "Small" to 25.sp,
        "Medium" to 30.sp,
        "Large" to 35.sp,
        "None" to 0.sp
    )
    val fontSizeMapD = mapOf(
        "Default" to 20.sp,
        "Small" to 25.sp,
        "Medium" to 30.sp,
        "Large" to 35.sp,
        "None" to 0.sp
    )
     */
//////////////////////////////////////////////////////////// Navi Head (Navi = Navigation)
    when (currentScreen) {
        is Navi.SettingFontSz -> {
//////////////////////////////////////////////////////////// Done Button
            Box(
                modifier = Modifier.fillMaxSize().padding(start = 4.dp, end = 4.dp, top = 3.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top
                ) {
                    Button(modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(ErgoGray),
                        onClick = { currentScreen = Navi.SettingScn }
                    ) {
                        Text("Done", color = NbtColor, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
//////////////////////////////////////////////////////////// UI Container
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
//////////////////////////////////////////////////////////// Row 1 (Box A + B)
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
////////////////////////////// Box A
                    Box(
                        modifier = Modifier.fillMaxSize().padding(top = 30.dp).padding(vertical = 100.dp).padding(horizontal = 250.dp)
                            .background(Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                            .padding(5.dp)
                            .size(300.dp)
                            .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp))
                    ) {
                        val itemsListA = listOf("Default", "Small", "Medium", "Large", "None")
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            item {
                                Text(
                                    text = "Main Screen Boxes",
                                    color = Color.White,
                                    fontSize = 30.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp)
                                )
                            }
                            item {
                                Row( modifier = Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Divider(
                                        modifier = Modifier.fillMaxWidth(0.5f),
                                        color = Color.Black,
                                        thickness = 1.5.dp
                                    )
                                }
                            }
                            items(itemsListA) { item ->
                                Text(
                                    text = item,
                                    color = Color.White,
                                    modifier = Modifier
                                        .clickable {
                                            fontSizedA =
                                                fontSizeMapA[item]
                                                    ?: 20.sp // Default to 20 sp if item is not found in the map
                                            saveFontSizeV1A(fontSizedA.value)
                                        }
                                        .padding(16.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 25.sp)
                                )
                            }
                        }
                    }
                    /*
////////////////////////////// Box B
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                            .padding(5.dp)
                            .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp))
                    ) {
                        val itemsListB = listOf("Default", "Small", "Medium", "Large", "None")
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            item {
                                Text(
                                    text = "B",
                                    color = Color.White,
                                    fontSize = 25.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
                                )
                            }
                            items(itemsListB) { item ->
                                Text(
                                    text = item,
                                    color = Color.White,
                                    modifier = Modifier
                                        .clickable {
                                            fontSizedB =
                                                fontSizeMapB[item]
                                                    ?: 20.sp // Default to 20 sp if item is not found in the map
                                            saveFontSizeV1B(fontSizedB.value)
                                        }
                                        .padding(16.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                        }
                    }
                }
//////////////////////////////////////////////////////////// Row 2 (Box C + D)
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {
//////////////////////////////////////////////////////////// Box C
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                            .padding(5.dp)
                            .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp))
                    ) {
                        val itemsListC = listOf("Default", "Small", "Medium", "Large", "None")
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            item {
                                Text(
                                    text = "C",
                                    color = Color.White,
                                    fontSize = 25.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
                                )
                            }
                            items(itemsListC) { item ->
                                Text(
                                    text = item,
                                    color = Color.White,
                                    modifier = Modifier
                                        .clickable {
                                            fontSizedC =
                                                fontSizeMapC[item]
                                                    ?: 20.sp // Default to 20 sp if item is not found in the map
                                            saveFontSizeV1C(fontSizedC.value)
                                        }
                                        .padding(16.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                        }
                    }
//////////////////////////////////////////////////////////// Box D
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .background(color = Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                            .padding(5.dp)
                            .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp))
                    ) {
                        val itemsListD = listOf("Default", "Small", "Medium", "Large", "None")
                        LazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            item {
                                Text(
                                    text = "D",
                                    color = Color.White,
                                    fontSize = 25.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth().padding(top = 15.dp, bottom = 15.dp),
                                )
                            }
                            items(itemsListD) { item ->
                                Text(
                                    text = item,
                                    color = Color.White,
                                    modifier = Modifier
                                        .clickable {
                                            fontSizedD =
                                                fontSizeMapD[item]
                                                    ?: 20.sp // Default to 20 sp if item is not found in the map
                                            saveFontSizeV1D(fontSizedD.value)
                                        }
                                        .padding(16.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 20.sp)
                                )
                            }
                        }
                    }
                     */
                }
            }
        }
//////////////////////////////////////////////////////////// Navi Tail (Navi = Navigation)
        Navi.MainScn -> mainScreen()
        Navi.SettingScn -> settingScreen()
        Navi.SettingPingBxs -> settingPingBoxes()
        Navi.SettingOnOffBxs -> settingOnOffBoxes()
    }
}
