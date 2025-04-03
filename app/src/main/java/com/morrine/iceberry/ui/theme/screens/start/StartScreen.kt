package com.morrine.iceberry.ui.theme.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.morrine.iceberry.R
import com.morrine.iceberry.ui.theme.newOrange

@Composable
fun StartScreen(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "ZawadiMart",
        )
        Spacer(modifier = Modifier.height(20.dp))
        //circular image
        Image(
            painter = painterResource(R.drawable.watch),
            contentDescription = "watch",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //end
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Find Your Order!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = newOrange
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Modern watches often display the day, date, month, and year. Mechanical watches may have extra features (\"complications\") such as moon-phase displays and different types of tourbillon. Quartz watches often include timers, chronographs, and alarm functions.Modern watches often display the day, date, month, and year. ",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newOrange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text(text = "Get Started")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()
}