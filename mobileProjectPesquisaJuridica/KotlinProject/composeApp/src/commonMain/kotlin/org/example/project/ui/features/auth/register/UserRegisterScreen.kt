package org.example.project.ui.features.auth.register

import androidx.compose.runtime.Composable
import org.example.project.ui.features.auth.register.components.Header
import org.example.project.ui.features.auth.register.components.RegisterForm
import org.example.project.ui.features.auth.register.components.SubmitButton
import org.example.project.ui.features.auth.register.components.UserInterfaceRegisterAccount

@Composable
fun UserRegisterFormsScreen() {
    UserInterfaceRegisterAccount(
        header = { Header() },
        formFields = { RegisterForm() },
        actionButtons = { SubmitButton() }
    )
}