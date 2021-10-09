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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun HovelPage() {
    HovelContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun HovelContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {

            mtText(string = "Divider", fontWeight = FontWeight.Bold)
            MTSpacer(dp = 10.dp)
            MTDivider(with = 80.dp,color = MTColotUtils.Gray_600)
            MTSpacer(dp = 10.dp)
            mtText(string = "divider")
            Spacer(modifier = Modifier.padding(20.dp))
            mtText(string = "Spacer", fontWeight = FontWeight.Bold)

            MTSpacer()
            Box(
                modifier = Modifier
                    .width(8.dp)
                    .height(8.dp)
                    .background(MTColotUtils.Accent_Purple),
            ) {

            }
            mtText(string = "8")
            MTSpacer()
            Box(
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .background(MTColotUtils.Accent_Purple),
            ) {

            }
            mtText(string = "16")
            Spacer(modifier = Modifier.padding(4.dp))
            Box(
                modifier = Modifier
                    .width(32.dp)
                    .height(32.dp)
                    .background(MTColotUtils.Accent_Purple),
            ) {

            }
            mtText(string = "32")

        }
    }
}


/**
 * 默认分割线  默认填充宽度，默认高度1dp。颜色#9E9E9E
 */
@ExperimentalMaterialApi
@Composable
fun MTDivider(with: Dp? =null, height: Dp=1.dp, color: Color=MTColotUtils.Gray_500) {
    Box(
        modifier =
        if (with==null){
            Modifier
                .fillMaxWidth()
                .height(height)
                .background(color)
        }else {
            Modifier
                .width(with)
                .height(height)
                .background(color)
        }

    ) {

    }

}

/**
 * 默认间隙8dp
 */
@ExperimentalMaterialApi
@Composable
fun MTSpacer(dp: Dp=8.dp) {
    Spacer(modifier = Modifier.padding(dp))
}






