package com.example.mylogin2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mylogin2.Screen.ScreenMain
import com.example.mylogin2.ui.theme.Mylogin2Theme
import com.example.mylogin2.ui.theme.WhiteOverlay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mylogin2Theme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    ScreenMain()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Mylogin2Theme() {
        ScreenMain()
    }
}
