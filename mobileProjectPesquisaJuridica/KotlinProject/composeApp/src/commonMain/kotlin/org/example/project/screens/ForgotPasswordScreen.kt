package org.example.project.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ForgotPasswordScreen(
    onNavigateBack: () -> Unit,
    onSendResetLink: (String) -> Unit
) {


}

@Preview(showBackground = true)
@Composable
fun ForgotPasswordScreenPreview() {

    ForgotPasswordScreen(
        onNavigateBack = {},
        onSendResetLink = {}
    )

}