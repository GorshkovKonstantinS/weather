package test.moscow.weather.flow.weather

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import test.moscow.weather.flow.weather.dialogs.WeatherErrorDialog
import test.moscow.weather.ui.views.ProgressView

@Composable
fun WeatherBaseScreen(
    viewModel: WeatherViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.handleUiEvent(WeatherUiEvent.GetFailForecast)
    }

    WeatherScreen(
        state = state,
        onSelectDay = { day -> viewModel.handleUiEvent(WeatherUiEvent.OnSelectDay(day)) },
        onRefresh = { viewModel.handleUiEvent(WeatherUiEvent.GetForecast) }
    )

    WeatherErrorDialog(
        visible = state.errorDialogVisible,
        onDismissRequest = {
            viewModel.handleUiEvent(WeatherUiEvent.OnChangeErrorDialogVisible(false))
        },
        onClickRefresh = { viewModel.handleUiEvent(WeatherUiEvent.GetForecast) }
    )

    if (state.progressVisible)
        ProgressView()


}