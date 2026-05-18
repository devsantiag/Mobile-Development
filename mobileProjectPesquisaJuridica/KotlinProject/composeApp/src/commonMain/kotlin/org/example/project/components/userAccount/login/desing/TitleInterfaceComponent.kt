package org.example.project.components.userAccount.login.desing

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.sp

@Composable
fun TitleInterface() {
    Text(
        text = "Sign in",
        color = Color.White,
        fontSize = 25.sp,
        modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Start
    )
}

@Composable
fun NotRegisteredUser(
    onOpenInterfaceRegister: () -> Unit
) {
    val annotatedString = buildAnnotatedString {
        append("New User? ")

        // Usamos LinkAnnotation.Clickable de forma global, não estendida de annotatedString
        withLink(
            link = LinkAnnotation.Clickable(
                tag = "ScreenNavigation.Register.route",
                styles = TextLinkStyles(
                    style = SpanStyle(
                        color = Color(0xFF1E88E5),
                        textDecoration = TextDecoration.Underline
                    )
                ),
                linkInteractionListener = { _ ->
                    // Aciona o callback que veio por parâmetro na função
                    onOpenInterfaceRegister()
                }
            )
        ) {
            append("Register here")
        }

        append(".")
    }

    // Renderiza o texto na tela
    Text(text = annotatedString)
}