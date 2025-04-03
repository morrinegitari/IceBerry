package com.morrine.iceberry.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.morrine.iceberry.R

@Composable
fun HomeScreen(){
    Column(modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline



            )
        Text(
            text = "Welcome to my ecommerce App",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic,

        )



        Image(
            painter = painterResource(R.drawable.watch),
            contentDescription = "watch"
        )


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Add To Cart")
        }





    }


}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}
