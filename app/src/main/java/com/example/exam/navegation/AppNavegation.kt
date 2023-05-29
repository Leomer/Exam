package com.example.exam.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exam.MainScreen
import com.example.exam.SplashScreen

@Composable
fun AppNavegation() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {
        composable(AppScreens.SplashScreen.route){
            SplashScreen(navController)
        }

        composable(AppScreens.FirstScreen.route) {
            MainScreen()
        }
    }

}