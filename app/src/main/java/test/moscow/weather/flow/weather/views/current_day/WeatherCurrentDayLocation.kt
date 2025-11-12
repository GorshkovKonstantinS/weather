package test.moscow.weather.flow.weather.views.current_day

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import test.moscow.weather.R
import test.moscow.weather.ui.theme.AppTheme

@Composable
fun WeatherCurrentDayLocation(
    locationName: String,
    urlIcon: String,
    temp: Float,
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        AsyncImage(
            model = "https:$urlIcon",
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(80.dp),
        )
        Text(
            text = locationName,
            style = AppTheme.fonts.ultraBoldText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 8.dp)
        )
        Text(
            text = stringResource(R.string.temperature, temp),
            style = AppTheme.fonts.ultraBoldText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.weather_text),
            style = AppTheme.fonts.mediumSemiboldText.copy(
                color = AppTheme.colorScheme.onBackground
            ),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 4.dp)
        )
    }
}