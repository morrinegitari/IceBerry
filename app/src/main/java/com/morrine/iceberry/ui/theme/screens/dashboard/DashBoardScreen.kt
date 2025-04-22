package com.morrine.iceberry.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.navigation.ROUT_ABOUT
import com.morrine.iceberry.navigation.ROUT_HOME
import com.morrine.iceberry.navigation.ROUT_INTENT
import com.morrine.iceberry.navigation.ROUT_ITEM
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoardScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(newOrange)
        .verticalScroll(rememberScrollState())) {
        Box(){
            //card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newWhite )
            ){
                TopAppBar(
                    title = { Text(text = "DashBoard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}){
                            Icon(imageVector = Icons.Default.Menu, contentDescription ="" )
                            Icon(imageVector = Icons.Default.Menu, contentDescription ="" )
                        }
                    },
                    actions = {
                        IconButton(onClick = {
                            navController.navigate(ROUT_HOME)
                        }) {
                            Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                        }
                    }
                )

            }


//end card
            Card(
                modifier = Modifier.fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)
            ) {
                Text(
                    text = "welcome to zawadimart",
                    modifier = Modifier.fillMaxWidth()
                        .padding(20.dp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Red,
                    fontFamily = FontFamily.Monospace,
                    textDecoration = TextDecoration.Underline



                )
                Text(
                    text = "Select an option", modifier = Modifier.fillMaxWidth()
                        .padding(20.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.Gray,
                    fontFamily = FontFamily.SansSerif,





                )
            }
        }
        //end box
        Spacer(modifier = Modifier.height(100.dp))
        //row
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //card1
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .clickable{navController.navigate(ROUT_HOME)}

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_6),
                        contentDescription = "watch",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp) 

                }
            }

            //end card1
            Spacer(modifier = Modifier.width(100.dp))
                //card2
                Card(
                    modifier = Modifier.width(150.dp)
                        .height(180.dp)
                        .clickable{navController.navigate(ROUT_ABOUT)}
                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_8),
                            contentDescription = "watch",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(text = "About", fontSize = 15.sp)

                    }
                }



        }


        //End row
        Spacer(modifier = Modifier.height(80.dp))
//row2
        Row(modifier = Modifier.padding(start = 20.dp)) {
            //card1
            Card(
                modifier = Modifier.width(150.dp).height(180.dp)
            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_13),
                        contentDescription = "watch",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contact", fontSize = 15.sp)

                }
            }

            //end card1
            Spacer(modifier = Modifier.width(100.dp))
            //card1
            Card(
                modifier = Modifier.width(150.dp)
                    .height(180.dp).clickable{navController.navigate(ROUT_ITEM)}

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.img_14),
                        contentDescription = "watch",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)

                }
            }



        }

//END ROW

    }

}

@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())
}