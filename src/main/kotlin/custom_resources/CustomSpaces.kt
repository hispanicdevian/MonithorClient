package custom_resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//////////////////////////////////////////////////////////// Vertical Spacers
@Composable
fun vSpacer10( ) { Spacer(modifier = Modifier.height(10.dp)) }

@Composable
fun vSpacer15( ) { Spacer(modifier = Modifier.height(15.dp)) }

//////////////////////////////////////////////////////////// Horizontal Spacers
@Composable
fun hSpacer10( ) { Spacer(modifier = Modifier.width(10.dp)) }

@Composable
fun hSpacer12( ) { Spacer(modifier = Modifier.width(12.dp)) }

@Composable
fun hSpacer15( ) { Spacer(modifier = Modifier.width(15.dp)) }

@Composable
fun hSpacer20( ) { Spacer(modifier = Modifier.width(20.dp)) }