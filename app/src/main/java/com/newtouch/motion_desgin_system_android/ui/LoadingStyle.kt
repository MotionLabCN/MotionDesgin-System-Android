package com.newtouch.motion_desgin_system_android.ui


import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.newtouch.motion_desgin_system_android.R
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils
import org.intellij.lang.annotations.JdkConstants


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun LoadingPage() {
    LoadingContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun LoadingContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "progress", fontWeight = FontWeight.Bold)

            MTSpacer()
            MTProgress(R.drawable.icon_logo, "progress")
            MTSpacer()
            MTProgress(R.drawable.icon_notifications, "progress")
            MTSpacer()
            MTProgressText(text ="progressprogressprogressprogress")
            MTSpacer()
            mtText(string = "progerssLine", fontWeight = FontWeight.Bold)
            progerssLine()

        }
    }
}


/**
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTProgress(
    id: Int,
    content: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(MTColotUtils.White_000)
            .padding(6.dp) // 内边距
            .fillMaxWidth()

    ) {
        getMTIcon(id = R.drawable.icon_close,tint = MTColotUtils.White_000)
        CircularProgressIndicator(modifier = Modifier.width(20.dp).height(20.dp))
        mtText(
            string = content,
            fontSize = 14.sp,
            color = MTColotUtils.status_play,
        )
    }

}



@ExperimentalMaterialApi
@Composable
fun MTProgressText(
    text: String = "tips",
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .shadow(elevation = 0.2.dp, shape = RoundedCornerShape(14.dp))
            .background(color = MTColotUtils.Gray_400)
            .padding(14.dp))// 内边距
    {


        CircularProgressIndicator(modifier = Modifier.width(20.dp).height(20.dp).padding(end = 4.dp))
        Text(
            text = text,
            color = MTColotUtils.White_000,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(end = 4.dp)
        )
    }

}

@Composable
fun progerssLine (){
    var progress by remember{ mutableStateOf(0.1f)}

    Slider(
        value = progress,
        colors = SliderDefaults.colors(
            thumbColor = Color.Transparent, // 圆圈的颜色
            activeTrackColor = Color(0xFF0079D3)
        ),
        onValueChange = {
            progress = it
            Log.d("=======","======progress=="+it)
        },
    )

}

@Composable
fun dialog(){
    var flag by remember{ mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = { flag = true }) {
            Text("弹窗")
        }
    }
    if(flag) {
        Dialog(
            onDismissRequest = { flag = false }
        ) {
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    LinearProgressIndicator()
                    Text("加载中 ing...")
                }
            }
        }
    }
}






