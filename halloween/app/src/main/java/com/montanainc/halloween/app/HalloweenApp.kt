package com.montanainc.halloween.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.montanainc.halloween.screens.ForgotPasswordScreen
import com.montanainc.halloween.screens.LoginScreen
import com.montanainc.halloween.screens.ResetPasswordScreen
import com.montanainc.halloween.screens.SignupScreen

@Composable
fun HalloweenApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        ResetPasswordScreen()
    }
}