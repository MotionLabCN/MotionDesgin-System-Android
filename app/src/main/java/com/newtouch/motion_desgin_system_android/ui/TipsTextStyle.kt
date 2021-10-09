package com.newtouch.motion_desgin_system_android.ui


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils
import org.intellij.lang.annotations.JdkConstants


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsTextPage() {
    TipsTextContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsTextContent() {
    Box(contentAlignment=Alignment.TopCenter,
        modifier = Modifier.fillMaxSize(),) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "建议和说明", fontWeight = FontWeight.Bold)

            MTPushTips1(content = "defultdefultdefultdefultdefultdefultdefultdefultdefultdefult",textsize = 20.sp)
            MTSpacer()
            MTPushTips1(content = "fdsfsdfskljfsdjklfjksadjfjslkdjfklsajlfkjksljflajsklfjsdlkjflkjs",textsize = 14.sp)

        }
    }
}


/**
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTPushTips1(
    content: String,
    textsize: TextUnit,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(MTColotUtils.White_000)
                .padding(6.dp) // 内边距
                .width(200.dp)

        ) {
            mtText(
                string = content,
                fontSize = textsize,
                fontWeight = FontWeight.Bold,
            )
        }
}







