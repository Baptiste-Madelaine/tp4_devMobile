package but.info.tp4.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import but.info.tp4.R

class Madeleines : IRecette {
    @Composable
    override fun Resume(modifier: Modifier) {
        Column(
            modifier.verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.mipmap.ic_madeleines_foreground),
                contentDescription = "Madeleines",
            )
            Texte(
                text = "Les madeleines salées sont les gâteaux d’apéro par excellence ! Déclinable à l’infini, on ne s'en lasse pas. On revisite ce classique de nos soirées d’été avec une version pleine de fraîcheur à base de feta et de menthe. Nous vous proposons une recette facile et gourmande !",
                textAlign = TextAlign.Justify
            )
        }
    }

    @Composable
    override fun Ingredients(modifier: Modifier) {
        Column(modifier = modifier.verticalScroll(rememberScrollState())) {
            Texte("150g de feta", textAlign = TextAlign.Justify)
            Texte("15 feuilles de menthe", textAlign = TextAlign.Justify)
            Texte("140 g de farine", textAlign = TextAlign.Justify)
            Texte("3 œufs", textAlign = TextAlign.Justify)
            Texte("1/2 sachet de levure", textAlign = TextAlign.Justify)
            Texte("40 g de beurre", textAlign = TextAlign.Justify)
            Texte("20 cl de crème", textAlign = TextAlign.Justify)
            Texte("1 cuillère à soupe d'huile d’olive", textAlign = TextAlign.Justify)
            Texte("1 cuillère à café de curcuma", textAlign = TextAlign.Justify)
            Texte("1 cuillère à café de cumin", textAlign = TextAlign.Justify)
            Texte("1 gousse d'ail", textAlign = TextAlign.Justify)
            Texte("sel et poivre", textAlign = TextAlign.Justify)
        }
    }

    @Composable
    override fun Recette(modifier: Modifier) {
        Column(modifier = modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Texte(
                "Pour faire de superbes madeleines apéritives, mélangez dans un bol la farine avec la levure chimique.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Ajoutez les œufs, la crème, l'huile d'olive, le curcuma, le cumin et enfin le sel et le poivre.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Incorporez ensuite le beurre fondu, la feta émiettée et la menthe ciselée.",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Versez votre mélange dans des moules à madeleines au ¾",
                textAlign = TextAlign.Justify
            )
            Texte(
                "Mettez vos moules à madeleines au four pendant 15 minutes à 180°c.",
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
    }}