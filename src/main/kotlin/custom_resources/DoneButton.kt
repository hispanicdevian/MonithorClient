package custom_resources

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun doneButton(onDoneClick: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize().padding(start = 4.dp, end = 4.dp, top = 3.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(ErgoGray),
                onClick = { onDoneClick() }
            ) {
                Text("Done", color = TurquoiseColor, fontSize = 25.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}