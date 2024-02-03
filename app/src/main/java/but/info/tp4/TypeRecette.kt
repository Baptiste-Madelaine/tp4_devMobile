package but.info.tp4

import android.graphics.Paint.Cap
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import but.info.tp4.ui.Caponata
import but.info.tp4.ui.GratinPates
import but.info.tp4.ui.Madeleines

enum class TypeRecette {
    Madeleine() {
        @Composable
        override fun Resume(modifier: Modifier) {
            Madeleines().Resume(modifier)
        }
        @Composable
        override fun Ingredient(modifier: Modifier) {
            Madeleines().Ingredients(modifier)
        }
        @Composable
        override fun Recette(modifier: Modifier) {
            Madeleines().Recette(modifier)
        }
    },
    Caponata(){
        @Composable
        override fun Resume(modifier: Modifier) {
            but.info.tp4.ui.Caponata().Resume(modifier)
        }
        @Composable
        override fun Ingredient(modifier: Modifier) {
            but.info.tp4.ui.Caponata().Ingredients(modifier)
        }
        @Composable
        override fun Recette(modifier: Modifier) {
            but.info.tp4.ui.Caponata().Recette(modifier)
        }
    },
    GratinPates() {
        @Composable
        override fun Resume(modifier: Modifier) {
            but.info.tp4.ui.GratinPates().Resume(modifier)
        }
        @Composable
        override fun Ingredient(modifier: Modifier) {
            but.info.tp4.ui.GratinPates().Ingredients(modifier)
        }
        @Composable
        override fun Recette(modifier: Modifier) {
            but.info.tp4.ui.GratinPates().Recette(modifier)
        }
    };

    @Composable
    abstract fun Resume(modifier : Modifier)
    @Composable
    abstract fun Ingredient(modifier: Modifier)
    @Composable
    abstract fun Recette(modifier: Modifier)
}