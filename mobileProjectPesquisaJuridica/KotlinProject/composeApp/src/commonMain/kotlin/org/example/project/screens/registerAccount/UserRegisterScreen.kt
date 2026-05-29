package org.example.project.screens.registerAccount

import androidx.compose.runtime.Composable
import org.example.project.components.userAccount.register.RegisterForm
import org.example.project.components.userAccount.register.desingInterface.Header
import org.example.project.components.userAccount.register.desingInterface.UserInterfaceRegisterAccount
import org.example.project.ui.features.auth.register.components.SubmitButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.example.project.ui.features.auth.register.components.RegisterForm

@Composable
fun UserRegisterFormsScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    UserInterfaceRegisterAccount(
        header = { Header() },


        formFields = {
            RegisterForm(
                email = email,
                password = password,
                onEmailChange = { email = it },
                onPasswordChange = { password = it }
            )
        },

        actionButtons = {
            SubmitButton(
                email = email,
                password = password
            )
        }
    )
}