package org.example.project.components.userAccount.forgotPassword

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Button to access to the Form for Recovery user account
@Composable
fun ButtonLinkRecoveryAccount(
    onToAccesFormClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
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