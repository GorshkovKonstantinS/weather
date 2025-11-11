package test.moscow.weather.repository.weather.objects

data class Forecast(
    val location: Location = Location(),
)

data class Location(
    val name: String = "",
    val region: String = "",
    val country: String = "",
)
