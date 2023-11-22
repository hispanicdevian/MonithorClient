package views

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import custom_resources.ErgoGray
import custom_resources.NbtColor
import engine_logic.*
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import mainscreen_boxes.*
import sub_views.settingPingBxs

@Composable
@Preview
fun mainScreen() {

// engine_logic.Screen Navi Ram
    var currentScreen by remember { mutableStateOf<Navi>(Navi.Main) }

// Ping Result Ram
    var pingSuccessful0 by remember { mutableStateOf(false) }
    var pingSuccessful1 by remember { mutableStateOf(false) }
    var pingSuccessful2 by remember { mutableStateOf(false) }
    var pingSuccessful3 by remember { mutableStateOf(false) }
    var pingSuccessful4 by remember { mutableStateOf(false) }
    var pingSuccessful5 by remember { mutableStateOf(false) }
    var pingSuccessful6 by remember { mutableStateOf(false) }
    var pingSuccessful7 by remember { mutableStateOf(false) }
    var pingSuccessful8 by remember { mutableStateOf(false) }
    var pingSuccessful9 by remember { mutableStateOf(false) }
    var pingSuccessful10 by remember { mutableStateOf(false) }
    var pingSuccessful11 by remember { mutableStateOf(false) }
    var pingSuccessful12 by remember { mutableStateOf(false) }
    var pingSuccessful13 by remember { mutableStateOf(false) }
    var pingSuccessful14 by remember { mutableStateOf(false) }
    var pingSuccessful15 by remember { mutableStateOf(false) }

    // Ping Engine Call
    LaunchedEffect(Unit) {
        while (isActive) {
            val resultsA = listOf(
                async { pingEngineAPI(ipAddress0) },
                async { pingEngineAPI(ipAddress1) },
                async { pingEngineAPI(ipAddress2) },
                async { pingEngineAPI(ipAddress3) },
                async { pingEngineAPI(ipAddress4) },
                async { pingEngineAPI(ipAddress5) },
                async { pingEngineAPI(ipAddress6) },
                async { pingEngineAPI(ipAddress7) },
                async { pingEngineAPI(ipAddress8) },
                async { pingEngineAPI(ipAddress9) },
                async { pingEngineAPI(ipAddress10) },
                async { pingEngineAPI(ipAddress11) },
                async { pingEngineAPI(ipAddress12) },
                async { pingEngineAPI(ipAddress13) },
                async { pingEngineAPI(ipAddress14) },
                async { pingEngineAPI(ipAddress15) }
            )
// Ping Result Return From API
            pingSuccessful0 = resultsA[0].await()
            pingSuccessful1 = resultsA[1].await()
            pingSuccessful2 = resultsA[2].await()
            pingSuccessful3 = resultsA[3].await()
            pingSuccessful4 = resultsA[4].await()
            pingSuccessful5 = resultsA[5].await()
            pingSuccessful6 = resultsA[6].await()
            pingSuccessful7 = resultsA[7].await()
            pingSuccessful8 = resultsA[8].await()
            pingSuccessful9 = resultsA[9].await()
            pingSuccessful10 = resultsA[10].await()
            pingSuccessful11 = resultsA[11].await()
            pingSuccessful12 = resultsA[12].await()
            pingSuccessful13 = resultsA[13].await()
            pingSuccessful14 = resultsA[14].await()
            pingSuccessful15 = resultsA[15].await()

            delay(10000) // delay for 10 second
        }
    }

    Box(
        modifier = Modifier.fillMaxSize().background(ErgoGray)
    ) {
        TopAppBar(
            backgroundColor = NbtColor,
            modifier = Modifier.fillMaxWidth()
        ) {
// Clickable Title
            Text("Monotool Client",
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null,
                        onClick = { currentScreen = Navi.Main }
                    )
            )
        }
// Home Button
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 18.dp, start = 20.dp),
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false, radius = 15.dp),
                        onClick = { currentScreen = Navi.Main }
                    )
            ) {
                Image(
                    painter = painterResource("HomePng240.png"),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
// Settings Button
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 17.dp, end = 22.dp),
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = rememberRipple(bounded = false, radius = 15.dp),
                        onClick = { currentScreen = Navi.Settings }
                    )
            ) {
                Image(
                    painter = painterResource("SettingsPng240F.png"),
                    contentDescription = "Sample",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
// Navi Head
        when (currentScreen) {
            is Navi.Main -> {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 55.dp)
                        .padding(horizontal = 15.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
// Box Set A
                    pingBoxesA(pingSuccessful0, pingSuccessful1, pingSuccessful2, pingSuccessful3)
                    Spacer(modifier = Modifier.width(20.dp))
// Box Set B
                    pingBoxesB(pingSuccessful4, pingSuccessful5, pingSuccessful6, pingSuccessful7)
                    Spacer(modifier = Modifier.width(20.dp))
// Box Set C
                    pingBoxesC(pingSuccessful8, pingSuccessful9, pingSuccessful10, pingSuccessful11)
                    Spacer(modifier = Modifier.width(20.dp))
// Box Set D
                    pingBoxesD(pingSuccessful12, pingSuccessful13, pingSuccessful14, pingSuccessful15)
                    //Spacer(modifier = Modifier.width(20.dp))
                }
            }
// Navi Tail
            Navi.Settings -> settingScreen()
            Navi.SettingsPingBoxes -> settingPingBxs()
        }
    }
}
