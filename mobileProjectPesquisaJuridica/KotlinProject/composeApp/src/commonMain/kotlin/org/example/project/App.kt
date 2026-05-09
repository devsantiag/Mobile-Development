import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun App() {

    MaterialTheme {

        Button(onClick = {}) {
            Text("Olá Kotlin Multiplatform")
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}