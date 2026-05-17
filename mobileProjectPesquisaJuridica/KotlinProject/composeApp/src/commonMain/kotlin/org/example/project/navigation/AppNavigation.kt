package org.example.project.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.example.project.screens.*
import org.example.project.screens.home.HomeScreen
import org.example.project.screens.recoverPassword.ForgotPasswordScreen
import org.example.project.screens.registerAccount.UserRegister

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val mainThemeColors = darkColorScheme(
        background = Color(0xFF000000),
        onBackground = Color.White
    )
    MaterialTheme(
        colorScheme = mainThemeColors
    ) {
        NavHost(
            navController = navController,
            startDestination = ScreenNavgation.Login.route
        ) {

            composable(ScreenNavgation.Login.route) {
                LoginScreen(
                    onNavigateToHome = {
                        navController.navigate(ScreenNavgation.Login.route)
                    },
                )
            }

            composable(ScreenNavgation.Home.route) {
                HomeScreen(
                    onLogout = {
                        navController.navigate(ScreenNavgation.Home.route)
                    }
                )
            }

            composable(ScreenNavgation.Register.route) {
                UserRegister()
            }

            composable(ScreenNavgation.ForgotPassword.route) {
                ForgotPasswordScreen(
                    onNavigateBack = {
                        navController.popBackStack()
                    },
                    onSendResetLink = { email -> }
                )
            }
        }
    }
}