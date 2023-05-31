package com.example.exam.navigation

sealed class AppScreens(val route: String) {
    object SplashScreen: AppScreens(route = "splash_screen")
    object FirstScreen: AppScreens(route= "first_screen")
    object HomeScreen: AppScreens(route= "home_screen")
}
