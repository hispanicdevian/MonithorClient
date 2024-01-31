package custom_resources

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha

@Composable
fun hdiScn(watermark: String) {
    Box(modifier = Modifier.fillMaxSize()) {

        Text(
            text = watermark,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .alpha(0.5f),
            style = MaterialTheme.typography.body1
        )
    }
}