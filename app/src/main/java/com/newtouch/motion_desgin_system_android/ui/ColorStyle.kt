package com.newtouch.motion_desgin_system_android.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ColorPage() {
    ColorContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ColorContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            colorList(MTColotUtils.Accent_Purple,"Accent_Purple")
            colorList(MTColotUtils.Accent_900,"Accent_900")
            colorList(MTColotUtils.Accent_800,"Accent_800")
            colorList(MTColotUtils.Accent_700,"Accent_700")
            colorList(MTColotUtils.Accent_600,"Accent_600")
            colorList(MTColotUtils.Accent_500,"Accent_500")
            colorList(MTColotUtils.Accent_400,"Accent_400")
            colorList(MTColotUtils.Accent_300,"Accent_300")
            colorList(MTColotUtils.Accent_200,"Accent_200")
            colorList(MTColotUtils.Accent_100,"Accent_100")
            colorList(MTColotUtils.Accent_50,"Accent_50")

            colorList(MTColotUtils.Black_1000,"Black_1000")
            colorList(MTColotUtils.Gray_900,"Gray_900")
            colorList(MTColotUtils.Gray_800,"Gray_800")
            colorList(MTColotUtils.Gray_700,"Gray_700")
            colorList(MTColotUtils.Gray_600,"Gray_600")
            colorList(MTColotUtils.Gray_500,"Gray_500")
            colorList(MTColotUtils.Gray_400,"Gray_400")
            colorList(MTColotUtils.Gray_300,"Gray_300")
            colorList(MTColotUtils.Gray_200,"Gray_200")
            colorList(MTColotUtils.Gray_100,"Gray_100")
            colorList(MTColotUtils.Gray_50,"Gray_50")
            colorList(MTColotUtils.White_000,"White_000")


            colorList(MTColotUtils.status_danger,"status_danger")
            colorList(MTColotUtils.status_warning,"status_warning")
            colorList(MTColotUtils.status_success,"status_success")
            colorList(MTColotUtils.status_play,"status_play")

            colorList(MTColotUtils.opacity_80,"opacity_80")
            colorList(MTColotUtils.opacity_50,"opacity_50")

        }
    }
}





@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun colorList(color: Color,colorName:String) {

    Column(Modifier.padding(18.dp,0.dp,18.dp,0.dp)) {
        Box(
            modifier = Modifier
                .background(color)
                .fillMaxWidth()
                .height(50.dp).padding(top=10.dp),
        )
        Text(
            text = colorName,
            modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 10.dp),
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    }

}
