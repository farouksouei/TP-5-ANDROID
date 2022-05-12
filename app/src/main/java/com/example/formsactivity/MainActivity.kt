package com.example.formsactivity

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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.formsactivity.ui.theme.FormsActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormsActivityTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        //textField normal
                        var value1 by remember {mutableStateOf("")};
                        TextField(
                            value = value1,
                            onValueChange ={value1=it},
                            placeholder = {Text("Taper votre text")},
                            label={Text("text1")},
                            modifier = Modifier.padding(all = 10.dp)
                                .fillMaxWidth()

                        )
                        //outlinedtext field
                        var value2 by remember {mutableStateOf("")};

                        OutlinedTextField(
                            value = value2,
                            onValueChange ={value2=it},
                            placeholder = {Text("Taper votre text")},
                            label={Text("text2")},
                            modifier = Modifier.padding(all = 10.dp)
                                .fillMaxWidth()

                        )

                        //outlinedtext field password
                        var value3 by remember {mutableStateOf("")};

                        OutlinedTextField(
                            value = value3,
                            onValueChange ={value3=it},
                            placeholder = {Text("Taper votre text")},
                            label={Text("password")},
                            modifier = Modifier.padding(all = 10.dp)
                                .fillMaxWidth(),
                            visualTransformation = PasswordVisualTransformation()

                        )
                        //outlinedtext field email
                        var value4 by remember {mutableStateOf("")};

                        OutlinedTextField(
                            value = value4,
                            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
                            onValueChange ={value4=it},
                            placeholder = {Text("Taper votre text")},
                            label={Text("email")},
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

                            modifier = Modifier.padding(all = 10.dp)
                                .fillMaxWidth(),

                            )
                        //outlined with 2icons
                        var value5 by remember {mutableStateOf("")};

                        OutlinedTextField(
                            value = value5,
                            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
                            trailingIcon = { Icon(imageVector = Icons.Default.Edit, contentDescription = null) },

                            onValueChange ={value5=it},
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

                            placeholder = {Text("Taper votre text")},
                            label={Text("email")},
                            modifier = Modifier.padding(all = 10.dp)
                                .fillMaxWidth(),

                            )

                    }
                }
            }
        }
    }
}

@Composable
fun TextInputNormal(name: String) {
    var value by remember {mutableStateOf("")};
    TextField(value = value, onValueChange ={value=it} )
}

@Composable
fun TextInputOutlined(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun TextInputOutlinedIcon(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun TextInputOutlined2Icon(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun TextInputOutlinedNumber(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FormsActivityTheme {
    }
}