package test.moscow.weather.flow.weather.views.selected_day

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import test.moscow.weather.repository.weather.objects.Hour

@Composable
fun WeatherSelectedDay(
    hours: List<Hour>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(hours, key = { it.timestamp }) { hour ->
            WeatherSelectedDayHour(
                hour = hour
            )
        }
    }
}