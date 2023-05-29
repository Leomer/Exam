package com.example.exam.navegation

sealed class AppScreens(val route: String) {
    object SplashScreen: AppScreens(route = "splash_screen")
    object FirstScreen: AppScreens(route= "first_screen")
    object SecondScreen: AppScreens(route= "second_screen")
}
