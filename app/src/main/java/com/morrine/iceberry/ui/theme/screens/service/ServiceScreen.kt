package com.morrine.iceberry.ui.theme.screens.service

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.navigation.ROUT_DASHBOARD
import com.morrine.iceberry.navigation.ROUT_HOME
import com.morrine.iceberry.navigation.ROUT_INTENT
import com.morrine.iceberry.navigation.ROUT_START
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Best Seller !!!") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUT_DASHBOARD  ) }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Back")


                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = newOrange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )

            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar (
                containerColor = newOrange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton (
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        //contents
        content = { paddingValues ->
            Column (
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                var mContext = LocalContext.current
                //Main Contents of the page
                Spacer(modifier = Modifier.height(20.dp))

                //SearchBar
                var search by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
                    trailingIcon =  { Icon(imageVector = Icons.Default.MoreVert, contentDescription = "") },
                    placeholder = { Text(
                        text = "Search for products .... ",
                       fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                        ) }
                )

                //End of SearchBar
                Spacer(modifier = Modifier.height(20.dp))
                Box() {
                    Image(
                        painter = painterResource(R.drawable.img_17),
                        contentDescription = "watch",
                        modifier = Modifier.fillMaxWidth().height(200.dp),
                        contentScale = ContentScale.FillWidth
                    )
                   


                }
                Spacer(modifier = Modifier.height(10.dp))

                //row
                Row(modifier = Modifier.padding(start = 20.dp)) {

                   Image(
                        painter = painterResource(R.drawable.img_16),
                        contentDescription = "watch",
                        modifier = Modifier.width(150.dp).height(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Image(
                        painter = painterResource(R.drawable.img_15),
                        contentDescription = "watch",
                        modifier = Modifier.width(150.dp).height(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )



                }
                //end row
                //row
                Row(modifier = Modifier.padding(start = 20.dp)) {

                    Column {
                        Text(
                            text = "Body lux",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Price :Ksh.1200",
                            fontSize = 20.sp,

                            )
                        Row {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint =newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                        }
                        Button(
                            onClick = {
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                            colors = ButtonDefaults.buttonColors(newOrange),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Contact us")
                        }

                    }
                    Spacer(modifier = Modifier.width(30.dp))

                    Column {
                        Text(
                            text = "Nice $ lovely",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Price :Ksh.1200",
                            fontSize = 20.sp,

                            )
                        Row {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                        }
                        Button(
                            onClick = {
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                            colors = ButtonDefaults.buttonColors(newOrange),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Contact us")
                        }

                    }


                }
                //end row

                Spacer(modifier = Modifier.height(10.dp))

                //row
                Row(modifier = Modifier.padding(start = 20.dp)) {

                    Image(
                        painter = painterResource(R.drawable.img_16),
                        contentDescription = "watch",
                        modifier = Modifier.width(150.dp).height(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Image(
                        painter = painterResource(R.drawable.img_15),
                        contentDescription = "watch",
                        modifier = Modifier.width(150.dp).height(200.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )



                }
                //end row
                //row
                Row(modifier = Modifier.padding(start = 20.dp)) {

                    Column {
                        Text(
                            text = "Vaseline",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Price :Ksh.1500",
                            fontSize = 20.sp,

                            )
                        Row {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                        }
                        Button(
                            onClick = {
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                            colors = ButtonDefaults.buttonColors(newOrange),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Contact us")
                        }

                    }
                    Spacer(modifier = Modifier.width(30.dp))

                    Column {
                        Text(
                            text = "Olive Oil",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Price :Ksh.1600",
                            fontSize = 20.sp,

                            )
                        Row {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = newOrange
                            )
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "",
                                tint = Color.Gray
                            )
                        }
                        Button(
                            onClick = {
                                val callIntent=Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0720245837".toUri()
                                mContext.startActivity(callIntent)
                            },
                            colors = ButtonDefaults.buttonColors(newOrange),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text(text = "Contact us")
                        }

                    }


                }
                //end row

               






            }
        }
    )

    //End of scaffold





}

@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(rememberNavController())
}