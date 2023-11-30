package com.montanainc.halloween.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.montanainc.halloween.components.BottomComponent
import com.montanainc.halloween.components.ForgotPasswordTextComponent
import com.montanainc.halloween.components.HeadingTextComponent
import com.montanainc.halloween.components.ImageComponent
import com.montanainc.halloween.components.MyTextField
import com.montanainc.halloween.components.PasswordInputComponent

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            ImageComponent()
            Spacer(modifier = Modifier.height(10.dp))
            HeadingTextComponent(heading = "Login")
            Spacer(modifier = Modifier.height(20.dp))
            Column {
                MyTextField(labelVal = "email ID")
                Spacer(modifier = Modifier.height(15.dp))
                PasswordInputComponent()
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ForgotPasswordTextComponent()
                }
                BottomComponent()
            }
        }
    }
}
