package test.moscow.weather.repository.weather.objects

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("location") val location: LocationDto?,
    @SerializedName("current") val current: CurrentDto?,
    @SerializedName("forecast") val forecast: ForecastDto?,
)

data class LocationDto(
    @SerializedName("name") val name: String?,
    @SerializedName("region") val region: String?,
    @SerializedName("country") val country: String?,
)

data class CurrentDto(
    @SerializedName("last_updated_epoch") val timestamp: Long?,
    @SerializedName("temp_c") val temp: Float?,
    @SerializedName("condition") val condition: ConditionDto?,
    @SerializedName("wind_kph") val windKph: Float?,
    @SerializedName("pressure_in") val pressureIn: Float?,
    @SerializedName("humidity") val humidity: Int?,
    @SerializedName("feelslike_c") val feelsLike: Float?,
    @SerializedName("vis_km") val visKm: Float?,
)

data class ForecastDto(
    @SerializedName("forecastday") val forecastDays: List<ForecastDayDto>?,
)

data class ForecastDayDto(
    @SerializedName("date_epoch") val timestamp: Long?,
    @SerializedName("day") val day: DayDto?,
    @SerializedName("hour") val hours: List<HourDto>?,
)

data class DayDto(
    @SerializedName("maxtemp_c") val maxTemp: Float?,
    @SerializedName("mintemp_c") val minTemp: Float?,
    @SerializedName("avgtemp_c") val avgTemp: Float?,
    @SerializedName("maxwind_kph") val maxWindKph: Float?,
    @SerializedName("daily_chance_of_rain") val chanceOfRain: Int?,
    @SerializedName("condition") val condition: ConditionDto?,
)

data class HourDto(
    @SerializedName("time_epoch") val timestamp: Long?,
    @SerializedName("temp_c") val temp: Float?,
    @SerializedName("condition") val condition: ConditionDto?,
    @SerializedName("wind_kph") val windKph: Float?,
    @SerializedName("wind_degree") val windDegree: Float?,
)

data class ConditionDto(
    @SerializedName("text") val text: String?,
    @SerializedName("icon") val icon: String?,
)


