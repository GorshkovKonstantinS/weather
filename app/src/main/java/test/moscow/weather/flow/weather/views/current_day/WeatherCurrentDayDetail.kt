package test.moscow.weather.flow.weather.views.current_day

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import test.moscow.weather.R
import test.moscow.weather.repository.weather.objects.Current
import test.moscow.weather.ui.theme.AppTheme

@Composable
fun WeatherCurrentDayDetail(
    current: Current,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.weather_current_humidity, current.humidity),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        Text(
            text = stringResource(R.string.weather_current_visibility, current.visKm),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        Text(
            text = stringResource(
                R.string.weather_current_feels_temp,
                current.feelsLike
            ),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        Text(
            text = stringResource(
                R.string.weather_current_wind,
                current.windKph / 3.6f
            ),
            style = AppTheme.fonts.normalText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
    }
}