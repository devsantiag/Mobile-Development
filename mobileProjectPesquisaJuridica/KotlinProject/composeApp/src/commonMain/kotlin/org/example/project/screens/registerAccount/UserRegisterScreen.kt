package org.example.project.screens.registerAccount

import androidx.compose.runtime.Composable
import org.example.project.components.userAccount.register.RegisterForm
import org.example.project.components.userAccount.register.button.SubmitButton
import org.example.project.components.userAccount.register.desingInterface.Header
import org.example.project.components.userAccount.register.desingInterface.UserInterfaceRegisterAccount

@Composable
fun UserRegisterFormsScreen() {
    UserInterfaceRegisterAccount(
        header = { Header() },
        formFields = { RegisterForm() },
        actionButtons = { SubmitButton() }
    )
}

