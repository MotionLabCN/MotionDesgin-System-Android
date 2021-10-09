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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ShadowPage() {
    ShadowContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ShadowContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            FuncItem(2.dp, "shadowLow")
            FuncItem(4.dp, "shadowMid")
            FuncItem(8.dp, "shadowHigh")

//            MTShadowCard(dp = 4.dp) {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Text(text = "shadowLow")
//                }
//
//            }
        }
    }
}


@ExperimentalMaterialApi
@Composable
fun FuncItem(dp: Dp, string: String) {
    Column(verticalArrangement = Arrangement.Center) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(20.dp, 40.dp, 20.dp, 0.dp),
//        backgroundColor = func.color,
            elevation = dp,

            ) {

        }
        Text(
            text = string,
            modifier = Modifier
                .padding(top = 6.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
}


/**
 * MT shadow 布局，，，
 */
@ExperimentalMaterialApi
@Composable
fun MTShadowCard(dp: Dp, content: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(10.dp),
//        backgroundColor = func.color,
        elevation = dp,

        ) {
        Surface(
            content = content
        )
    }
}



