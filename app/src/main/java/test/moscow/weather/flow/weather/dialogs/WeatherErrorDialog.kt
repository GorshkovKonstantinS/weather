package test.moscow.weather.flow.weather.dialogs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import test.moscow.weather.R
import test.moscow.weather.ui.animations.FadeInFadeOutAnimation
import test.moscow.weather.ui.theme.AppTheme

@Composable
fun WeatherErrorDialog(
    visible: Boolean,
    onDismissRequest: () -> Unit,
    onClickRefresh: () -> Unit,
) {
    FadeInFadeOutAnimation(
        visible = visible,
    ) {
        Dialog(
            onDismissRequest = onDismissRequest,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = AppTheme.colorScheme.surface,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(20.dp)
            ) {
                Text(
                    text = stringResource(R.string.weather_error_dialog_title),
                    modifier = Modifier.fillMaxWidth(),
                    style = AppTheme.fonts.largeSemiboldTextCenter.copy(
                        color = AppTheme.colorScheme.onSurface
                    )
                )
                Text(
                    text = stringResource(R.string.weather_error_dialog_text),
                    modifier = Modifier.padding(top = 20.dp),
                    style = AppTheme.fonts.mediumText.copy(
                        color = AppTheme.colorScheme.onSurface
                    )
                )
                Button(
                    onClick = onClickRefresh,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AppTheme.colorScheme.backgroundStartGradient
                    ),
                ) {
                    Text(
                        text = stringResource(R.string.weather_error_dialog_button_text),
                        style = AppTheme.fonts.mediumSemiboldText.copy(
                            color = AppTheme.colorScheme.onBackground
                        )
                    )
                }

            }
        }
    }
}