package org.example.project.navigation

sealed class ScreenNavgation(val route: String) {
    data object Login : ScreenNavgation("login")
    data object Home : ScreenNavgation("home")
    data object Register : ScreenNavgation("register")
    data object ForgotPassword : ScreenNavgation("forgot_password")
}