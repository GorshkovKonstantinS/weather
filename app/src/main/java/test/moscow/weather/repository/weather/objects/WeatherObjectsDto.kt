package test.moscow.weather.repository.weather.objects

import com.google.gson.annotations.SerializedName

data class ForecastDto(
    @SerializedName("location") val location: LocationDto?,
)

data class LocationDto(
    @SerializedName("name") val name: String?,
    @SerializedName("region") val region: String?,
    @SerializedName("country") val country: String?,
)
