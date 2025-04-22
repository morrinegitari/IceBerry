package com.morrine.iceberry.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.morrine.iceberry.ui.theme.newBlue
import com.morrine.iceberry.ui.theme.newGreen
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrialScreen(navController: NavController) {
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newOrange
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.List, contentDescription = "Favorites") },
                    label = { Text("") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.MailOutline, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        //contents
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                var mContext = LocalContext.current


                //Main Contents of the page
                Text(
                    text = "Hi Samantha",
                    modifier = Modifier.fillMaxWidth()
                        .padding(start = 10.dp , end = 50.dp, top = 70.dp),
                    fontSize = 50.sp,
                    fontWeight = FontWeight.ExtraBold,


                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Here are your projects",
                    modifier = Modifier.fillMaxWidth()
                        .padding(start = 10.dp, end = 50.dp),
                    fontSize = 20.sp,

                )


                Spacer(modifier = Modifier.height(50.dp))
                //row
                Row(modifier = Modifier
                    .padding(start = 20.dp)
                    .horizontalScroll(rememberScrollState())

                ) {
                    //card1
                    Card(
                        modifier = Modifier

                            .width(140.dp)
                            .height(200.dp),
                        shape = RoundedCornerShape(size = 10.dp),
                        colors = CardDefaults.cardColors(newBlue)

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_20),
                            contentDescription = "watch",
                            modifier = Modifier
                                .size(120.dp)
                                .padding(start = 20.dp, end = 30.dp, top = 30.dp),


                            )
                        Text(text = "Cryptocurrency", fontSize = 15.sp)
                        Text(text = "Landing Page", fontSize = 15.sp)


                    }

                    //end card1
                    Spacer(modifier = Modifier.width(20.dp))
                    //card2
                    Card(
                        modifier = Modifier

                            .width(140.dp)
                            .height(200.dp),
                        shape = RoundedCornerShape(size = 10.dp),
                        colors = CardDefaults.cardColors(newOrange)

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_20),
                            contentDescription = "watch",
                            modifier = Modifier
                                .size(120.dp)
                                .padding(start = 20.dp, end = 30.dp, top = 30.dp),


                            )
                        Text(text = "Statistics", fontSize = 15.sp)
                        Text(text = "Dashboard", fontSize = 15.sp)


                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    //card 3
                    Card(
                        modifier = Modifier

                            .width(150.dp)
                            .height(200.dp),
                        shape = RoundedCornerShape(size = 10.dp),
                        colors = CardDefaults.cardColors(newGreen)

                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_20),
                            contentDescription = "watch",
                            modifier = Modifier
                                .size(120.dp)
                                .padding(start = 20.dp, end = 30.dp, top = 30.dp),


                            )
                        Text(text = "Statistics", fontSize = 15.sp)
                        Text(text = "Dashboard", fontSize = 15.sp)


                    }


                }
                Spacer(modifier = Modifier.height(50.dp))


                Column (){
                    Card (modifier = Modifier.fillMaxWidth()){
                        Text(
                            text = "Personal Tasks",
                            modifier = Modifier.fillMaxWidth()
                                .padding(start = 10.dp , end = 50.dp, top = 30.dp),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold,


                            )
                        Spacer(modifier = Modifier.height(20.dp))
                        //card 1
                        Card (modifier = Modifier.fillMaxWidth().background(newWhite)){
                            Row(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                                Image(
                                    painter = painterResource(R.drawable.img_21),
                                    contentDescription = "watch",
                                    modifier = Modifier.size(50.dp)
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Column {
                                    Text(text = "NDA Review for website project", fontSize =20.sp )
                                    Text(text = "Today - 10 pm")

                                }



                            }
                            Spacer(modifier = Modifier)

                            Row(modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),



                            ) {
                                Image(
                                    painter = painterResource(R.drawable.img_23),
                                    contentDescription = "watch",
                                    modifier = Modifier.size(60.dp)
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Column {
                                    Text(text = "Email reply for Green project", fontSize =20.sp )
                                    Text(text = "Today - 10 pm")

                                }



                            }
                        }


                    }

                }
                
                //End row
                

            }

        }
    )
    //End of scaffold


}


@Preview(showBackground = true)
@Composable
fun TrialScreenPreview(){
    TrialScreen(rememberNavController())
}