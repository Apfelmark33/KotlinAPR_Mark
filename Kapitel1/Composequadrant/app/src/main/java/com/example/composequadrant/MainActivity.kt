
package com.example.composequadrant


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface( color = MaterialTheme.colorScheme.background) {
                    quadrate()
                }

            }
        }
    }
}
@Composable
fun quadrate(modifier: Modifier = Modifier){

Column (Modifier.fillMaxWidth()){
    Row(Modifier.weight(1f)) {
text(Color(0xFFEADDFF), Modifier.weight(1f),"Text composable", "Displays text and follows the recommended Material Design guidelines.")
   text(Color(0xFFD0BCFF), Modifier.weight(1f), "Image composable", "Creates a composable that lays out and draws a given Painter class object.")

    }
    Row (Modifier.weight(1f)){
text(Color(0xFFB69DF8), Modifier.weight(1f), "Row composable", "A layout composable that places its children in a horizontal sequence.")
    text(Color(0xFFF6EDFF), Modifier.weight(1f),"Column composable", "A layout composable that places its children in a vertical sequence." )
    }
}
}
@Composable
fun text (color: androidx.compose.ui.graphics.Color, modifier: Modifier = Modifier, titel: String, text: String){
Column (modifier = modifier
    .fillMaxSize()
    .background(color)
    .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    ){
    Text(
        text = titel,
        modifier = Modifier.padding(bottom = 16.dp),
        fontWeight = FontWeight.Bold
    )
    Text(
        text = text,
        textAlign = TextAlign.Justify
    )
}
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

}