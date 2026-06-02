package org.example.project.ui.features.auth.login.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleInterface() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Sign in",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Composable
fun RegistrationLinkStyled(
    onOpenInterfaceRegister: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        val annotatedString = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Color(0xFFB3B3B3))) {
                append("New User? ")
            }

            withLink(
                link = LinkAnnotation.Clickable(
                    tag = "register_link",
                    styles = TextLinkStyles(
                        style = SpanStyle(
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    ),
                    linkInteractionListener = {
                        onOpenInterfaceRegister()
                    }
                )
            ) {
                append("Register here")
            }
        }
        Text(
            text = annotatedString,
            fontSize = 17.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}