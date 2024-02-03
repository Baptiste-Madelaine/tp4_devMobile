package but.info.tp4.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import but.info.tp4.R

class Caponata : IRecette {
    @Composable
    override fun Resume(modifier: Modifier) {
        Column(modifier.verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(painter = painterResource(id = R.mipmap.ic_caponata_foreground),
                contentDescription = "Caponata",
            )
            Texte(
                "Plat traditionnel de la cuisine sicilienne, la caponata est un mélange de légumes du soleil. Vous avez envie de changer de votre ratatouille habituelle ? Optez pour cette délicieuse recette estivale dont on vous dévoile les secrets !",
                textAlign = TextAlign.Justify
            )
        }
    }

    @Composable
    override fun Ingredients(modifier: Modifier) {
        Column(modifier = modifier.verticalScroll(rememberScrollState())) {
            Texte("Des aubergines", textAlign = TextAlign.Justify)
            Texte("Des tomates", textAlign = TextAlign.Justify)
            Texte("Des oignons", textAlign = TextAlign.Justify)
            Texte("Des olives vertes", textAlign = TextAlign.Justify)
            Texte("Du céleri", textAlign = TextAlign.Justify)
            Texte("Des capres", textAlign = TextAlign.Justify)
            Texte("De l'huile d'olive", textAlign = TextAlign.Justify)
            Texte("Du vinaigre", textAlign = TextAlign.Justify)
            Divider()
            Texte(
                "des poivrons, des amandes, des anchois, des pignons de pin ou des raisins secs selon la région",
                textAlign = TextAlign.Justify
            )
        }
    }

    @Composable
    override fun Recette(modifier: Modifier) {
        Column(modifier = modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Texte(
                "Pour que les arômes de votre caponata se fassent bien ressentir, le secret réside dans la cuisson.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Coupez vos légumes en tout petits morceaux, puis poêlez-les les uns après les autres dans de l'huile d'olive.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "À la différence de la ratatouille, vous devez faire frire les aubergines.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Une fois cette étape faite, vous devez les faire revenir tous ensemble dans du vinaigre pendant quelques minutes puis ajoutez un peu de sucre.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Cela viendra apporter à votre plat sicilien un goût particulier, plutôt aigre-doux.",
                textAlign = TextAlign.Justify
            )
            Divider()
            Texte(
                "Petit conseil : avant de vous lancer dans la cuisson, n'oubliez pas de blanchir votre céleri dans de l'eau salée durant 5 minutes et de dégorger vos aubergines avec du gros sel pendant au moins 30 minutes.",
                textAlign = TextAlign.Justify
            )
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