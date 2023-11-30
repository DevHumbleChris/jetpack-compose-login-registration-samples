package com.montanainc.halloween.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.montanainc.halloween.R
import com.montanainc.halloween.ui.theme.BorderColor
import com.montanainc.halloween.ui.theme.BrandColor
import com.montanainc.halloween.ui.theme.Primary
import com.montanainc.halloween.ui.theme.Tertirary

@Composable
fun ImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.sweet_franky),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .size(250.dp)
    )
}

@Composable
fun HeadingTextComponent(heading: String) {
    Text(
        text = heading,
        modifier = Modifier.fillMaxWidth(),
        fontSize = 39.sp,
        color = Primary,
        fontWeight = FontWeight.Bold
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(labelVal: String) {
    var textVal by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = textVal,
        onValueChange = {
            textVal = it
        },
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = BrandColor,
            unfocusedBorderColor = BorderColor,
            textColor = Color.Black
        ),
        shape = MaterialTheme.shapes.small,
        placeholder = {
            Text(text = labelVal, color = Tertirary)
        },
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.at_symbol),
                contentDescription = "at_symbol",
                tint = Tertirary
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordInputComponent() {
    var password by remember {
        mutableStateOf("")
    }
    var isShowPassword by remember {
        mutableStateOf(false)
    }
    OutlinedTextField(
        value = password,
        onValueChange = {
            password = it
        },
        modifier = Modifier.fillMaxWidth(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = BrandColor,
            unfocusedBorderColor = BorderColor,
            textColor = Color.Black
        ),
        shape = MaterialTheme.shapes.small,
        placeholder = {
            Text(text = "Password", color = Tertirary)
        },
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.lock),
                contentDescription = "at_symbol",
                tint = Tertirary
            )
        },
        trailingIcon = {
            val description = if (isShowPassword) "Show Password" else "Hide Password"
            val iconImage =
                if (isShowPassword) R.drawable.pheyeclosedfill__1_ else R.drawable.eye_closed
            IconButton(onClick = {
                isShowPassword = !isShowPassword
            }) {
                Icon(
                    painter = painterResource(id = iconImage),
                    contentDescription = description,
                    tint = Tertirary,
                )
            }
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (isShowPassword) VisualTransformation.None else PasswordVisualTransformation()
    )
}

@Composable
fun ForgotPasswordTextComponent() {
    Text(
        text = "Forgot Password?",
        color = BrandColor,
        fontWeight = FontWeight.Bold,
    )
}

@Composable
fun BottomComponent() {
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Column {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = BrandColor
                ),
                modifier = Modifier.fillMaxWidth().padding(top = 40.dp)
            ) {
                Text(
                    text = "Continue",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }
        }
    }
}