package custom_resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//////////////////////////////////////////////////////////// Width

/////////////// MainScreen.kt
@Composable
fun msSpacerH() { Spacer(modifier = Modifier.width(15.dp)) }

/////////////// SettingPingBoxes.kt
@Composable
fun spbSpacerH() { Spacer(modifier = Modifier.width(10.dp)) }

/////////////// SettingOnOffBoxes.kt
@Composable
fun soobSpacerH() { Spacer(modifier = Modifier.width(12.dp)) }

//////////////////////////////////////////////////////////// Height

/////////////// SettingFontSize.kt
@Composable
fun psbSpacerH() { Spacer(modifier = Modifier.height(10.dp)) }

