package test.moscow.weather.ui.common.extensions

import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import test.moscow.weather.ui.theme.AppTheme

fun Modifier.backgroundGradient(
    shape: Shape = RectangleShape,
): Modifier = composed {
    background(
        brush = Brush.verticalGradient(
            colors = listOf(
                AppTheme.colorScheme.backgroundStartGradient,
                AppTheme.colorScheme.backgroundEndGradient
            ),
        ),
        shape = shape
    )
}