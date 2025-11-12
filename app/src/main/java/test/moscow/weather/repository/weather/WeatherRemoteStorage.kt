package test.moscow.weather.repository.weather

import test.moscow.weather.repository.base.NetRes
import test.moscow.weather.repository.weather.objects.Weather

interface WeatherRemoteStorage {

    suspend fun getWeather(key: String): NetRes<Weather>

}