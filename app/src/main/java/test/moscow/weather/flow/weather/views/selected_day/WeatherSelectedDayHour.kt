package test.moscow.weather.flow.weather.views.selected_day

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import test.moscow.weather.R
import test.moscow.weather.repository.weather.objects.Hour
import test.moscow.weather.ui.common.extensions.DateFormat
import test.moscow.weather.ui.common.extensions.dateToString
import test.moscow.weather.ui.theme.AppTheme
import java.util.Date

@Composable
fun WeatherSelectedDayHour(
    hour: Hour,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = Date(hour.timestamp * 1000).dateToString(DateFormat.HH_MM),
            style = AppTheme.fonts.smallText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
        AsyncImage(
            model = "https:${hour.condition.icon}",
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(40.dp)
        )
        Text(
            text = stringResource(R.string.temperature, hour.temp),
            style = AppTheme.fonts.smallText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
        )
    }

}