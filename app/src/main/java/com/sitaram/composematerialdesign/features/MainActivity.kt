package com.sitaram.composematerialdesign.features

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sitaram.composematerialdesign.features.material_design3.MaterialDesign3MainScreen
import com.sitaram.composematerialdesign.ui.theme.ComposeMaterialDesignTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import com.sitaram.composematerialdesign.features.material.MainScreen
import com.sitaram.composematerialdesign.features.material_design.MaterialDesign2MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMaterialDesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    ComposeDesignAppNavHost(navController)
                }
            }
        }
    }
}

@Composable
fun ComposeDesignAppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Main") {
        // main screen
        composable("Main") {
            MainScreen(navController)
        }

        // material design 3
        composable("MaterialDesign3") {
            MaterialDesign3MainScreen()
        }

        // material design 2
        composable("MaterialDesign") {
            MaterialDesign2MainScreen()
        }
    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MaterialDesignTypeOfUi(title: String, subTitle: String, onClickAction: () -> Unit) {
//    Card(
//        modifier = Modifier
//            .padding(top = 10.dp)
//            .border(width = 1.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
//        onClick = onClickAction
//    ) {
//        Row(
//            modifier = Modifier
//                .background(Color.White).fillMaxWidth()
//                .padding(15.dp),
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            Column(
//                modifier = Modifier
//                    .background(color = Color.White),
//            ) {
//                Text(
//                    text = title,
//                    style = TextStyle(
//                        fontSize = 15.sp,
//                        fontWeight = FontWeight.SemiBold
//                    ),
//                )
//                Text(
//                    text = subTitle,
//                    style = TextStyle(fontSize = 12.sp),
//                    modifier = Modifier.padding(top = 5.dp)
//                )
//            }
//            Spacer(Modifier.width(110.dp))
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp),
//            )
//        }
//    }
//}

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MaterialDesignTypeOfUi(title: String, subTitle: String, onClickAction: () -> Unit, modifier: Modifier = Modifier) {
//    Card(
//        modifier = modifier
//            .padding(5.dp)
//            .border(width = 1.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
//        onClick = onClickAction
//    ) {
//        Row(
//            modifier = Modifier
//                .background(Color.White)
//                .padding(15.dp)
//                .width(IntrinsicSize.Max), // Set the width to the maximum intrinsic width
//            verticalAlignment = Alignment.CenterVertically,
//        ) {
//            Column(
//                modifier = Modifier
//                    .weight(1f) // Occupy the remaining available width in the Row
//            ) {
//                Text(
//                    text = title,
//                    style = TextStyle(
//                        fontSize = 15.sp,
//                        fontWeight = FontWeight.SemiBold
//                    ),
//                )
//                Text(
//                    text = subTitle,
//                    style = TextStyle(fontSize = 12.sp),
//                    modifier = Modifier.padding(top = 5.dp)
//                )
//            }
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowRight,
//                contentDescription = null,
//                modifier = Modifier
//                    .size(30.dp)
//            )
//        }
//    }
//}