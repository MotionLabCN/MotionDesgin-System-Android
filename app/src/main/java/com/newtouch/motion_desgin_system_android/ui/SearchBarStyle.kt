package com.newtouch.motion_desgin_system_android.ui


import android.util.Log
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
fun SearchBarPage() {
    SearchBarContent()
}

@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun SearchBarContent() {
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
            MTSearchBar(centerText = "title",leftIconId = R.drawable.icon_person,rightIconId = R.drawable.icon_map_place)
            MTSpacer()
            MTSearchBar(centerText = "title",leftIconId = R.drawable.icon_chevron_left,rightIconId = R.drawable.icon_map_place)
            MTSpacer()
            MTSearchBar(centerText = "title",leftIconId = R.drawable.icon_chevron_left,rightIconId = R.drawable.icon_chevron_right)
            MTSpacer()
            MTSearchBar(isLogo = true,centerId = R.drawable.icon_logo,leftIconId = R.drawable.icon_map_place,rightIconId = R.drawable.icon_map_place)
            MTSpacer()
            MTSearchBar(isLogo = true,centerId = R.drawable.icon_logo,leftIconId = R.drawable.icon_chevron_left)
            MTSpacer()
        }
    }
}


@Composable
fun MTSearchBar(
    isLogo:Boolean = false,
    centerText: String = "Motion",
    centerId: Int = R.drawable.icon_logo,
    leftIconId: Int = 0,
    rightIconId: Int = 0,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {},
) {
    TopAppBar(backgroundColor= MTColotUtils.Gray_300) {
        Row {
            if (leftIconId!=0){
                Icon(painter = painterResource(id = leftIconId) , contentDescription =null ,Modifier.clickable{
                    onLeftClick()
                } )
            }
            if (isLogo){
                Icon(painter = painterResource(id = centerId) , contentDescription =null ,modifier = Modifier.weight(1f))
            }else{
                Text(text = centerText, modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
            }
            if (rightIconId!=0){
                Icon(painter = painterResource(id = rightIconId) , contentDescription =null ,Modifier.clickable{
                    onRightClick()
                } )
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewAppBar() {
    MTSearchBar(centerText = "app")
}






