package com.morrine.iceberry.ui.theme.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.morrine.iceberry.R
import com.morrine.iceberry.ui.theme.newGreen
import com.morrine.iceberry.ui.theme.newOrange
import com.morrine.iceberry.ui.theme.newWhite

@Composable
fun FormScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painter = painterResource(R.drawable.img_18), contentScale = ContentScale.FillBounds)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Image(
            painter = painterResource(R.drawable.watch),
            contentDescription = "watch",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(text ="CREATE AN ACCOUNT", fontSize = 30.sp , fontWeight = FontWeight.Bold )
        Spacer(modifier = Modifier.height(10.dp))

        //variables
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

        //fullname
        //textfield or outlinedtextfield
        TextField(
            value = fullname,
            onValueChange = {fullname =it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newOrange) },
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newOrange,
                focusedBorderColor = newGreen,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        //end
        Spacer(modifier = Modifier.height(10.dp))
        //username
        //textfield or outlinedtextfield
        TextField(
            value = fullname,
            onValueChange = {username =it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newOrange) },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newOrange,
                focusedBorderColor = newGreen,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )


        //end
        Spacer(modifier = Modifier.height(10.dp))
        //email
        //textfield or outlinedtextfield
        TextField(
            value = email,
            onValueChange = {email =it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newOrange) },
            label = {Text(text = "Email Address")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newOrange,
                focusedBorderColor = newGreen,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )


        //end
        Spacer(modifier = Modifier.height(10.dp))
        //password
        //textfield or outlinedtextfield
        TextField(
            value = password,
            onValueChange = {password =it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newOrange) },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newOrange,
                focusedBorderColor = newGreen,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )


        //end
        Spacer(modifier = Modifier.height(10.dp))
        //confirm password
        //textfield or outlinedtextfield
        TextField(
            value = confirmpassword,
            onValueChange = {confirmpassword =it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newOrange) },
            label = {Text(text = "Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newOrange,
                focusedBorderColor = newGreen,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )


        //end
        Spacer(modifier = Modifier.height(10.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(newOrange ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Register")
        }








    }

}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}