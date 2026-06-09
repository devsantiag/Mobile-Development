package org.example.project.ui.features.auth.forgotPassword.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Main interface
@Composable
fun ButtonLinkRecoveryAccount(
    onToAccesFormClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 3.dp)
    ) {
        TextButton(
            onClick = {
                onToAccesFormClick()
            },
            contentPadding = PaddingValues(0.dp)
        ) {
            Text(
                text = "Forgot password",
                color = Color(0xFFFFFFFF),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

// Recover account information title
@Composable
fun AccountRecoveryHeader() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Account Recovery",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = "Recover access to your account",
            color = Color(0xFFB8B8B8),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}

// Pop Up interface
@Composable
fun RecoveryContent(
    email: String,
    onEmailChange: (String) -> Unit,
    onSendRecovery: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = email,
            onValueChange = onEmailChange,
            label = { Text("Registered Email") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onSendRecovery,
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black
            )
        ) {
            Text("Send Reset Link")
        }
    }
}