package test.moscow.weather.flow.main

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import test.moscow.weather.navigation.Navigation
import test.moscow.weather.ui.common.extensions.backgroundGradient
import test.moscow.weather.ui.theme.AppTheme

@Composable
fun MainScreen() {

    Scaffold(
        modifier = Modifier
            .backgroundGradient()
            .statusBarsPadding()
            .fillMaxSize(),
        containerColor = AppTheme.colorScheme.transparent
    ) { innerPadding ->
        Navigation(
            modifier = Modifier.padding(innerPadding)
        )
    }
}