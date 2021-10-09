package com.newtouch.motion_desgin_system_android.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.newtouch.motion_desgin_system_android.ui.theme.Purple700

@Composable
fun AppBar(
    title: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
) {
    TopAppBar(backgroundColor= Purple700) {
        Row {
            leftIcon?.let {
                Icon(leftIcon, contentDescription = null, Modifier.clickable {
                    onLeftClick()
                })
            }
            Text(text = title, modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
            rightIcon?.let {
                Icon(rightIcon, contentDescription = null, Modifier.clickable {
                    onRightClick()
                })
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewAppBar() {
    AppBar("hello")
}
