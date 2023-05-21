package com.example.exam

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exam.ui.theme.ExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    ExamTheme {
        Scaffold {
            Column {
                TopBar()
                Menu()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.title),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor =  colorResource(id = R.color.blue),
            titleContentColor = colorResource(id = R.color.white)
        )
    )
}

@Composable
fun Menu() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(40.dp)
    ) {
        Box(
            modifier = Modifier.weight(5f)
        ) {
            InitialMenu()
        }

        Image(
            painter = painterResource(id = R.drawable.exit),
            contentDescription = "exit",
            modifier = Modifier
                .weight(1f)
                .padding(top = 5.dp)
        )
    }
}

@Composable
fun InitialMenu() {
    Image(
        painter = painterResource(id = R.drawable.newdoc),
        contentDescription = "New Register",
        modifier = Modifier
            .padding(top = 5.dp, start = 10.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.edit),
        contentDescription = "Edit Document",
        modifier = Modifier
            .padding(top = 5.dp, start = 60.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.delete),
        contentDescription = "Delete",
        modifier = Modifier
            .padding(top = 5.dp, start = 110.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.shared),
        contentDescription = "Shared",
        modifier = Modifier
            .padding(top = 5.dp, start = 160.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}