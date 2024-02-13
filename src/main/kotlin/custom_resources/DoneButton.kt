package custom_resources

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun doneButton(onDoneClick: () -> Unit) {
    Box( modifier = Modifier.fillMaxSize().padding(4.dp)) {
        Column( modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top) {
            Button(modifier = Modifier.fillMaxSize(),
                colors = ButtonDefaults.buttonColors(ErgoGray),
                onClick = { onDoneClick() }
            ) { Text("Done", color = TurquoiseColor, fontSize = smartText(1f),
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}