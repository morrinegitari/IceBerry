package com.morrine.iceberry.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.navigation.ROUT_HOME
import com.morrine.iceberry.navigation.ROUT_LOGIN
import com.morrine.iceberry.navigation.ROUT_START
import com.morrine.iceberry.ui.theme.newOrange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    //Navigation
    var coroutine = rememberCoroutineScope()
    coroutine.launch{
        delay(2000)
        navController.navigate(ROUT_LOGIN )
    }



    //End Navigation
    Column(
        modifier = Modifier.fillMaxSize().background(newOrange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.img_14),
            contentDescription = "watch",
            modifier = Modifier.size(300.dp)
        )


    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}