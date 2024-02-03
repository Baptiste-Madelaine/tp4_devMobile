package but.info.tp4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import but.info.tp4.ui.Caponata
import but.info.tp4.ui.IRecette
import but.info.tp4.ui.Madeleines
import but.info.tp4.ui.theme.TP4Theme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TP4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Modal()
                }
            }
        }
    }
}
@Composable
fun Modal(){
    var recette = remember { mutableStateOf(TypeRecette.Madeleine) }
    val selection = remember { mutableStateOf(0) }
    var drawerState = rememberDrawerState(DrawerValue.Closed)
    var scope = rememberCoroutineScope()
    enumValues<TypeRecette>().forEach {
        println(it)
    }
    ModalDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                Text("Vos Recettes")
                enumValues<TypeRecette>().forEachIndexed { index, content ->
                    OutlinedButton(
                        modifier = Modifier
                            .background(if(selection.value == index) Color.Gray else Color.Transparent),
                        onClick = {
                            recette.value = content
                            selection.value = index
                            scope.launch { drawerState.close() }
                        }){
                        Text(content.toString())
                    }
                }
            }
        },
        content = { Recette(recette.value, drawerState) }
        )
}
@Composable
fun Recette(content: TypeRecette, drawerState: DrawerState) {
    var stateBis = remember { mutableStateOf("Résumé") }
    var selection = remember { mutableStateOf(-1) }
    var modifier = Modifier
    var scope = rememberCoroutineScope()
    Column (){
        Row (horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()){
            IconButton(onClick = {scope.launch { drawerState.open() } }){
                Icon(painterResource(id = R.drawable.ic_menu), "",modifier = modifier, Color.White)
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(
                modifier = Modifier
                    .background(if (selection.value == 0) Color.Gray else Color.Transparent),
                onClick = {
                    stateBis.value = "Résumé"
                    selection.value = 0
                }
            ){ Text("Résumé")}
            OutlinedButton(
                modifier = Modifier
                    .background(if (selection.value == 1) Color.Gray else Color.Transparent),
                onClick = {
                    stateBis.value = "Ingrédients"
                    selection.value = 1
                }
            ){ Text("Ingrédients")}
            OutlinedButton(
                modifier = Modifier
                    .background(if (selection.value == 2) Color.Gray else Color.Transparent),
                onClick = {
                    stateBis.value = "Recette"
                    selection.value = 2
                }
            ){ Text("Recette")}
        }
        when(stateBis.value){
            "Résumé" -> content.Resume(modifier)
            "Ingrédients" -> content.Ingredient(modifier)
            "Recette" -> content.Recette(modifier)
        }
    }
}
