package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import custom_resources.misc.ErgoGray
import custom_resources.misc.TurquoiseColor
import custom_resources.misc.mainScreenSideSpacer
import custom_resources.misc.smartText
import engine_logic.Navi
import engine_logic.effectLauncher
import ping_boxes.pingBoxesA
import ping_boxes.pingBoxesB
import ping_boxes.pingBoxesC
import ping_boxes.weatherBoxesA
import sub_views.settingOnOffBoxes
import sub_views.settingPingBoxes

// Main screen/view of the app
@Composable
@Preview
fun mainScreen() {
// Current screen ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.MainScn) }
    var pingResultsTail by remember { mutableStateOf(List(12) { false }) }
    var currentTempA by remember { mutableStateOf("Loading...") }
    var currentSkyA by remember { mutableStateOf("Loading...") }

    effectLauncher(pingResults = { results -> pingResultsTail = results },
        weatherResults = { temp, sky ->
            currentTempA = temp
            currentSkyA = sky
        }
    )
// UI container
    Column(modifier = Modifier.fillMaxSize().background(ErgoGray),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxSize().weight(1f).background(TurquoiseColor)) {
// Home button
            Box(modifier = Modifier.fillMaxSize().weight(1f)
                .size(24.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = rememberRipple(bounded = false, radius = 10.dp),
                    onClick = { currentScreen = Navi.MainScn })) {
                Image(painter = painterResource("HomePng240.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(5.dp)
                )
            }
// Clickable title
            Box(modifier = Modifier.fillMaxSize().weight(1f)) {
                Text("Monithor Kt",
                    fontSize = smartText(1.2f),
                    color = ErgoGray,
                    fontWeight = FontWeight.W900,
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
                .size(24.dp)
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = rememberRipple(bounded = false, radius = 10.dp),
                    onClick = { currentScreen = Navi.SettingScn })) {
                Image(painter = painterResource("SettingsPng240.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize().padding(6.5.dp))
            }
        }
// Navi head
        when (currentScreen) {
            is Navi.MainScn -> {
                Row(modifier = Modifier.fillMaxWidth().weight(10f).padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
// Box set A
                    Column(modifier = Modifier.padding(5.dp).weight(2f))
                    { pingBoxesA(pingResultsTail.subList(0,  4)) }
                    mainScreenSideSpacer()
// Box set B
                    Column(modifier = Modifier.padding(5.dp).weight(2f))
                    { pingBoxesB(pingResultsTail.subList(4,  8)) }
                    mainScreenSideSpacer()
// Box set C
                    Column(modifier = Modifier.padding(5.dp).weight(2f))
                    { pingBoxesC(pingResultsTail.subList(8,  12)) }
                    mainScreenSideSpacer()
// Box set D
                    Column(modifier = Modifier.padding(5.dp).weight(2f))
                    { weatherBoxesA(currentTempA, currentSkyA) }
                }
            }
// Navi tail
            Navi.MainScn -> mainScreen()
            Navi.SettingOnOffBxs -> settingOnOffBoxes()
            Navi.SettingPingBxs -> settingPingBoxes()
            Navi.SettingScn -> settingScreen()
        }
    }
}
