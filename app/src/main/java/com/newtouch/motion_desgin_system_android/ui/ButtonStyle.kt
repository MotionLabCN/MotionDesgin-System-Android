package com.newtouch.motion_desgin_system_android.ui

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*

import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ButtonPage() {
    ButtonContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ButtonContent() {
    val current = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {
            mtText(string = "SmallBtn", fontWeight = FontWeight.Bold)
            MTSpacer()
            MTSmallBtn(true, onClick = {
                Toast.makeText(current, "这是一个按钮", Toast.LENGTH_SHORT).show()
            })

            mtText(string = "Defult")
            MTSpacer()
            MTSmallBtn(
                enable = false,
                textColor = MTColotUtils.Gray_700,
                bgColor = MTColotUtils.Gray_300)
            mtText(string = "Unable")
            MTSpacer()
            MTSmallStorkerBtn(
                textColor = MTColotUtils.Black_1000,
                bgColor = MTColotUtils.White_000,
                onClick = {

                })
            mtText(string = "Storker")
            MTSpacer()
            MTSmallStorkerBtn(
                enable = false,
                textColor = MTColotUtils.Gray_700,
                disbgColor = MTColotUtils.White_000)
            mtText(string = "StorkerUnable")
            MTSpacer()

            mtText(string = "MainBtn", fontWeight = FontWeight.Bold)
            MTSpacer()
            MTMainBtn(onClick = {

            })
            MTSpacer()
            MTMainBtn(
                enable = false,
                textColor = MTColotUtils.Gray_700,
                bgColor = MTColotUtils.Gray_300,
                onClick = {
                })
            MTSpacer()
            MTMainStorkerBtn(
                textColor = MTColotUtils.Black_1000,
                bgColor = MTColotUtils.White_000,
                onClick = {

                })
            MTSpacer()
            MTMainStorkerBtn(enable = false,
                textColor = MTColotUtils.Gray_700,
                bgColor = MTColotUtils.Gray_300,
                onClick = {
                })
            MTSpacer()
            Row(verticalAlignment = Alignment.Bottom) {
                MTSpacer()
                MTCricleBtn(textSize = 30.sp,
                    cricleSize = 60.dp,
                    bgColor = MTColotUtils.status_warning,
                    onClick = {

                })
                MTSpacer()
                MTCricleBtn(textSize = 30.sp,
                    cricleSize = 60.dp,
                    bgColor = MTColotUtils.Accent_Purple,
                    onClick = {

                    })
                MTSpacer()

                MTCricleBtn(textSize = 18.sp,
                    cricleSize = 40.dp,
                    bgColor = MTColotUtils.Accent_Purple,
                    onClick = {

                    })
                MTSpacer()

                MTCricleBtn(textSize = 18.sp,
                    cricleSize = 40.dp,
                    bgColor = MTColotUtils.status_danger,
                    onClick = {

                    })
            }

        }
    }
}


/**
 *不带描边的 smallbtn
 */
@Composable
fun MTSmallBtn(
    enable: Boolean = true,
    text: String = "按钮",
    textColor: Color = MTColotUtils.White_000,
    bgColor: Color = MTColotUtils.Black_1000,
    disbgColor: Color = MTColotUtils.Gray_300,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .width(84.dp)
            .height(32.dp),//修饰
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        },
        enabled = enable,
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor, disabledBackgroundColor = disbgColor
        )

    )

}

/**
 *带描边的 smallbtn
 */
@Composable
fun MTSmallStorkerBtn(
    enable: Boolean = true,
    text: String = "按钮",
    textColor: Color = MTColotUtils.White_000,
    bgColor: Color = MTColotUtils.Black_1000,
    disbgColor: Color = MTColotUtils.Gray_300,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .width(84.dp)
            .height(32.dp),//修饰

        border =
        BorderStroke(0.5.dp, MTColotUtils.Gray_400),//边框颜色
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        },//内容 //当内容过长的时候才会有效，
        enabled = enable,//设置按钮是否可用
        shape = RoundedCornerShape(50), //切角按钮
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor,
            disabledBackgroundColor = disbgColor
        )
//            RoundedCornerShape(50),//RoundedCornerShape修改按钮形状 如果参数是dp就是修改角度大小 如果是int是百分比
//        elevation ,按钮可点击状态下的 elevation
//        disabledElevation 按钮不可用状态下的elevation
    )

}

/**
 *不带描边的 mainbtn
 */
@Composable
fun MTMainBtn(
    enable: Boolean = true,
    text: String = "按钮",
    textColor: Color = MTColotUtils.White_000,
    bgColor: Color = MTColotUtils.Black_1000,
    disbgColor: Color = MTColotUtils.Gray_300,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        },
        enabled = enable,
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor, disabledBackgroundColor = disbgColor
        )

    )
}


/**
 *带描边的 mainbtn
 */
@Composable
fun MTMainStorkerBtn(
    enable: Boolean = true,
    text: String = "按钮",
    textColor: Color = MTColotUtils.White_000,
    bgColor: Color = MTColotUtils.Black_1000,
    disbgColor: Color = MTColotUtils.Gray_300,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),

        border =
        BorderStroke(0.5.dp, MTColotUtils.Gray_400),//边框颜色
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        },//内容 //当内容过长的时候才会有效，
        enabled = enable,//设置按钮是否可用
        shape = RoundedCornerShape(50), //切角按钮
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor,
            disabledBackgroundColor = disbgColor
        )
//            RoundedCornerShape(50),//RoundedCornerShape修改按钮形状 如果参数是dp就是修改角度大小 如果是int是百分比
//        elevation ,按钮可点击状态下的 elevation
//        disabledElevation 按钮不可用状态下的elevation
    )

}


/**
 *不带描边的 mainbtn
 */
@Composable
fun MTMainBtn11(
    enable: Boolean = true,
    text: String = "按钮",
    textColor: Color = MTColotUtils.White_000,
    bgColor: Color = MTColotUtils.Black_1000,
    disbgColor: Color = MTColotUtils.Gray_300,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = 12.sp,
                textAlign = TextAlign.Center
            )
        },
        enabled = enable,
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = bgColor, disabledBackgroundColor = disbgColor
        )

    )
}


/**
 * CricleBtn
 */
@Composable
fun MTCricleBtn(
    text: String = "＋",
    textSize: TextUnit = TextUnit.Unspecified,
    cricleSize: Dp = 50.dp,
    bgColor: Color = MTColotUtils.status_warning,
    textColor: Color = MTColotUtils.White_000,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,//点击事件
        modifier = Modifier
            .width(cricleSize)
            .height(cricleSize),
        content = {
            Text(
                text = text,
                color = textColor,
                fontSize = textSize,
                textAlign = TextAlign.Center
            )
        },
//        enabled = enable,
        shape = RoundedCornerShape(100),
        colors = ButtonDefaults.buttonColors(backgroundColor = bgColor)

    )
}

/**
 * CricleBtn
 */
@ExperimentalMaterialApi
@Composable
fun MTCricleBtn1(
    text: String = "+",
    textSize: TextUnit = TextUnit.Unspecified,
    cricleSize: Dp = 50.dp,
    bgColor: Color = MTColotUtils.status_warning,
    textColor: Color = MTColotUtils.White_000,

    ) {
    Box(
        modifier = Modifier
            .width(cricleSize)
            .height(cricleSize)
            .background(
                bgColor, CircleShape
            )
            .clickable() {


            },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = textSize,
            textAlign = TextAlign.Center
        )
    }
}


