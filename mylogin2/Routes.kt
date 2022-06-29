package com.example.mylogin2

sealed class Routes(val route: String) {
    object LandingScreen: Routes("LandingScreen")
    object Login : Routes("Login")
object SignUp: Routes("SignUp")
    object ForgotPassword:Routes("ForgotPassword")
    object MainScreen: Routes("MainScreen")
}

