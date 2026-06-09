package org.example.project.ui.features.auth.login.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinproject.composeapp.generated.resources.Res
import kotlinproject.composeapp.generated.resources.mobile_logo_interface
import org.jetbrains.compose.resources.painterResource

// Logo Image
@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(
            resource = Res.drawable.mobile_logo_interface
        ),
        contentDescription = "Logo",
        modifier = modifier.size(150.dp)
    )
}