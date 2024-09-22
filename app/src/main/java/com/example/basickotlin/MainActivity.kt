package com.example.basickotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

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
//            layout()

            //cardLayout
//            CardLayout()

            //textfield in compose
            textField()

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
//    @Composable
//    fun layout(){
//        var context= LocalContext.current
//        Box (modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.DarkGray),
//            contentAlignment = Alignment.Center){
//            Text(text = "Munna Jaiswal", color = Color.Cyan, modifier = Modifier.align(Alignment.CenterStart))
//            Text(text = "Munna Jaiswal", color = Color.Red, modifier = Modifier.align(Alignment.Center))
//            Text(text = "Munna Jaiswal", color = Color.Blue, modifier = Modifier.align(Alignment.CenterEnd))
//        Button(onClick = {
//            Toast.makeText(context , "button clicked", Toast.LENGTH_SHORT).show()
//        } , modifier = Modifier.align(Alignment.BottomCenter)) {
//         Text(text = "Click Me")
//        }
//        }
//    }

    //card and image layout
//    @Composable
//    fun CardLayout(){
//        Card(
//            modifier = Modifier.padding(horizontal = 8.dp, vertical = 0.dp),
//            elevation = CardDefaults.cardElevation(10.dp)
//        ) {
//            Column {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
//                    contentDescription = "image of kotlin",
//                    modifier = Modifier.padding(top = 8.dp, bottom = 0.dp)
//                )
//                Text(text = "hi", modifier = Modifier
//                    .padding(10.dp)
//                    .align(Alignment.CenterHorizontally))
//            }
//
//        }
//    }

    //textfield in compose

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun textField(){
        var valueOfField by remember {
            mutableStateOf(TextFieldValue(""))
        }
        Box (contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ){
            TextField(value =valueOfField, onValueChange = {
                valueOfField=it
            },
                label = {Text(text = "Name:")} ,
                placeholder = { Text(text = "Enter your name:")},//placeholder
                leadingIcon = {Icon(Icons.Default.Person,contentDescription=null)},//icon in starting
                trailingIcon = {Icon(Icons.Default.Info, contentDescription = null)}, //icon in ending
                singleLine = true, //the text will contain single line
                )
        }
    }

}


