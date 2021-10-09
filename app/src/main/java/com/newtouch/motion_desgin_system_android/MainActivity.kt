package com.newtouch.motion_desgin_system_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.newtouch.motion_desgin_system_android.entities.FuncInfo
import com.newtouch.motion_desgin_system_android.navigation.Screen
import com.newtouch.motion_desgin_system_android.ui.*
import com.newtouch.motion_desgin_system_android.navigation.AppBar
import com.newtouch.motion_desgin_system_android.ui.theme.Motion_desgin_system_androidTheme


class MainActivity : ComponentActivity() {
    @ExperimentalTextApi
    @ExperimentalUnitApi
    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Motion_desgin_system_androidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

//                    Content()
                    Page("MTDesginSystem",leftIcon = Icons.Default.ArrowBack ) {
                        Content()
                    }
                }
            }


        }
    }
}

@ExperimentalTextApi
@ExperimentalUnitApi
@ExperimentalAnimationApi
@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Content() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.main) {
        composable(Screen.main) { Main(navController) }
        composable(Screen.text) { TextsizePage() }
        composable(Screen.layout) { LayoutPage() }
        composable(Screen.image) { ImagePage() }
        composable(Screen.color) { ColorPage() }
        composable(Screen.icon) { IconPage() }
        composable(Screen.shadow) { ShadowPage() }
        composable(Screen.button) { ButtonPage() }
        composable(Screen.hovel) { HovelPage() }
        composable(Screen.tips) { TipsPage() }
        composable(Screen.tipstext) { TipsTextPage() }
        composable(Screen.warnings) { TipsPage2() }
        composable(Screen.progress) { LoadingPage() }
        composable(Screen.textFiled) { TextFieldPage() }
        composable(Screen.searchBar) { SearchBarPage() }
        composable(Screen.tableRow) { TableRowPage() }

    }
}

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@Composable
fun Main(navController: NavHostController) {
    FunctionList(functions, navController)
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Motion_desgin_system_androidTheme {
//        Greeting("Android")
        val navController = rememberNavController()
        FunctionList(functions, navController)
    }
}

val functions = arrayListOf<FuncInfo>().apply {
    add(FuncInfo("字体排版", Screen.text))
    add(FuncInfo("颜色体系", Screen.color))
    add(FuncInfo("ICON", Screen.icon))
    add(FuncInfo("按钮", Screen.button))
    add(FuncInfo("阴影", Screen.shadow))
    add(FuncInfo("杂物间", Screen.hovel))
    add(FuncInfo("全局提示", Screen.tips))
    add(FuncInfo("说明与建议", Screen.tipstext))
    add(FuncInfo("全局提示2", Screen.warnings))
    add(FuncInfo("全局加载", Screen.progress))
    add(FuncInfo("TextFiled", Screen.textFiled))
    add(FuncInfo("searchBar", Screen.searchBar))
    add(FuncInfo("tableRow", Screen.tableRow))
}



@ExperimentalMaterialApi
@Composable
fun FunctionList(functions: ArrayList<FuncInfo>, navController: NavHostController) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(15.dp),
    ) {
        item {
            Spacer(Modifier.size(10.dp))
        }
        items(functions) { func ->
            FuncItem(func, navController)
        }
        item {
            Spacer(Modifier.size(10.dp))
        }
    }
}



@ExperimentalMaterialApi
@Composable
fun FuncItem(func: FuncInfo, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .padding(15.dp, 0.dp),
//        backgroundColor = func.color,
        elevation = 2.dp,
        onClick = {
            navController.navigate(func.path)
        }
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = func.name,
                modifier = Modifier.padding(15.dp, 0.dp, 0.dp, 0.dp),
                textAlign = TextAlign.Start,
                color = Color.Black
            )
        }
    }
}


@Composable
fun Page(
    title: String,
    leftIcon: ImageVector? = null,
    rightIcon: ImageVector? = null,
    onLeftClick: () -> Unit = {},
    onRightClick: () -> Unit = {}, content: @Composable () -> Unit,
) {
    Column {
        AppBar(title = title, leftIcon, rightIcon, onLeftClick, onRightClick)
        content()
    }
}

enum class ThemeType {
    Default,
    Theme1,
    Theme2,
    Theme3,
    Theme4,
    Theme5,
}
