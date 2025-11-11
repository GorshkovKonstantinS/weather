package test.moscow.weather.repository.weather.objects

val ForecastDto.toData
    get() = Forecast(
        location = location?.toData ?: Location(),
    )

val LocationDto.toData
    get() = Location(
        name = name ?: "",
        region = region ?: "",
        country = country ?: "",
    )