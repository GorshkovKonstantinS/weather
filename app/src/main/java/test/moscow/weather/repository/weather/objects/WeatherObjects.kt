package test.moscow.weather.repository.weather.objects

data class Weather(
    val location: Location = Location(),
    val current: Current = Current(),
    val forecastDays: List<ForecastDay> = listOf(),
)

data class Location(
    val name: String = "",
    val region: String = "",
    val country: String = "",
)

data class Current(
    val timestamp: Long = 0,
    val temp: Float = 0f,
    val condition: Condition = Condition(),
    val windKph: Float = 0f,
    val pressureIn: Float = 0f,
    val humidity: Int = 0,
    val feelsLike: Float = 0f,
    val visKm: Float = 0f,
)

data class ForecastDay(
    val timestamp: Long = 0,
    val day: Day = Day(),
    val hours: List<Hour> = listOf(),
)

data class Day(
    val maxTemp: Float = 0f,
    val minTemp: Float = 0f,
    val avgTemp: Float = 0f,
    val maxWindKph: Float = 0f,
    val chanceOfRain: Int = 0,
    val condition: Condition = Condition(),
)

data class Hour(
    val timestamp: Long = 0,
    val temp: Float = 1f,
    val condition: Condition = Condition(),
    val windKph: Float = 1f,
    val windDegree: Float = 1f,
)


data class Condition(
    val text: String = "",
    val icon: String = "",
)