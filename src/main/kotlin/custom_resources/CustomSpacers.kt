package custom_resources

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//// Width

@Composable
fun msSpacerW() { Spacer(modifier = Modifier.width(15.dp)) }
@Composable
fun spbSpacerW() { Spacer(modifier = Modifier.width(8.dp)) }
@Composable
fun soobSpacerW() { Spacer(modifier = Modifier.width(8.dp)) }

//// Height

@Composable
fun oosbSpacerHBot() { Spacer(modifier = Modifier.height(8.dp)) }
@Composable
fun pbSpacerHTop() { Spacer(modifier = Modifier.height(15.dp)) }
@Composable
fun pbSpacerHBot() { Spacer(modifier = Modifier.height(15.dp)) }
