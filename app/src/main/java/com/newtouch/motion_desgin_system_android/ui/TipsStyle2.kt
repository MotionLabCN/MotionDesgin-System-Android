package com.newtouch.motion_desgin_system_android.ui


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.newtouch.motion_desgin_system_android.R
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsPage2() {
    TipsContent2()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsContent2() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "Warning", fontWeight = FontWeight.Bold)

            MTPWarnTips(R.drawable.icon_remove,"无法连接网络","要查看页面能容,你需要开启网络功能",onClick = {


            })
            MTSpacer()
            MTPWarnTips(R.drawable.icon_notifications,"Title","xxxxxxxxxxxxxxxxxxxx",onClick = {

            })

        }
    }
}


/**
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTPWarnTips(
    id:Int,
    title:String,
    content:String,
    onClick:() -> Unit,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .shadow(elevation = 1.dp, shape = RoundedCornerShape(10.dp))
                .background(MTColotUtils.White_000)
                .fillMaxWidth()
                .padding(14.dp) // 内边距

        ) {
            getMTIcon(id = id,tint = MTColotUtils.status_danger)
            MTSpacer()
            mtText(string = title, color = MTColotUtils.Black_1000, fontWeight = FontWeight.Bold)
            MTSpacer()
            mtText(
                string = content,
                fontSize = 12.sp,
                color = MTColotUtils.Black_1000
            )
        }
        MTSpacer()

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .shadow(elevation = 1.dp, shape = RoundedCornerShape(10.dp))
                .background(MTColotUtils.White_000)
                .padding(6.dp) // 内边距
                .fillMaxWidth()
                .clickable {
                    onClick
                }

        ) {

            mtText(
                string = "弃用网络功能",
                fontSize = 14.sp,
                color = MTColotUtils.status_play,
            )
        }
    }

}









