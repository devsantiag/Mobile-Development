package org.example.project.ui.features.auth.register

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import org.example.project.ui.features.auth.register.components.Header
import org.example.project.ui.features.auth.register.components.RegisterForm
import org.example.project.ui.features.auth.register.components.SubmitButton
import org.example.project.ui.features.auth.register.components.UserInterfaceRegisterAccount
import androidx.compose.ui.graphics.Color

@Composable
fun UserRegisterScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
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
}