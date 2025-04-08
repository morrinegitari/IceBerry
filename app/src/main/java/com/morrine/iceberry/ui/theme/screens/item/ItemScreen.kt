package com.morrine.iceberry.ui.theme.screens.item

import android.content.ClipData
import android.content.Intent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.navigation.ROUT_INTENT
import com.morrine.iceberry.navigation.ROUT_START
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController) {
    Column(

        modifier = Modifier.fillMaxSize()
    ) {
        var mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = {
                Text(text = "Products")
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newOrange,
                titleContentColor = newWhite,
                navigationIconContentColor = newWhite,
                actionIconContentColor = newWhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }
        )
        //End

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "watch",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search... ") }
        )

//leading=start traillingicon= end
        //End of SearchBar
        Spacer(modifier = Modifier.height(10.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //row
            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.img_3),
                    contentDescription = "watch",
                    modifier = Modifier.width(200.dp).height(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Mens outfit",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.60000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :Ksh.120000",
                        fontSize = 20.sp,

                        )
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Gray
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
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
                        colors = ButtonDefaults.buttonColors(newWhite),
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
                    painter = painterResource(R.drawable.img_3),
                    contentDescription = "watch",
                    modifier = Modifier.width(200.dp).height(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Mens outfit",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.60000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :Ksh.120000",
                        fontSize = 20.sp,

                        )
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Gray
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Gray
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(newWhite),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "Contact us")
                    }

                }

            }

//eND row
            Spacer(modifier = Modifier.height(10.dp))
            //row
            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.img_5),
                    contentDescription = "watch",
                    modifier = Modifier.width(200.dp).height(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = "Mens outfit",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Ksh.60000",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        text = "Price :Ksh.120000",
                        fontSize = 20.sp,

                        )
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = newWhite
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Gray
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "",
                            tint = Color.Gray
                        )
                    }
                    Button(
                        onClick = { navController.navigate(ROUT_START) },
                        colors = ButtonDefaults.buttonColors(newWhite),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "Contact us")
                    }

                }

            }
            //end row
            Spacer(modifier = Modifier.height(10.dp))
            //row
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview() {
    ItemScreen(rememberNavController())
}

