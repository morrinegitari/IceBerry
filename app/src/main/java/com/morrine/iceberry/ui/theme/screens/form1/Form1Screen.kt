package com.morrine.iceberry.ui.theme.screens.form1

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.ui.theme.newBlue
import com.morrine.iceberry.ui.theme.newGreen
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newRed
import com.morrine.iceberry.ui.theme.newWhite

@Composable
fun Form1Screen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        Box (){

            //card1
            Card(
                modifier = Modifier.fillMaxSize().height(100.dp),
                colors = CardDefaults.cardColors(Color.Blue )


            ) {
                Row (modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp, top = 30.dp)) {
                    Image(
                        painter = painterResource(R.drawable.img_25),
                        contentDescription = "watch",
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.width(20.dp))

                    Text(text = "logo app", fontSize = 30.sp, color = newWhite)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                    Image(
                        painter = painterResource(R.drawable.img_24),
                        contentDescription = "watch",

                    )
                }
            }

            //end card1
            Spacer(modifier = Modifier.height(30.dp))
            //card2
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(600.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .offset(y = 90.dp)
                ,
                shape = RoundedCornerShape(30.dp),


                ) {
                Text(text = "The Most Worth Grocery App",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 30.dp, top = 20.dp, end = 30.dp),
                    textAlign = TextAlign.Center
                )
                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }

                Spacer(modifier = Modifier.height(20.dp))
                //password
                //textfield or outlinedtextfield
                OutlinedTextField(
                    value = username,
                    onValueChange = {username =it },
                    modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp),
                    label = {Text(text = "Username",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp, end = 50.dp)

                        )},
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newOrange,
                        focusedBorderColor = newGreen,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                )


                //end
                Spacer(modifier = Modifier.height(20.dp))
                //confirm password
                //textfield or outlinedtextfield
                OutlinedTextField(
                    value = password,
                    onValueChange = {password =it },
                    modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp),
                    label = {Text(text = " Password",
                        textAlign = TextAlign.Center,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(start = 50.dp, end = 50.dp)
                        )

                            },
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newOrange,
                        focusedBorderColor = newGreen,

                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    

                )


                //end
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(newRed),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 30.dp, end = 30.dp)
                ) {
                    Text(text = "Sign Up", fontSize = 20.sp)
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp)) {
                    Text(text = "Already are member?",
                        fontSize = 20.sp,
                        
                        )
                    Text(text = "Log in",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Red
                        )
                }



            }

            //end card1
        }


}


}

@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())
}