package but.info.tp4.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.*
import but.info.tp4.R

class GratinPates : IRecette {
    @Composable
    override fun Resume(modifier: Modifier) {
        Column(modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_gratin_pates_foreground),
                contentDescription = "Gratin de pâtes",
            )
            Texte("Gratin de pâtes lardons et champignons", textAlign = TextAlign.Justify)
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun Ingredients(modifier: Modifier) {
        LazyVerticalGrid(GridCells.Adaptive(150.dp)) {
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("pates", "Pâtes")
                    Texte("300g de pâtes", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("oignon")
                    Texte("200g d'oignon", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("champignons")
                    Texte("1 boîte de champignons", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("lardons")
                    Texte("400g de lardons", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("ail")
                    Texte("1 gousse d'ail", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("poivre")
                    Texte("du poivre", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("sel")
                    Texte("du sel", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("persil")
                    Texte("du persil", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("beurre")
                    Texte("60g de beurre", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("farine")
                    Texte("60g de farine", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("lait")
                    Texte("75cl de lait", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("gruyere", "Gruyère")
                    Texte("150g de gruyère", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("muscade")
                    Texte("de la muscade", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                }
            }
        }
    }

    @Composable
    override fun Recette(modifier: Modifier) {
        Column(modifier = modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Texte("Faire revenir les lardons et les oignons hachés sans matière grasse(celle des lardons suffit).")
            Texte("Ajouter la gousse d'ail hachée.")
            Texte("Pendant ce temps faire cuire les pâtes à l'eau bouillante salée.")
            Texte("Dans la poêle des lardons, ajouter les champignons hachés et le persil, laisser cuire à feu doux 10 min.")
            Texte("Préparer la béchamel avec le beurre, le lait et la farine, et y ajouter le gruyère râpé, saler, poivrer et parfumer de muscade.")
            Texte("Mélanger ensemble la poêlée de lardons, les pâtes et la béchamel.")
            Texte("Mettre le tout dans un plat allant au four et enfourner 20 min à 210°C (thermostat 6-7).")
        }
    }

    @Preview
    @Composable
    fun PreviewResume() {
        Resume(modifier = Modifier)
    }
    @Preview
    @Composable
    fun PreviewIngerdients() {
        Ingredients(modifier = Modifier)
    }
    @Preview
    @Composable
    fun PreviewRecette() {
        Recette(modifier = Modifier)
    }
}