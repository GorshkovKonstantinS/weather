package test.moscow.weather.repository.weather

import retrofit2.http.GET
import retrofit2.http.Query
import test.moscow.weather.repository.weather.objects.WeatherDto

interface WeatherApiService {

    @GET("forecast.json?")
    suspend fun getWeather(
        @Query("key") key: String,
        @Query("q") q: String,
        @Query("days") days: Int,
        @Query("lang") lang: String,
    ): WeatherDto

}