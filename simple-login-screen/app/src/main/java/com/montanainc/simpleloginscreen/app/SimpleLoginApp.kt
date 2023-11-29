package com.montanainc.simpleloginscreen.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.montanainc.simpleloginscreen.screens.Navigation

@Composable
fun SimpleLoginApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Navigation()
    }
}