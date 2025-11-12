package test.moscow.weather.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    val provideAppTheme = ProvideAppTheme(
        colorScheme = AppThemeLightColorScheme,
        fonts = Fonts()
    )

    CompositionLocalProvider(LocalProvideAppTheme provides provideAppTheme, content = content)
}

object AppTheme {
    val colorScheme: AppThemeColors
        @Composable
        get() = LocalProvideAppTheme.current.colorScheme

    val fonts = Fonts()
}

val LocalProvideAppTheme = staticCompositionLocalOf<ProvideAppTheme> {
    error("No theme provided")
}

data class ProvideAppTheme(
    val colorScheme: AppThemeColors,
    val fonts: Fonts
)
