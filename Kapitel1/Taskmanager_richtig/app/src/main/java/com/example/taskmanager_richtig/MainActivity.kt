package com.example.taskmanager_richtig

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskmanager_richtig.ui.theme.Taskmanager_richtigTheme
import androidx.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Taskmanager_richtigTheme {
taskmanager()
            }
        }
    }
}
@Composable
fun taskmanager(modifier: Modifier = Modifier){
Column (modifier = Modifier
    .fillMaxHeight() .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center

){

    Image(
        painter = painterResource(R.drawable.ic_task_completed),
        contentDescription = null,
        alignment = Alignment.Center,
        contentScale = ContentScale.Inside

    )
    Text(
        text = "All tasks completed",
        modifier = Modifier.padding(0.dp,24.dp, 0.dp,8.dp),
       fontWeight =  FontWeight.Bold,

    )
    Text(
        text = "Nice work!",
        fontSize = 16.sp,

    )
}

}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Taskmanager_richtigTheme {
       taskmanager()
    }
}