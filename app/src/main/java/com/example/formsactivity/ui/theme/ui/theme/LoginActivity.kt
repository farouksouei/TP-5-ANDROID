package com.example.formsactivity.ui.theme.ui.theme

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.formsactivity.ui.theme.ui.theme.ui.theme.FormsActivityTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormsActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Connexion()
                }
            }
        }
    }
}

@Composable
fun Connexion() {
    Column() {
        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var Message by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.height(60.dp))
        Text(text = "Login",
             color = Color.Blue,
             style=MaterialTheme.typography.h4,
             modifier = Modifier
                 .align(CenterHorizontally)
             

        )
        OutlinedTextField(value = email ,
            onValueChange = { newText->email =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "Email")},
            trailingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email" )},
            placeholder = { Text(text = "Taper Votre email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(value = password ,
            onValueChange = { newText->password =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "Password")},
            placeholder = { Text(text = "Taper votre password")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(
            onClick = { Message = "Bonjour "+email.text+" Votre Mot de Passe est "+password.text },
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            modifier = Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
        ) {

            // Inner content including an icon and a text label
            Icon(
                Icons.Filled.AccountCircle,
                contentDescription = "Favorite",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Sign In")
        }
        
        Row(modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxWidth()
            .align(alignment = CenterHorizontally),) {
            Text("Non Encore Connecté :")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Sign Up !!", color = Color.Blue)
        }
        Text(text = Message)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    FormsActivityTheme {
        Connexion()
    }
}