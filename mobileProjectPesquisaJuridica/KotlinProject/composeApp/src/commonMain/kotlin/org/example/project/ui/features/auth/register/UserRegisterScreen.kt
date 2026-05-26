package org.example.project.ui.features.auth.register

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.example.project.ui.features.auth.register.components.Header
import org.example.project.ui.features.auth.register.components.RegisterForm
import org.example.project.ui.features.auth.register.components.SubmitButton
import org.example.project.ui.features.auth.register.components.UserInterfaceRegisterAccount
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun UserRegisterFormsScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        UserInterfaceRegisterAccount(
            header = { Header() },
            formFields = { RegisterForm() },
            actionButtons = { SubmitButton() }
        )
    }
}