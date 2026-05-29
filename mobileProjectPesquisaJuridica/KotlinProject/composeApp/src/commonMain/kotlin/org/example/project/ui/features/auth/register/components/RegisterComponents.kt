package org.example.project.ui.features.auth.register.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.components.userAccount.register.button.RegisterButton
import org.example.project.components.userAccount.register.pageDesignStructure.FormRegisterAccount
import org.example.project.components.userAccount.register.pageDesignStructure.TitleInformation

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TitleInformation()
    }
}

@Composable
fun RegisterForm(
    email: String,
    password: String,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        FormRegisterAccount(
            email = email,
            password = password,
            onEmailChange = onEmailChange,
            onPasswordChange = onPasswordChange
        )
    }
}

@Composable
fun SubmitButton(
    email: String,
    password: String
) {
    RegisterButton(
        onClick = {
            println("Email: $email")
            println("Password: $password")
        }
    )
}

@Composable
fun UserInterfaceRegisterAccount(
    header: @Composable () -> Unit,
    formFields: @Composable () -> Unit,
    actionButtons: @Composable () -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(150.dp))

        header()

        Spacer(modifier = Modifier.height(24.dp))

        formFields()

        Spacer(modifier = Modifier.height(32.dp))

        actionButtons()
    }
}