package org.example.project

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.example.project.navigation.AppNavigation
import org.example.project.ui.features.auth.register.UserRegisterFormsScreen

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    UserRegisterFormsScreen()
}