package com.example.cookbook

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookbook.ui.theme.CookBookApp
import com.example.cookbook.ui.theme.CookBookTheme

import kotlinx.coroutines.delay


@Composable
fun SplashScreen(windowSize: WindowWidthSizeClass) {
    val splashDuration = 2000L // 2 seconds
    var showSplash by remember { mutableStateOf(true) }
    LaunchedEffect(Unit) {
        delay(splashDuration)
        showSplash = false
    }
    if (showSplash) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF2F3F4))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
//            Image(
//                painterResource(id =R.drawable.trval_companion_png ) ,
//                contentDescription = null,
//                tint = Color.White,
//                modifier = Modifier.size(120.dp)
//            )
                Image(
                    painter = painterResource(id = R.drawable.cookbook_con),
                    contentDescription = "logo",

                    modifier = Modifier.size(220.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))


                Text(
                    text ="Cookbook",
                    style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold, color = Color(
                        0xFFFF9800
                    )
                    ),
                    modifier = Modifier
                        .padding(16.dp)

//                        .align(Alignment.BottomStart)
                )

            }
        }

    } else {
        CookBookTheme {
            Surface {

                CookBookApp(windowSize)
            }
        }
    }




}

