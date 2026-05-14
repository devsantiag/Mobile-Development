package org.example.project

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


// The Principal Body System
@Composable
fun App() {
    val navController = rememberNavController()

    LaunchedEffect(Unit) {
        println(navController)
    }

    val mainThemeColors = darkColorScheme(
        background = Color(0xFF000000),
        onBackground = Color.White
    )

    MaterialTheme(colorScheme = mainThemeColors) {
        NavHost(
            navController = navController,
            startDestination = "Login"
        ) {

            composable("Login") {
                LoginScreen(

                    onNavigateToHome = {
                        navController.navigate("home")
                    },

                    onNavigateToForgotPassword = {
                        navController.navigate("forgot_password")
                    }
                )
            }

            composable("home") {
                HomeScreen (

                    onLogout = {
                        navController.navigate("home")
                    }

                )
            }

            composable("forgot_password") {

                ForgotPasswordScreen(

                    onNavigateBack = {
                        navController.popBackStack()
                    },

                    onSendResetLink = { email ->
                        println("Reset link enviado para: $email")
                    }
                )
            }



        }
    }
}


@Composable
fun TitleInterface() {
    Text(
        text = "Credit registration system",
        color = Color.White,
        fontSize = 25.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Start
    )
}

@Composable
fun LoginScreen(
    onNavigateToHome: () -> Unit,
    onNavigateToForgotPassword: () -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF1A1A1A)
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            TitleInterface()

            LoginFormUser(
                email = email,
                onEmailChange = { email = it },
                password = password,
                onPasswordChange = { password = it }
            )

            ForgotPasswordButton(
                onClick = onNavigateToForgotPassword
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    if (email.isNotBlank()) {
                        onNavigateToHome()
                    }
                },
                modifier = Modifier.fillMaxWidth(),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text("Login")
            }
        }
    }
}


@Composable
fun LoginFormUser(
    email: String,
    onEmailChange: (String) -> Unit,
    password: String,
    onPasswordChange: (String) -> Unit
) {
    // E-mail Field
    OutlinedTextField(
        value = email,
        onValueChange = { onEmailChange(it) },
        label = { Text("E-mail") },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        singleLine = true
    )

    Spacer(modifier = Modifier.height(10.dp))

    // Password Field
    OutlinedTextField(
        value = password,
        onValueChange = { onPasswordChange(it) },
        label = { Text("Password") },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true
    )

    Spacer(modifier = Modifier.height(5.dp))

}

// Button/Link for to password recover
@Composable
fun ForgotPasswordButton(
    onClick: () -> Unit
) {
    Text(
        text = "Forgot Password",
        color = Color.White,
        fontSize = 15.sp,
        modifier = Modifier
            .padding(start = 3.dp)
            .fillMaxWidth()
            .clickable {
                onClick()
            },
    )
}


// Password reset function
@Composable
fun ForgotPasswordScreen(
    onNavigateBack: () -> Unit,
    onSendResetLink: (String) -> Unit
) {
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "Reset Password",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Enter your email to receive a reset link",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = { onSendResetLink(email) },
            modifier = Modifier.fillMaxWidth(),
            enabled = email.isNotBlank()
        ) {
            Text("Send Link")
        }

        TextButton(onClick = onNavigateBack) {
            Text("Back to Login")
        }
    }
}

@Composable
fun HomeScreen(onLogout: () -> Unit) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF1A1A1A)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Dashboard!", fontSize = 24.sp, color = Color.White)
            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = onLogout) {
                Text("Logout")
            }
        }
    }
}