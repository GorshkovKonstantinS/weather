package test.moscow.weather.flow.weather

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import test.moscow.weather.R
import test.moscow.weather.flow.weather.views.WeatherForDay
import test.moscow.weather.flow.weather.views.current_day.WeatherCurrentDay
import test.moscow.weather.flow.weather.views.days.WeatherDays
import test.moscow.weather.flow.weather.views.selected_day.WeatherSelectedDay
import test.moscow.weather.repository.weather.objects.ForecastDay
import test.moscow.weather.repository.weather.objects.Weather
import test.moscow.weather.ui.animations.FadeInFadeOutAnimation
import test.moscow.weather.ui.theme.AppTheme

@Composable
fun WeatherScreen(
    state: WeatherState,
    onSelectDay: (ForecastDay) -> Unit,
    onRefresh: () -> Unit,
) {
    PullToRefreshBox(
        isRefreshing = false,
        onRefresh = onRefresh
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 20.dp)
        ) {
            item {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = stringResource(R.string.weather_title),
                        style = AppTheme.fonts.megaSemiboldText
                            .copy(color = AppTheme.colorScheme.onBackground),
                        modifier = Modifier.padding(20.dp)
                    )
                }
            }
            item {
                FadeInFadeOutAnimation(
                    visible = state.weather != Weather()
                ) {
                    Column {
                        WeatherCurrentDay(
                            locationName = state.weather.location.name,
                            current = state.weather.current,
                        )
                        WeatherSelectedDay(
                            hours = state.selectedForecastDay.hours,
                            modifier = Modifier.padding(top = 20.dp)
                        )
                        WeatherForDay(
                            selectedDay = state.selectedForecastDay,
                            modifier = Modifier.padding(16.dp, 20.dp, 16.dp)
                        )
                        WeatherDays(
                            days = state.weather.forecastDays,
                            onSelectDay = onSelectDay,
                            modifier = Modifier.padding(top = 20.dp)
                        )
                    }
                }
            }
        }
    }


}