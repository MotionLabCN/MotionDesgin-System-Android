package com.newtouch.motion_desgin_system_android.ui


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.newtouch.motion_desgin_system_android.R


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TextFieldPage() {
    TextFieldContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TextFieldContent() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "建议和说明", fontWeight = FontWeight.Bold)

            MTPushTips()
            MTSpacer()
            TextFieldTips()

        }
    }
}


/**
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTPushTips(
) {
    var text by remember { mutableStateOf("") }
    var passwordHidden by remember { mutableStateOf(false) }

    TextField(value = text, onValueChange = {
        text = it
    }, trailingIcon = {
        IconButton(onClick = { passwordHidden = !passwordHidden }) {
            Icon(painterResource(id = R.drawable.icon_remove), null)

        }
    },
        visualTransformation = if (passwordHidden) PasswordVisualTransformation() else VisualTransformation.None
    )

}

@Composable
fun TextFieldTips() {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        BasicTextField(
            value = text,
            onValueChange = {
                text = it

            },
            modifier = Modifier
                .background(Color.Yellow)
                .height(35.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 2.dp)
                ) {
                    IconButton(
                        onClick = { }
                    ) {
                        Icon(painterResource(id = R.drawable.icon_logo), null)
                    }
                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        innerTextField()
                    }
                    IconButton(
                        onClick = {
                            text = ""
                        },
                    ) {
                        Icon(Icons.Filled.Search, null)
                    }
                }
            }
        )
    }
}





