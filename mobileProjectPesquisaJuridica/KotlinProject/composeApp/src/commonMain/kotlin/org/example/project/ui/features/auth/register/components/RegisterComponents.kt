package org.example.project.ui.features.auth.register.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.components.userAccount.register.pageDesignStructure.TitleInformation

@Composable
fun Header() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        TitleInformation()
    }
}

@Composable
fun RegisterForm() {

}

@Composable
fun SubmitButton() {

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