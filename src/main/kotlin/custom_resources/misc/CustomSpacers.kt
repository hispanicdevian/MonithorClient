package custom_resources.misc

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// MainScreen // Width
@Composable
fun mainScreenSideSpacer() { Spacer(modifier = Modifier.width(15.dp)) }
// SettingPingBoxes // Width
@Composable
fun settingPingBoxesSideSpacer() { Spacer(modifier = Modifier.width(8.dp)) }
// SettingOnOffBoxes // Width
@Composable
fun settingOnOffBoxesSideSpacer() { Spacer(modifier = Modifier.width(8.dp)) }

// OnOffSettingBoxes // Height
@Composable
fun onOffBoxesBotSpacer() { Spacer(modifier = Modifier.height(8.dp)) }
// PingBoxes // Height
@Composable
fun pingBoxesTopSpacer() { Spacer(modifier = Modifier.height(15.dp)) }
// PingBoxes // Height
@Composable
fun pingBoxesBotSpacer() { Spacer(modifier = Modifier.height(15.dp)) }
