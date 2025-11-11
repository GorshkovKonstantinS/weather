package test.moscow.weather.repository.weather

import test.moscow.weather.repository.base.NetRes
import test.moscow.weather.repository.weather.objects.Forecast
import test.moscow.weather.repository.weather.objects.toData
import javax.inject.Inject

class WeatherRemoteStorageImpl @Inject internal constructor(
    private val apiService: WeatherApiService,
) : WeatherRemoteStorage {

    override suspend fun getForecast(): NetRes<Forecast> =
        try {
            val res = apiService.getForecast(
                key = "fa8b3df74d4042b9aa7135114252304",
                q = "55.7569,37.6151",
                days = 3
            ).toData
            NetRes.Ok(res)
        } catch (_: Exception) {
            NetRes.Error()
        }

}
