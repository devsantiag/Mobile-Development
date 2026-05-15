package org.example.project.navigation

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.example.project.screens.*

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
            startDestination = Screen.Login.route
        ) {

            composable(Screen.Login.route) {
                LoginScreen(
                    onNavigateToHome = {
                        navController.navigate(Screen.Login.route)
                    },
                )
            }

            composable(Screen.Home.route) {
                HomeScreen(
                    onLogout = {
                        navController.navigate(Screen.Home.route)
                    }
                )
            }
        }
    }
}
