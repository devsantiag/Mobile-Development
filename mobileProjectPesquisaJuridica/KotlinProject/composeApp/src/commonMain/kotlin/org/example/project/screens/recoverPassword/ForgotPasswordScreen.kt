package org.example.project.screens.recoverPassword

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.components.userAccount.login.accountRecover.AccountRecoveryHeader
import org.example.project.components.userAccount.login.accountRecover.RecoveryContent

@Composable
fun ForgotPasswordScreen(
    onNavigateBack: () -> Unit,
    onSendResetLink: (String) -> Unit
) {
    var emailState by remember { mutableStateOf("") }

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AccountRecoveryHeader()

            Spacer(modifier = Modifier.height(24.dp))

            RecoveryContent(
                email = emailState,
                onEmailChange = { emailState = it },
                onSendRecovery = {
                    onSendResetLink(emailState)
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = onNavigateBack) {
                Text("Back to Login", color = MaterialTheme.colorScheme.onBackground)
            }
        }
    }
}