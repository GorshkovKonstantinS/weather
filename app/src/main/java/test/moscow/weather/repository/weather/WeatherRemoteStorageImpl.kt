package test.moscow.weather.repository.weather

import test.moscow.weather.repository.base.NetRes
import test.moscow.weather.repository.weather.objects.Weather
import test.moscow.weather.repository.weather.objects.toData
import javax.inject.Inject

class WeatherRemoteStorageImpl @Inject internal constructor(
    private val apiService: WeatherApiService,
) : WeatherRemoteStorage {

    override suspend fun getWeather(key: String): NetRes<Weather> =
        try {
            val res = apiService.getWeather(
                key = key,
                q = "55.7569,37.6151",
                days = 3,
                lang = "ru",
            ).toData
            NetRes.Ok(res)
        } catch (_: Exception) {
            NetRes.Error()
        }

}
