package com.example.basickotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basickotlin.ui.theme.BasicKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //enableEdgeToEdge()-> it will display the content above the safearea
        setContent {

            //Text widget
//            Column {
//                Text(text ="Munna Jaiswal") //text
//                Text(text ="Munna Kumar Chaudhary", color = Color.Cyan) //text with color
//                Text(text ="Munna Chaudhary", color = Color.Red)  //text with color
//            }
//
//            Text(
//                text ="Munna Jaiswal",
//                color = Color.Cyan,
//                fontSize = 35.sp, // while placing text with font size then after the text size we have to enter (.sp)
//                fontFamily = FontFamily.Cursive,
//                fontStyle = FontStyle.Normal,
//                textAlign = TextAlign.Center,
//                modifier=Modifier.background(Color.Black)
////                    .fillMaxSize(
////                        fraction = .2f
////                    )//according to the screen it will cover 30% of the screen .2f
//                    .width(500.dp)
//                    .height(50.dp)
//            )

//            var arr=arrayOf("Munna","Arjun","Bicky","Roshan","Aaryan")
//            Column {
//                for(name in arr){
//                    Text(
//                        text = name,
//                        modifier=Modifier.padding(20.dp,0.dp,0.dp,0.dp)
//                        )                }
//            }


//            Column {
//                showText(name="Munna Jaiswal\n")
//                showText(name="Munna Chaudhary\n")
//                showText(name="MJ")
//
//            }
            //Text(text = "Munna Jaiswal\n".repeat(20))

//            layout()


           //box layout
            layout()

        }
    }









//    @Composable
//    fun showText(name:String){
//                    Text(
//                text =name,
//                color = Color.Cyan,
//                fontSize = 35.sp, // while placing text with font size then after the text size we have to enter (.sp)
//                fontFamily = FontFamily.Cursive,
//                fontStyle = FontStyle.Normal,
//                textAlign = TextAlign.Center,
//                modifier= Modifier
//                    .background(Color.Black)
////                    .fillMaxSize(
////                        fraction = .2f
////                    )//according to the screen it will cover 30% of the screen .2f
//                    .width(500.dp)
//                    .height(50.dp)
//            )
//    }


    //Column Layout
//    @Composable
//    fun layout(){
//        Column (
//            modifier = Modifier
////                .fillMaxWidth(.3f)
////                .fillMaxHeight(.415f)
////                or
//                .fillMaxSize()
//                .background(Color.Black)
//                .verticalScroll(rememberScrollState()), //to make scroll vertically
//            //verticalArrangement = Arrangement.Bottom //arrange the text vertically from bottom
//            //verticalArrangement = Arrangement.Center,
//            //verticalArrangement = Arrangement.SpaceAround, //from top to bottom all text will align and the space between equal
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            ){
//            for (i in 1..8){
//                Text(
//                    text = "Munna Jaiswal",
//                    color = Color.Cyan,
//                    fontFamily = FontFamily.Cursive,
//                    fontSize =30.sp,
//                )
//            }
//        }
        
        //this will make it scrollable automatically
//        LazyColumn (content = {
//            item { for (i in 1..30){
//                Text(text = "Munna Jaiswal", fontSize = 35.sp)
//            } }
//        })
//    }

    //box layout
    @Composable
    fun layout(){
        var context= LocalContext.current
        Box (modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
            contentAlignment = Alignment.Center){
            Text(text = "Munna Jaiswal", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterStart))
            Text(text = "Munna Jaiswal", color = Color.Red, modifier = Modifier.align(Alignment.Center))
            Text(text = "Munna Jaiswal", color = Color.Blue, modifier = Modifier.align(Alignment.CenterEnd))
        Button(onClick = {
            Toast.makeText(context , "button clicked", Toast.LENGTH_SHORT).show()
        } , modifier = Modifier.align(Alignment.BottomCenter)) {
         Text(text = "Click Me")
        }yttejd
        }
    }
}


