package test.moscow.weather.repository.weather

import test.moscow.weather.repository.base.NetRes
import test.moscow.weather.repository.weather.objects.Forecast

interface WeatherRemoteStorage {

    suspend fun getForecast(): NetRes<Forecast>

}