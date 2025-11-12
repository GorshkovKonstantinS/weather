package test.moscow.weather.flow.weather.views.days

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import test.moscow.weather.R
import test.moscow.weather.repository.weather.objects.ForecastDay
import test.moscow.weather.ui.common.extensions.DateFormat
import test.moscow.weather.ui.common.extensions.dateToString
import test.moscow.weather.ui.theme.AppTheme
import java.util.Date

@Composable
fun WeatherDayItem(
    day: ForecastDay,
    onSelectDay: (ForecastDay) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        onClick = { onSelectDay(day) },
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        color = AppTheme.colorScheme.transparent,
        border = BorderStroke(0.5.dp, AppTheme.colorScheme.onBackground),
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = Date(day.timestamp * 1000).dateToString(DateFormat.EEEE_DD_MMMM),
                style = AppTheme.fonts.normalText.copy(
                    color = AppTheme.colorScheme.onBackground
                ),
            )
            AsyncImage(
                model = "https:${day.day.condition.icon}",
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(60.dp)
            )
            Text(
                text = stringResource(R.string.weather_temp_day, day.day.maxTemp),
                style = AppTheme.fonts.normalText.copy(
                    color = AppTheme.colorScheme.onBackground
                ),
            )
            Text(
                text = stringResource(R.string.weather_temp_night, day.day.minTemp),
                style = AppTheme.fonts.normalText.copy(
                    color = AppTheme.colorScheme.onBackground
                ),
            )
        }
    }
}