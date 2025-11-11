package test.moscow.weather.repository.base

sealed class NetRes<out T> {
    class Ok<T>(val result: T) : NetRes<T>()
    class Error(val message: String = "Ошибка ответа от сервера") : NetRes<Nothing>()
}