package org.example.project.navigation

sealed class ScreenNavigation(val route: String) {
    data object Login : ScreenNavigation("login")
    data object Home : ScreenNavigation("home")
    data object Register : ScreenNavigation("register")
    data object ForgotPassword : ScreenNavigation("forgot_password")
}