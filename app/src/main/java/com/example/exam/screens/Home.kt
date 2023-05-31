package com.example.exam.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exam.R
import com.example.exam.TopBar
import com.example.exam.ui.theme.ExamTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    ExamTheme {
        Scaffold {
            Column {
                TopBar()
                Menu()
            }
        }
    }
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

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}