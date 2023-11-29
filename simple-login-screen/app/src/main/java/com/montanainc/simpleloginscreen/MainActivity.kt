package com.montanainc.simpleloginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.montanainc.simpleloginscreen.app.SimpleLoginApp
import com.montanainc.simpleloginscreen.screens.LoginScreen
import com.montanainc.simpleloginscreen.ui.theme.SimpleLoginScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleLoginScreenTheme {
                SimpleLoginApp()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleLoginScreenTheme {
        SimpleLoginApp()
    }
}