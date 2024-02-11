package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.TurquoiseColor
import engine_logic.Navi
import sub_views.settingFontSize
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes

////////////////////////////// Settings selector screen/view
@Composable
@Preview
fun settingScreen() {
    var currentScreen by remember { mutableStateOf<Navi>(Navi.SettingScn) }
    var currentScreenA by remember { mutableStateOf(false) }
    var currentScreenB by remember { mutableStateOf(false) }
    var currentScreenC by remember { mutableStateOf(false) }

// Navi set
    if (currentScreenA) { settingPingBoxes() }
    else if (currentScreenB) { settingOnOffBoxes() }
    else if (currentScreenC) { settingFontSize() }
    else {

// UI container
        Column( modifier = Modifier.fillMaxSize().background(ErgoGray),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {

// Home button
                Box(modifier = Modifier.fillMaxSize().weight(1f)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false, radius = 15.dp),
                        onClick = { currentScreen = Navi.MainScn })
                ) { Image(painter = painterResource("HomePng240.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(5.dp)
                    )
                }

// Clickable Title
                Box(modifier = Modifier.fillMaxSize().weight(1f)) {
                    Text("Monithor Client", fontSize = 26.sp,
                        color = ErgoGray, fontWeight = FontWeight.W900,
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(Alignment.Center)
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null,
                                onClick = { currentScreen = Navi.MainScn }
                            )
                    )
                }

// Settings button
                Box(modifier = Modifier.fillMaxSize().weight(1f)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false, radius = 15.dp),
                        onClick = { currentScreen = Navi.SettingScn })
                ) { Image(painter = painterResource("SettingsPng240F.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(6.5.dp))
                }
            }

// Navi head
            when (currentScreen) {
                is Navi.SettingScn -> {
                    Row(
                        modifier = Modifier.fillMaxWidth().weight(10f).padding(horizontal = 5.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        val itemsList = listOf("IP Settings", "On / Off", "Font Size")
                        LazyColumn(
                            modifier = Modifier.fillMaxHeight(),
                            state = rememberLazyListState(),
                            verticalArrangement = Arrangement.Center
                        ) {
                            items(itemsList) { item ->
                                Text(
                                    color = Color.White,
                                    text = item,
// Navi buttons
                                    modifier = Modifier
                                        .clickable {
                                            if (item == "IP Settings") {
                                                currentScreenA = true
                                            }
                                            if (item == "On / Off") {
                                                currentScreenB = true
                                            }
                                            if (item == "Font Size") {
                                                currentScreenC = true
                                            }
                                        }
                                        .padding(28.dp)
                                        .fillMaxSize(),
                                    textAlign = TextAlign.Center,
                                    style = TextStyle(fontSize = 30.sp)
                                )
                            }
                        }
                    }
                }
// Navi Tail
                Navi.MainScn -> mainScreen()
                Navi.SettingFontSz -> settingFontSize()
                Navi.SettingOnOffBxs -> settingOnOffBoxes()
                Navi.SettingPingBxs -> settingPingBoxes()
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}