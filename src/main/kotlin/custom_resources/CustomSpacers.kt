package custom_resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//////////////////////////////////////////////////////////// Width

/////////////// MainScreen.kt
fun msSpacerH() { Spacer(modifier = Modifier.width(15.dp)) }

/////////////// SettingPingBoxes.kt
fun spbSpacerH() { Spacer(modifier = Modifier.width(10.dp)) }

/////////////// SettingOnOffBoxes.kt
fun soobSpacerH() { Spacer(modifier = Modifier.width(12.dp)) }


//////////////////////////////////////////////////////////// Height

/////////////// PingSettingBoxes.kt
fun psbSpacerH() { Spacer(modifier = Modifier.height(10.dp)) }
fun psbSpacerHBot() { Spacer(modifier = Modifier.height(10.dp)) }

/////////////// OnOffSettingBoxes.kt
fun oosbSpacerHTop() { Spacer(modifier = Modifier.height(15.dp)) }
fun oosbSpacerHBot() { Spacer(modifier = Modifier.height(12.dp)) }

