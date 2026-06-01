package org.example.project.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.example.project.ui.features.auth.login.LoginScreen
import org.example.project.ui.features.home.HomeScreen
import org.example.project.ui.features.auth.forgotPassword.ForgotPasswordScreen
import org.example.project.ui.features.auth.register.UserRegisterScreen

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
            startDestination = ScreenNavigation.Login.route

        ) {
            composable(ScreenNavigation.Login.route) {
                LoginScreen(
                    onNavigateToHome = {
                        navController.navigate(ScreenNavigation.Home.route)
                    },
                    onNavigateToForgotPassword = {
                        navController.navigate(ScreenNavigation.ForgotPassword.route)
                    },
                    onOpenInterfaceRegisterNewUser = {
                        navController.navigate(ScreenNavigation.Register.route)
                    }
                )
            }

            composable(ScreenNavigation.Home.route) {
                HomeScreen(
                    onLogout = {
                        navController.navigate(ScreenNavigation.Login.route)
                    }
                )
            }

            composable(ScreenNavigation.Register.route) {
                UserRegisterScreen()
            }

            composable(ScreenNavigation.ForgotPassword.route) {
                ForgotPasswordScreen(
                    onNavigateBack = {
                        navController.popBackStack()
                    },
                    onSendResetLink = { email: String -> }
                )
            }
        }
    }
}