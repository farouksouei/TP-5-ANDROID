package com.example.formsactivity

import android.os.Bundle
import android.text.Layout
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.formsactivity.ui.theme.FormsActivityTheme

class ConexionActivity : ComponentActivity() {
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
fun DispalyUser()
{

}
@Composable
fun Connexion() {
    Column()
    {
        Spacer(modifier = Modifier.height(60.dp))
        Text("LOGIN",color= Color.Blue,style= MaterialTheme.typography.h3,
            modifier = Modifier.align(alignment = CenterHorizontally))

        var email by remember { mutableStateOf("") };
        var message by remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            onValueChange ={email=it},
            placeholder = {Text("Taper votre email")},
            label={Text("email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth(),

            )

        //outlinedtext field password
        var pwd by remember {mutableStateOf("")};

        OutlinedTextField(
            value = pwd,
            onValueChange ={pwd=it},
            placeholder = {Text("Taper votre text")},
            label={Text("password")},
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()

        )
        Button(
            onClick = { message="bonjour "+email},
            // Uses ButtonDefaults.ContentPadding by default
            contentPadding = PaddingValues(
                start = 20.dp,
                top = 12.dp,
                end = 20.dp,
                bottom = 12.dp
            ),
            modifier = Modifier
                .padding(all = 10.dp)
                .fillMaxWidth()
        ) {
            // Inner content including an icon and a text label
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = "Account",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Connexion")
        }
        Row(modifier = Modifier.align(alignment = CenterHorizontally))
        {
            Text("Vous n´avez pas un compte")
            Spacer(modifier=Modifier.width(5.dp))
            Text("SignUp",color=Color.Blue)
        }

        Text(message, modifier = Modifier
            .padding(all = 10.dp)
            .fillMaxWidth())
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    FormsActivityTheme {
        Connexion()
    }
}