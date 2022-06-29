package com.example.mylogin2.Screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mylogin2.Routes

@Composable
fun ScreenMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LandingScreen.route) {
        composable(Routes.LandingScreen.route){
                    LandingScreen(navController=navController)
}
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
        composable(Routes.MainScreen.route){
            MainScreen(navController=navController)
        }

        composable(Routes.SignUp.route) {
            SignUp(navController = navController)
        }

        composable(Routes.ForgotPassword.route) {
            ForgotPassword(navController = navController)
        }
    }
}
