package com.newtouch.motion_desgin_system_android.ui


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.*
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import com.newtouch.motion_desgin_system_android.R

import com.newtouch.motion_desgin_system_android.utils.MTColotUtils


@ExperimentalFoundationApi
@ExperimentalMaterialApi
@ExperimentalTextApi
@Composable
fun IconPage() {
    IconContent()
}

@ExperimentalFoundationApi
@ExperimentalMaterialApi
@ExperimentalTextApi
@Preview
@Composable
fun IconContent() {
    Box(modifier = Modifier.fillMaxSize()) {
//        Column(
//            modifier = Modifier
//                .verticalScroll(rememberScrollState())
//        ) {
//
//            getImageIcon(R.drawable.icon_trash)
//            getImageIcon(R.drawable.icon_trash)
//            getImageIcon(R.drawable.icon_trash)
//        }
        LazyVerticalGridDemo()
    }
}


@Composable
fun getImageIcon(id: Int) {

    return Image(painter = painterResource(id = id), contentDescription = null,)

}

/**
 * 获取icon，并设置颜色，默认不设置颜色
 */
@Composable
fun getMTIcon(id: Int, tint: Color = Color.Unspecified) {

    return Icon(
        painter = painterResource(id = id),
        contentDescription = null,
        tint = tint
    )
}

data class IconBean(val id: Int, val name: String)

@ExperimentalFoundationApi
@Composable
fun LazyVerticalGridDemo() {
    val images = arrayListOf<IconBean>().apply {
        add(IconBean(R.drawable.icon_trash, "trash"))
        add(IconBean(R.drawable.icon_person, "person"))
        add(IconBean(R.drawable.icon_mail, "mail"))
        add(IconBean(R.drawable.icon_logo, "logo"))
        add(IconBean(R.drawable.icon_hone, "home"))
        add(IconBean(R.drawable.icon_group, "group"))
        add(IconBean(R.drawable.icon_chat, "chat"))
        add(IconBean(R.drawable.icon_cart, "cart"))
//-----------------------------------------------------------
        add(IconBean(R.drawable.icon_add, "add"))
        add(IconBean(R.drawable.icon_more, "more"))
        add(IconBean(R.drawable.icon_send, "send"))
        add(IconBean(R.drawable.icon_done_circle, "done_circle"))
        add(IconBean(R.drawable.icon_cached, "cached"))
        add(IconBean(R.drawable.icon_plus, "plus"))
        add(IconBean(R.drawable.icon_more_white, "more"))
        add(IconBean(R.drawable.icon_send_white, "send"))
        add(IconBean(R.drawable.done_circle_white, "circle"))
        add(IconBean(R.drawable.icon_setting, "setting"))
        add(IconBean(R.drawable.icon_done_inactive, "done"))
        add(IconBean(R.drawable.icon_done, "done"))
        add(IconBean(R.drawable.icon_build, "build"))
        add(IconBean(R.drawable.icon_info, "info"))
        add(IconBean(R.drawable.icon_favorite_white, "favorite"))
        add(IconBean(R.drawable.icon_search, "search"))
        add(IconBean(R.drawable.icon_status_off, "status"))
        add(IconBean(R.drawable.icon_bookmark, "bookmark"))
        add(IconBean(R.drawable.icon_status_on, "status"))
        add(IconBean(R.drawable.icon_drag_handle, "drag"))
        add(IconBean(R.drawable.icon_faceid, "faceid"))
        add(IconBean(R.drawable.icon_dictation_mic, "dictation"))
        add(IconBean(R.drawable.icon_bookmark_white, "bookmark"))
        add(IconBean(R.drawable.icon_favorite, "facorite"))
        add(IconBean(R.drawable.icon_remove, "remove"))
        add(IconBean(R.drawable.icon_info_white, "info"))

        //-----------------------------------------------------------
        add(IconBean(R.drawable.icon_apps, "apps"))
        add(IconBean(R.drawable.icon_arrow_dropdown_circle, "ropdown_circle"))
        add(IconBean(R.drawable.icon_arrow_dropdown, "arrow_dropdown"))
        add(IconBean(R.drawable.icon_arrow_dropup, "arrow_dropup"))
        add(IconBean(R.drawable.icon_arrow_left, "arrow_left"))
        add(IconBean(R.drawable.icon_arrow_right, "arrow_right"))
        add(IconBean(R.drawable.icon_chevron_left_white, "chevron_left"))
        add(IconBean(R.drawable.icon_chevron_left, "chevron_left"))
        add(IconBean(R.drawable.icon_chevron_right_white, "chevron_right"))
        add(IconBean(R.drawable.icon_chevron_right, "chevron_right"))
        add(IconBean(R.drawable.icon_close_circle, "close_circle"))
        add(IconBean(R.drawable.icon_close, "close"))
        add(IconBean(R.drawable.icon_expand_less_white, "expand_less"))
        add(IconBean(R.drawable.icon_expand_less, "expand_less"))
        add(IconBean(R.drawable.icon_expand_more_more, "expand_more"))
        add(IconBean(R.drawable.icon_expand_more, "expand_more"))
        add(IconBean(R.drawable.icon_fullscreen_exit, "fullscreen_exit"))
        add(IconBean(R.drawable.icon_fullscreen, "fullscreen"))
        add(IconBean(R.drawable.icon_line, "line"))
        add(IconBean(R.drawable.icon_menu, "menu"))
        add(IconBean(R.drawable.icon_more_horiz, "more_horiz"))
        add(IconBean(R.drawable.icon_more_vert, "more_vert"))

        //-----------------------------------------------------------
        add(IconBean(R.drawable.icon_adds, "icon_adds"))
        add(IconBean(R.drawable.icon_apple_logo, "ropdown_circle"))
        add(IconBean(R.drawable.icon_copy, "arrow_dropdown"))
        add(IconBean(R.drawable.icon_create, "arrow_dropup"))
        add(IconBean(R.drawable.icon_error_outline, "arrow_left"))
        add(IconBean(R.drawable.icon_error, "arrow_right"))
        add(IconBean(R.drawable.icon_filter_list, "chevron_left"))
        add(IconBean(R.drawable.icon_github, "chevron_left"))
        add(IconBean(R.drawable.icon_link, "chevron_right"))
        add(IconBean(R.drawable.icon_map_default, "chevron_right"))
        add(IconBean(R.drawable.icon_map_place, "close_circle"))
        add(IconBean(R.drawable.icon_notification_important, "close"))
        add(IconBean(R.drawable.icon_notifications_outline, "expand_less"))
        add(IconBean(R.drawable.icon_notifications, "expand_less"))
        add(IconBean(R.drawable.icon_share_and, "expand_more"))
        add(IconBean(R.drawable.icon_share, "expand_more"))

        //-----------------------------------------------------------
        add(IconBean(R.drawable.icon_atm, "atm"))
        add(IconBean(R.drawable.icon_bank_building, "bank_building"))
        add(IconBean(R.drawable.icon_banknote, "banknote"))
        add(IconBean(R.drawable.icon_bitcoin, "bitcoin"))
        add(IconBean(R.drawable.icon_credit_card, "credit_card"))
        add(IconBean(R.drawable.icon_development, "development"))
        add(IconBean(R.drawable.icon_dicussion, "dicussion"))
        add(IconBean(R.drawable.icon_discount_percent, "discount_percent"))
        add(IconBean(R.drawable.icon_doller, "doller"))
        add(IconBean(R.drawable.icon_euro, "euro"))
        add(IconBean(R.drawable.icon_exchange, "exchange"))
        add(IconBean(R.drawable.icon_graph, "graph"))
        add(IconBean(R.drawable.icon_indeterminate_checkbox, "indeterminate_checkbox"))
        add(IconBean(R.drawable.icon_penny, "penny"))
        add(IconBean(R.drawable.icon_pie_chart, "pie_chart"))
        add(IconBean(R.drawable.icon_piggy_bank, "piggy_bank"))
        add(IconBean(R.drawable.icon_pound, "pound"))
        add(IconBean(R.drawable.icon_price_tag, "price_tag"))
        add(IconBean(R.drawable.icon_reciept, "reciept"))
        add(IconBean(R.drawable.icon_savings_bag, "savings_bag"))
        add(IconBean(R.drawable.icon_shopper_bag, "shopper_bag"))
        add(IconBean(R.drawable.icon_star_1, "star_1"))
        add(IconBean(R.drawable.icon_star_half, "star_half"))
        add(IconBean(R.drawable.icon_star_outline, "star_outline"))
        add(IconBean(R.drawable.icon_status_off_1, "status_off_1"))
        add(IconBean(R.drawable.icon_status_off_2, "status_off_2"))
        add(IconBean(R.drawable.icon_status_on_1, "status_on_1"))
        add(IconBean(R.drawable.icon_status_on_2, "status_on_2"))
        add(IconBean(R.drawable.icon_transaction, "transaction"))
        add(IconBean(R.drawable.icon_wallet, "wallet"))
        add(IconBean(R.drawable.icon_yen, "yen"))


    }
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        cells = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(images.size) { index ->
            ImageCard(
                image = images[index].id,
                modifier = Modifier.width(128.dp),
                text = images[index].name
            )
        }
    }
}

@Composable
fun ImageCard(image: Int, modifier: Modifier, text: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = MTColotUtils.Gray_300,
                    shape = RoundedCornerShape(4.dp)
                )
                .padding(20.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Inside,
            )

            Text(text = text, maxLines = 1)
        }
    }


}