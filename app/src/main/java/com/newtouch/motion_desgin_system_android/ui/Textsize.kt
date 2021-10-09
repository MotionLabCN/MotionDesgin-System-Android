package com.newtouch.motion_desgin_system_android.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TextsizePage() {
    TextsizeContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TextsizeContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Textsize()
        }
    }
}


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun Textsize() {
    Text(text = "Large Title", fontSize = 30.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Large Title", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title1", fontSize = 20.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title1", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title2", fontSize = 18.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title2", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title3", fontSize = 14.sp, modifier = Modifier.padding(6.dp))
    Text(text = "Title3", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body1", fontSize = 12.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body1", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body2", fontSize = 10.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body2", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body3", fontSize = 8.sp, modifier = Modifier.padding(6.dp))
    Text(text = "body3", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "caption1", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "caption1", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "caption2", fontSize = 6.sp, modifier = Modifier.padding(6.dp))
    Text(text = "caption2", fontSize = 6.sp, modifier = Modifier.padding(6.dp))


}

@ExperimentalMaterialApi
@Composable
fun mtText(
    string: String,
    color: Color = Color.Black,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(text = string, color = color, fontSize = fontSize, fontWeight = fontWeight)
}
