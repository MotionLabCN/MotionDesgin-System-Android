package com.newtouch.motion_desgin_system_android.ui


import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.newtouch.motion_desgin_system_android.R
import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun TableRowPage() {
    ableRowContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun ableRowContent() {
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

            MTTableRow(leftText = "左边文字")
            MTSpacer()
            MTTableRow(rigtType = 1, leftText = "左边文字", rightText = "右边文字")
            MTSpacer()
            MTTableRow(rigtType = 2, leftText = "左边文字", rightText = "右边文字")
            MTSpacer()
            MTTableRow(rigtType = 3, leftText = "左边文字", rightText = "右边文字")
            MTSpacer()
            MTTableRow2(topText = "顶部文字")
            MTSpacer()
            MTTableRow2(bottomText = "底部文字")
        }
    }
}

/**
 * tablerow rigthtType 1，只有文字，2有文字和右边arrow
 *
 */
@ExperimentalMaterialApi
@Composable
fun MTTableRow(
    leftText: String = "Motion",
    rightText: String = "Motion",
    rigtType: Int = 0,
    rightIconId: Int = R.drawable.icon_chevron_right,
    itemClick: () -> Unit = {},
) {

    val checkedState = remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(0.dp, 10.dp)
            .background(MTColotUtils.Accent_50)
            .clickable {
                itemClick
            }) {

        Text(
            text = leftText,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp)
        )
        Spacer(modifier = Modifier.weight(1f))

        when (rigtType) {
            1 -> {
                Text(text = rightText, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(end = 10.dp))
            }
            2 -> {
                Text(text = rightText, textAlign = TextAlign.Center)

                Icon(painter = painterResource(id = rightIconId), contentDescription = null)
            }
            3 -> {
                Switch(checked = checkedState.value, onCheckedChange = {
                    checkedState.value = it
                })

            }
            else -> {

            }
        }


    }
}

@ExperimentalMaterialApi
@Composable
fun MTTableRow2(
    leftText: String = "Motion",
    rightText: String = "Motion",
    rigtType: Int = 0,
    rightIconId: Int = R.drawable.icon_chevron_right,
    topText: String = "",
    bottomText: String = "",
    itemClick: () -> Unit = {},
) {

    val checkedState = remember { mutableStateOf(false) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .padding(0.dp, 10.dp)
            .background(MTColotUtils.Accent_50)
            .clickable {
                itemClick
            }) {

        Column(modifier = Modifier.padding(start = 10.dp)) {
            if (topText != "") {
                Text(
                    text = topText,

                    textAlign = TextAlign.Center
                )
            }
            Text(
                text = leftText,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
            )
            if (bottomText != "") {
                Text(
                    text = bottomText,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        when (rigtType) {
            1 -> {
                Text(text = rightText, textAlign = TextAlign.Center)
                Spacer(modifier = Modifier.padding(end = 10.dp))
            }
            2 -> {
                Text(text = rightText, textAlign = TextAlign.Center)

                Icon(painter = painterResource(id = rightIconId), contentDescription = null)
            }
            3 -> {
                Switch(checked = checkedState.value, onCheckedChange = {
                    checkedState.value = it
                })

            }
            else -> {

            }
        }


    }
}








