package but.info.tp4.ui

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter

interface IRecette {
    @Composable
    fun Resume(modifier: Modifier)

    @Composable
    fun Ingredients(modifier: Modifier)

    @Composable
    fun Recette(modifier: Modifier)

    @Composable
    fun Texte(text: String, modifier: Modifier = Modifier, textAlign: TextAlign = TextAlign.Justify) {
        Text(text = text,
            modifier = modifier,
            style = MaterialTheme.typography.h5,
            textAlign = textAlign
        )
    }
    @Composable
    fun AssetImage(name: String, descr : String = name.replaceFirstChar { it.uppercaseChar() }) {
        Image(
            painter = rememberDrawablePainter(
                Drawable.createFromStream(
                    LocalContext.current.assets.open("$name.webp"),
                    name
                )
            ), contentDescription = descr,
            Modifier.size(128.dp)
        )
    }


}