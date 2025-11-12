package test.moscow.weather.flow.weather.views.current_day

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import test.moscow.weather.repository.weather.objects.Current
import test.moscow.weather.ui.common.extensions.DateFormat
import test.moscow.weather.ui.common.extensions.dateToString
import test.moscow.weather.ui.theme.AppTheme
import java.util.Date

@Composable
fun WeatherCurrentDay(
    locationName: String,
    current: Current,
    modifier: Modifier = Modifier
) {
    if (current.condition.icon.isNotEmpty())
        Column(
            modifier = modifier
        ) {
            WeatherCurrentDayLocation(
                locationName = locationName,
                urlIcon = current.condition.icon,
                temp = current.temp
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 16.dp, 16.dp)
            ) {
                WeatherCurrentDayDetail(
                    current = current,
                    modifier = Modifier.weight(1f)
                )
                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = Date(current.timestamp * 1000).dateToString(DateFormat.EEEE_HH_MM),
                        style = AppTheme.fonts.mediumText.copy(
                            color = AppTheme.colorScheme.onBackground
                        ),
                    )
                    Text(
                        text = current.condition.text,
                        style = AppTheme.fonts.mediumText.copy(
                            color = AppTheme.colorScheme.onBackground
                        ),
                    )
                }
            }
        }
}