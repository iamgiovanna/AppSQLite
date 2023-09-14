package com.example.appsql

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.appsql.ui.theme.AppSQLTheme
import org.w3c.dom.Text
import androidx.compose.foundation.layout.Row as Row1
import androidx.compose.material3.Text as Material3Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}
@Composable
fun App(){
    AppSQLTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun AppPreview(){
    App()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuTopBar(){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Black
                ),
                title = {
                    Column(){
                        //Text(text = "JetPack Compose", color = Color.White)
                        //Text(text = "SQLite", color = Color.White, MaterialTheme.typography.labelSmall)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                     Icon(Icons.Filled.ArrowBack, tint = Color.White, contentDescription = "Seta para a esquerda")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Filled.MoreVert, contentDescription ="")
                    }
                }
            )
        }
     ){
        Box(modifier = Modifier.padding(it)){

        }

    }
}

@Preview
@Composable
fun MenuTopBarPreview(){
    MenuTopBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextFieldSample() {
    var text by rememberSaveable { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Material3Text("Nome:") },
        singleLine = true
    )
}
fun TextField(value: Nothing?, onValueChange: () -> Unit, label: () -> Unit, singleLine: Boolean) {
    TODO("Not yet implemented")
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Material3Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppSQLTheme {
        Greeting("Android")
    }
}