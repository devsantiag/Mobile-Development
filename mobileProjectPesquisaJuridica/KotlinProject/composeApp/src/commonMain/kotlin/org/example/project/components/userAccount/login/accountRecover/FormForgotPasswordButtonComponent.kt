package org.example.project.components.userAccount.login.accountRecover

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Header -- page desgin
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
            color = Color(0xFF8E8E93),
            fontSize = 15.sp,
            modifier = Modifier.padding(top = 10.dp)
        )
    }
}

// Form Recover Account
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