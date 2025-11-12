package test.moscow.weather.flow.weather.views.days

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import test.moscow.weather.repository.weather.objects.ForecastDay

@Composable
fun WeatherDays(
    days: List<ForecastDay>,
    onSelectDay: (ForecastDay) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(days, key = { it.timestamp }) { day ->
            WeatherDayItem(
                day = day,
                onSelectDay = onSelectDay,
            )
        }
    }

}