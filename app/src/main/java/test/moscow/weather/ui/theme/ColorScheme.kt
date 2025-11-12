package test.moscow.weather.ui.theme

import androidx.compose.ui.graphics.Color

data class AppThemeColors(
    val backgroundStartGradient: Color,
    val backgroundEndGradient: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
    val transparent: Color,
    val progress: Color,
)

val AppThemeLightColorScheme = AppThemeColors(
    backgroundStartGradient = SkyBlue,
    backgroundEndGradient = LightSkyBlue,
    onBackground = White,
    surface = White,
    onSurface = Black,
    transparent = Transparent,
    progress = Blue,
)
