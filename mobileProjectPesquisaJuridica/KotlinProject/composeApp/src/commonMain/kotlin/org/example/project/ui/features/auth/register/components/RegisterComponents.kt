package org.example.project.ui.features.auth.register.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    // Implementação do Header
}

@Composable
fun RegisterForm() {
    // Implementação do formulário
}

@Composable
fun SubmitButton() {
    // Botão de envio
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
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        header()
        formFields()
        actionButtons()
    }
}