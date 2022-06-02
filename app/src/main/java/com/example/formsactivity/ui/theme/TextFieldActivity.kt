package com.example.formsactivity.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.formsactivity.ui.theme.ui.theme.FormsActivityTheme

class TextFieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormsActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Inputs()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Inputs() {
    Column() {
        var text1 by remember { mutableStateOf(TextFieldValue("")) }
        var text2 by remember { mutableStateOf(TextFieldValue("")) }
        var text3 by remember { mutableStateOf(TextFieldValue("")) }
        var text4 by remember { mutableStateOf(TextFieldValue("")) }
        var text5 by remember { mutableStateOf(TextFieldValue("")) }
        TextField(value  = text1 ,
                onValueChange = { newText->text1 =newText },
                modifier= Modifier
                    .padding(all = 8.dp)
                    .fillMaxWidth(),
                label = { Text(text = "label")},
                placeholder = { Text(text = "Placeholder Text")}
            )
        OutlinedTextField(value = text2 ,
            onValueChange = { newText->text2 =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "label")},
            placeholder = { Text(text = "Placeholder Text")}
        )
        OutlinedTextField(value = text4 ,
            onValueChange = { newText->text4 =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email" )},
            placeholder = { Text(text = "Taper Votre email")}
        )
        OutlinedTextField(value = text5 ,
            onValueChange = { newText->text5 =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "Email")},
            trailingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email" )},
            placeholder = { Text(text = "Taper Votre email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        OutlinedTextField(value = text3 ,
            onValueChange = { newText->text3 =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "label")},
            placeholder = { Text(text = "Taper votre password")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )

        OutlinedTextField(value = text3 ,
            onValueChange = { newText->text3 =newText },
            modifier= Modifier
                .padding(all = 8.dp)
                .fillMaxWidth(),
            label = { Text(text = "label")},
            placeholder = { Text(text = "Taper votre password")},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    FormsActivityTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            Inputs()
        }
    }
}