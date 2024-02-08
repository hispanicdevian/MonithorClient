package custom_resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

////////////////////////////// Width

/////////////// MainScreen.kt
@Composable
fun msSpacerW() { Spacer(modifier = Modifier.width(15.dp)) }

/////////////// SettingPingBoxes.kt
@Composable
fun spbSpacerW() { Spacer(modifier = Modifier.width(8.dp)) }

/////////////// SettingOnOffBoxes.kt
@Composable
fun soobSpacerW() { Spacer(modifier = Modifier.width(8.dp)) }

////////////////////////////// Height

/////////////// PingSettingBoxes.kt

@Composable
fun oosbSpacerHBot() { Spacer(modifier = Modifier.height(12.dp)) }

/////////////// PingBoxes.kt
@Composable
fun pbSpacerHTop() { Spacer(modifier = Modifier.height(15.dp)) }
@Composable
fun pbSpacerHBot() { Spacer(modifier = Modifier.height(15.dp)) }
@Composable
fun settingSpacerH() { Spacer(modifier = Modifier.height(10.dp)) }
