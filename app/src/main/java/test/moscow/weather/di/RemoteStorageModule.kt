package test.moscow.weather.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import test.moscow.weather.repository.weather.WeatherRemoteStorage
import test.moscow.weather.repository.weather.WeatherRemoteStorageImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteStorageModule {

    @Binds
    @Singleton
    abstract fun weatherRemoteStorage(
        weatherRemoteStorageImpl: WeatherRemoteStorageImpl
    ): WeatherRemoteStorage

}