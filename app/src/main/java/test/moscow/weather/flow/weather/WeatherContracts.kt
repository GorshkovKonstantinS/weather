package test.moscow.weather.flow.weather

import test.moscow.weather.repository.weather.objects.ForecastDay
import test.moscow.weather.repository.weather.objects.Weather

data class WeatherState(
    val weather: Weather = Weather(),
    val selectedForecastDay: ForecastDay = ForecastDay(),
    val errorDialogVisible: Boolean = false,
    val progressVisible: Boolean = false,
)

sealed class WeatherUiEvent {
    data object GetFailForecast : WeatherUiEvent()
    data object GetForecast : WeatherUiEvent()
    data class OnChangeErrorDialogVisible(val visible: Boolean) : WeatherUiEvent()
    data class OnSelectDay(val day: ForecastDay) : WeatherUiEvent()
}