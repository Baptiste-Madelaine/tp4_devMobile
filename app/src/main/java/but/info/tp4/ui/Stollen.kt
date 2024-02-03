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
import but.info.tp4.R

class Stollen : IRecette {

    @Composable
    override fun Resume(modifier: Modifier) {
        Column(
            modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_stollen_foreground),
                contentDescription = "Stollen",
            )
            Texte("Stollen Alsacien", textAlign = TextAlign.Justify)
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    override fun Ingredients(modifier: Modifier) {
        LazyVerticalGrid(GridCells.Adaptive(150.dp)) {
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("farine")
                    Texte(
                        "1.5Kg de farine",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("sucre")
                    Texte(
                        "200g de sucre en poudre",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("levure_boulanger", "Levure de boulanger")
                    Texte(
                        "2 paquets de levure de boulanger",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("sel")
                    Texte(
                        "1 cuillère à soupe de sel",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("lait")
                    Texte(
                        "1/2l de lait",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("beurre")
                    Texte(
                        "500g de beurre",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("amandes_effilees", "Amandes Effilées")
                    Texte(
                        "250g d'amandes effilées",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("citron")
                    Texte(
                        "du citron",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("rhum")
                    Texte(
                        "1/2 verre de rhum",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("oeuf")
                    Texte(
                        "3 œufs entier + 3 jaunes",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("raisin_corinthe", "Raisin de Corinthe")
                    Texte(
                        "250g de raisins de Corinthe",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AssetImage("cedrat_confit", "Cédrat Confit")
                    Texte(
                        "125g de cédrat confit",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }

    @Composable
    override fun Recette(modifier: Modifier) {
        Column(
            modifier = modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Texte("Émietter la levure dans un verre de lait tiède, y ajouter 200 g de farine, bien travailler et mettre à lever.")
            Texte("Pendant ce temps, incorporer le sucre au beurre, ajouter le sel, les œufs, le zeste de citron et travailler le tout pour obtenir une pommade.")
            Texte("Dans une grande terrine, mettre la farine, creuser un puits et y verser le levain et le mélange au beurre.")
            Texte("Ajouter peu à peu le lait, les fruits confits coupés en petits dés, les amandes, les raisins préalablement trempés dans le rhum.")
            Texte("La pâte doit être assez ferme sinon ajouter de la farine.")
            Texte("Couvrir avec un linge et faire lever dans un endroit tiède 30 min.")
            Texte("Pétrir une seconde fois et faire lever encore 20 min.")
            Texte("Abaisser la pâte dans le sens de la longueur pour avoir deux bourrelets de grosseur inégale. Rabattre la plus petite sur la moitié de l'autre pour lui donner sa forme spéciale. Faire cuire 1 heure à thermostat 6-7. ")
            Texte("A la sortie du four, badigeonner de beurre fondu et saupoudrer de sucre glace. C'est délicieux!")
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
