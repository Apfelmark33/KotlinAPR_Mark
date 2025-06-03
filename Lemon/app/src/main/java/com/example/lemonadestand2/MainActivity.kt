package com.example.lemonadestand2


import android.R.attr.color
import android.R.color
import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lemonadestand2.ui.theme.Lemonadestand2Theme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Runnable
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lemonadestand2Theme {


                Box(
                    modifier = Modifier
                        .background(Color(0xFFF9E44C))
                        .fillMaxWidth()
                        .height(70.dp),
                    contentAlignment = Alignment.Center

                ){

                    Text(
                        text = "Lemonade",


                    )
                }


                }
                lemonade(1)

            }

            }
        }


@Composable
fun lemonade( imagea : Int , modifier: Modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)){

    var test by remember { mutableStateOf(1) }

    var r = Random.nextInt(10)


    val imagebenutzen = when(test){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3->R.drawable.lemon_drink
        4->R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }
    val textbenutzen  = when(test){
        1 -> "Tap the lemon tree to select a lemon"
        2 -> "Keep tapping the lemon to squeeze it"
        3->"Tap the lemonade to drink it"
        4->"Tap the empty glass to start again"
        else -> "OHHHHHHH"
    }
    Column (Modifier.fillMaxSize().wrapContentSize(Alignment.Center).padding(10.dp)) {
        var a = 0
        Button(onClick = {
            if(test != 2) {
                test++
            } else if (a == r) {
                test++
                a = 0
                r = Random.nextInt(10)
            } else {
                a++
            }

        }) {


            Image(
                painter = painterResource(imagebenutzen),
                contentDescription = "A",

                )

            if (test>4){
                test = 1
            }
        }



        Text(
            text = textbenutzen
        )
    }

    }


