package sub_views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.TurquoiseColor
import custom_resources.doneButton
import custom_resources.settingSpacerH
import engine_logic.Navi
import engine_logic.SLFObjectA.saveFontSizeA
import views.mainScreen
import views.settingScreen

// Screen/View for selecting font size
@Composable
fun settingFontSize() {
// Screen view Ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingFontSz) }
// Font size Ram
    var fontSizedA: TextUnit

// List buttons
    val fontSizeMapA = mapOf(
        "Default" to 20.sp,
        "Small" to 25.sp,
        "Medium" to 30.sp,
        "Large" to 35.sp,
        "None" to 0.sp
    )
// Navi head
    when (currentScreen) {
        is Navi.SettingFontSz -> {

// UI Parent
            Column(
                modifier = Modifier.fillMaxSize().background(ErgoGray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
// Done button
                Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {
                    doneButton {
                        currentScreen = Navi.SettingScn
                    }
                }
                Row( modifier = Modifier.fillMaxSize().weight(10f).padding(top = 10.dp).padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box( modifier = Modifier.fillMaxSize().background(Color.Black, shape = AbsoluteRoundedCornerShape(8.dp))
                        .padding(5.dp)
                        .fillMaxSize()
                        .background((ErgoGray), shape = AbsoluteRoundedCornerShape(5.dp))) {
// This needs to match fontSizeMapA variable strings
                        val itemsListA = listOf("Default", "Small", "Medium", "Large", "None")
                        LazyColumn( modifier = Modifier.fillMaxSize(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            item {
                                Text(
                                    text = "Main Screen Boxes",
                                    color = Color.White,
                                    fontSize = 30.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxSize().padding(top = 15.dp, bottom = 15.dp)
                                )
                            }
                            item {
                                Row(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Divider(
                                        modifier = Modifier.fillMaxSize(0.5f),
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
                                                    ?: 20.sp // Default to 20 sp if map null
                                            saveFontSizeA(fontSizedA.value)
                                        }
                                        .padding(16.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 25.sp)
                                )
                            }
                        }
                    }
                }
                settingSpacerH()
            }
        }
// Navi tail
        Navi.MainScn -> mainScreen()
        Navi.SettingScn -> settingScreen()
        Navi.SettingPingBxs -> settingPingBoxes()
        Navi.SettingOnOffBxs -> settingOnOffBoxes()
    }
}
