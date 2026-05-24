package org.example.project.screens.registerAccount

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import org.example.project.components.userAccount.register.desingInterface.UserInterfaceRegisterAccount

@Composable
fun UserRegisterFormsScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    UserInterfaceRegisterAccount(

        header = {
            Text(text = "New Account", style = MaterialTheme.typography.headlineLarge)
        },

        formFields = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth()
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    visualTransformation = PasswordVisualTransformation(),
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },

        actionButtons = {
            Button(
                onClick = {
                    if (email.isNotBlank() && password.isNotBlank()) {
                        println("Register with $email")
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sign Up")
            }
        }
    )
}