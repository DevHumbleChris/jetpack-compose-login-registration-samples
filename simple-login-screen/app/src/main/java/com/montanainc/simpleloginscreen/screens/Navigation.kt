package com.montanainc.simpleloginscreen.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Login"
    ) {
        composable(route = "Login") {
            LoginScreen(navController)
        }
        composable(route = "Signup") {
            SignupScreen(navController)
        }
    }
}