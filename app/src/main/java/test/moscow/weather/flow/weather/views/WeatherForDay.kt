package test.moscow.weather.flow.weather.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import test.moscow.weather.R
import test.moscow.weather.repository.weather.objects.ForecastDay
import test.moscow.weather.ui.common.extensions.DateFormat
import test.moscow.weather.ui.common.extensions.dateToString
import test.moscow.weather.ui.theme.AppTheme
import java.util.Date

@Composable
fun WeatherForDay(
    selectedDay: ForecastDay,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = Date(selectedDay.timestamp * 1000).dateToString(DateFormat.EEEE_DD_MMMM),
            style = AppTheme.fonts.mediumSemiboldText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        Text(
            text = stringResource(R.string.weather_day_max_wind, selectedDay.day.maxWindKph / 3.6f),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        Text(
            text = stringResource(R.string.weather_day_chance_of_rain, selectedDay.day.chanceOfRain),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
    }
}