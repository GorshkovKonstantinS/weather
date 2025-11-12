package test.moscow.weather.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import test.moscow.weather.flow.weather.WeatherBaseScreen

@Composable
fun Navigation(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = WeatherNavigation,
        modifier = modifier.fillMaxSize(),
    ) {
        composable<WeatherNavigation> {
            WeatherBaseScreen()
        }
    }
}