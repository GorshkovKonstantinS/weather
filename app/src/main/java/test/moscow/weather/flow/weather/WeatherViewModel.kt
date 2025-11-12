package test.moscow.weather.flow.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import test.moscow.weather.repository.base.NetRes
import test.moscow.weather.repository.weather.WeatherRemoteStorage
import test.moscow.weather.repository.weather.objects.ForecastDay
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    val remoteStorage: WeatherRemoteStorage,
) : ViewModel() {

    private val _state: MutableStateFlow<WeatherState> = MutableStateFlow(WeatherState())
    val state = _state.asStateFlow()


    fun handleUiEvent(uiEvent: WeatherUiEvent) {
        when (uiEvent) {
            is WeatherUiEvent.GetFailForecast -> getForecast(key = "")
            is WeatherUiEvent.GetForecast -> getForecast(key = "fa8b3df74d4042b9aa7135114252304")
            is WeatherUiEvent.OnChangeErrorDialogVisible ->
                onChangeErrorDialogVisible(uiEvent.visible)

            is WeatherUiEvent.OnSelectDay -> onSelectDay(uiEvent.day)
        }
    }

    private fun getForecast(key: String) {
        _state.update { state ->
            state.copy(
                errorDialogVisible = false,
                progressVisible = true
            )
        }
        viewModelScope.launch {
            remoteStorage.getWeather(key = key).let { res ->
                when (res) {
                    is NetRes.Ok -> _state.update { state ->
                        state.copy(
                            weather = res.result,
                            selectedForecastDay = res.result.forecastDays.firstOrNull()
                                ?: ForecastDay(),
                            progressVisible = false
                        )
                    }

                    is NetRes.Error -> _state.update { state ->
                        state.copy(
                            errorDialogVisible = true,
                            progressVisible = false
                        )
                    }

                }
            }
        }
    }

    private fun onChangeErrorDialogVisible(visible: Boolean) {
        _state.update { state -> state.copy(errorDialogVisible = visible) }
    }

    private fun onSelectDay(day: ForecastDay) {
        _state.update { state -> state.copy(selectedForecastDay = day) }
    }

}