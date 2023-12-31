package com.example.capstone.ui.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.capstone.R
import com.example.capstone.ui.home.Dashboard
import com.example.capstone.ui.login.Login
import com.example.capstone.ui.login.LoginScreen

class Register {
    fun register(email: String, username: String, password: String) {
        // Logika untuk proses registrasi
        // ...
    }
}

@Composable
fun RegisterScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image: Painter = painterResource(R.drawable.mart)
        Image(
            painter = image,
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
                .padding(top = 10.dp),
            contentScale = ContentScale.Fit,
        )

        Text(text = "Register", style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.LightGray
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {navController.navigate("login") },
                modifier = Modifier
                    .size(width = 200.dp, height = 50.dp)
                    .background(Color(android.graphics.Color.parseColor("#124BBA"))), // Warna latar belakang tombol menggunakan nilai heksadesimal
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(android.graphics.Color.parseColor("#309464"))), // Warna teks tombol menggunakan nilai heksadesimal
            ) {
                Text(text = "Register", color = Color.White) // Warna teks tombol menjadi putih
            }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Have an account? ",
                style = MaterialTheme.typography.body1
            )
            Button(
                onClick = { navController.navigate("login") },
                modifier = Modifier
                    .padding(start = 4.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                contentPadding = PaddingValues(0.dp),
                elevation = ButtonDefaults.elevation(0.dp),
                content = {
                    Text(
                        text = "Login here",
                        style = TextStyle(
                            color = Color.Blue,
                            textDecoration = TextDecoration.Underline
                        )
                    )
                }
            )
        }}}

