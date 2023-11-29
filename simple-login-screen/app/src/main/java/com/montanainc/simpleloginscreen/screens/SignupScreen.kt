package com.montanainc.simpleloginscreen.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.montanainc.simpleloginscreen.components.BottomComponent
import com.montanainc.simpleloginscreen.components.CheckboxComponent
import com.montanainc.simpleloginscreen.components.HeadingTextComponent
import com.montanainc.simpleloginscreen.components.MyTextFieldComponent
import com.montanainc.simpleloginscreen.components.NormalTextComponent
import com.montanainc.simpleloginscreen.components.PasswordTextFieldComponent

@Composable
fun SignupScreen(navController: NavHostController) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = "Hello there,")
            HeadingTextComponent(value = "Create an Account")
            Spacer(modifier = Modifier.height(25.dp))

            Column {
                MyTextFieldComponent(
                    labelValue = "First Name",
                    icon = Icons.Outlined.Person
                )
                Spacer(modifier = Modifier.height(10.dp))
                MyTextFieldComponent(
                    labelValue = "Last Name",
                    icon = Icons.Outlined.Person
                )
                Spacer(modifier = Modifier.height(10.dp))
                MyTextFieldComponent(
                    labelValue = "Email",
                    icon = Icons.Outlined.Email
                )
                Spacer(modifier = Modifier.height(10.dp))
                PasswordTextFieldComponent(
                    labelValue = "Password",
                    icon = Icons.Outlined.Lock
                )
                CheckboxComponent()
                BottomComponent(
                    textQuery = "Already have an account? ",
                    textClickable = "Login",
                    action = "Register",
                    navController
                )
            }
        }
    }
}