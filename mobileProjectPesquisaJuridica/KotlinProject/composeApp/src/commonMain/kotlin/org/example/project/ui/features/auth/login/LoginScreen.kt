package org.example.project.ui.features.auth.login

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.example.project.ui.features.auth.forgotPassword.components.AccountRecoveryHeader
import org.example.project.ui.features.auth.forgotPassword.components.RecoveryContent
import org.example.project.ui.features.auth.forgotPassword.components.ButtonLinkRecoveryAccount
import org.example.project.ui.features.auth.login.components.LoginFormUser
import org.example.project.ui.features.auth.login.components.RegistrationLinkStyled
import org.example.project.ui.features.auth.login.components.TitleInterface

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    onNavigateToHome: () -> Unit,
    onNavigateToForgotPassword: () -> Unit,
    onOpenInterfaceRegisterNewUser: () -> Unit
) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    var showForgotPassword by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var recoveryEmail by remember { mutableStateOf("") }

    Scaffold(
        containerColor = Color(0xFF1A1A1A)
    ) { paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TitleInterface()

                RegistrationLinkStyled (
                    onOpenInterfaceRegister = onOpenInterfaceRegisterNewUser
                )

                Spacer(modifier = Modifier.height(32.dp))

                LoginFormUser(
                    email = email,
                    onEmailChange = { email = it },
                    password = password,
                    onPasswordChange = { password = it }
                )

                ButtonLinkRecoveryAccount(
                    onToAccesFormClick = {
                        showForgotPassword = true
                    }
                )

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = { if (email.isNotBlank()) onNavigateToHome() },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text("Login")
                }
            }

            if (showForgotPassword) {
                ModalBottomSheet(
                    sheetState = sheetState,
                    onDismissRequest = { showForgotPassword = false },
                    containerColor = Color(0xFF2C2C2E),
                    dragHandle = { BottomSheetDefaults.DragHandle() }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp)
                            .padding(bottom = 40.dp)
                    ) {

                        AccountRecoveryHeader()

                        RecoveryContent(
                            email = recoveryEmail,
                            onEmailChange = { recoveryEmail = it },
                            onSendRecovery = {
                                println("Send E-mail to: $recoveryEmail")
                                showForgotPassword = false
                            }
                        )
                    }
                }
            }
        }
    }
}