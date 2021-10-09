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
import androidx.compose.ui.unit.dp
import com.newtouch.motion_desgin_system_android.R
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils
import org.intellij.lang.annotations.JdkConstants


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsPage() {
    TipsContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TipsContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "PushNofitf", fontWeight = FontWeight.Bold)

            MTPushTips(text = "全局提示--defult", bgColor = MTColotUtils.Black_1000)
            MTPushTips(text = "全局提示--danger", bgColor = MTColotUtils.status_danger)
            MTPushTips(text = "全局提示--success", bgColor = MTColotUtils.status_success)
            MTPushTips(text = "全局提示--warning", bgColor = MTColotUtils.status_warning)


            MTPushTips(text = "全局提示--defult", true, bgColor = MTColotUtils.Black_1000)
            MTPushTips(text = "全局提示--danger", true, bgColor = MTColotUtils.status_danger)
            MTPushTips(text = "全局提示--success", true, bgColor = MTColotUtils.status_success)
            MTPushTips(text = "全局提示--warning", true, bgColor = MTColotUtils.status_warning)
        }
    }
}


/**
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTPushTips(
    text: String = "tips",
    hasClose: Boolean = false,
    bgColor: Color = MTColotUtils.Black_1000
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        elevation = 2.dp,
        color = bgColor,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp) // 外边距
    ) {
//        Column(
//            modifier = Modifier
//                .clickable { }
//                .padding(14.dp) // 内边距
//        ) {
//
//            Text(text = text, color = MTColotUtils.White_000)
//
//        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable {
                    Log.d("============", "======MTPushTips========")
                }
                .padding(14.dp))// 内边距
        {
            Text(
                text = text,
                color = MTColotUtils.White_000,
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 4.dp)
            )
            if (hasClose) {
                getImageIcon(id = R.drawable.icon_close)
            }
        }
    }

}







