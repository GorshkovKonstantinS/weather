package test.moscow.weather.repository.weather.objects

val WeatherDto.toData
    get() = Weather(
        location = location?.toData ?: Location(),
        current = current?.toData ?: Current(),
        forecastDays = forecast?.forecastDays?.map { it.toData } ?: listOf(),
    )

val LocationDto.toData
    get() = Location(
        name = name ?: "",
        region = region ?: "",
        country = country ?: "",
    )

val CurrentDto.toData
    get() = Current(
        timestamp = timestamp ?: 0,
        temp = temp ?: 0f,
        condition = condition?.toData ?: Condition(),
        windKph = windKph ?: 0f,
        pressureIn = pressureIn ?: 0f,
        humidity = humidity ?: 0,
        feelsLike = feelsLike ?: 0f,
        visKm = visKm ?: 0f,
    )

val ConditionDto.toData
    get() = Condition(
        text = text ?: "",
        icon = icon ?: "",
    )

val ForecastDayDto.toData
    get() = ForecastDay(
        timestamp = timestamp ?: 0,
        day = day?.toData ?: Day(),
        hours = hours?.map { it.toData } ?: listOf(),
    )

val DayDto.toData
    get() = Day(
        maxTemp = maxTemp ?: 0f,
        minTemp = minTemp ?: 0f,
        avgTemp = avgTemp ?: 0f,
        maxWindKph = maxWindKph ?: 0f,
        chanceOfRain = chanceOfRain ?: 0,
        condition = condition?.toData ?: Condition(),
    )

val HourDto.toData
    get() = Hour(
        timestamp = timestamp ?: 0,
        temp = temp ?: 0f,
        condition = condition?.toData ?: Condition(),
        windKph = windKph ?: 0f,
        windDegree = windDegree ?: 0f,
    )


