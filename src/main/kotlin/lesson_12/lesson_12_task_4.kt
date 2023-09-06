package lesson_12

class WeatherPart4(
    var temperatureNight: Int = 10,
    var temperatureDay: Int = 20,
    var isRain: Boolean = false
) {

    init {
        info()
    }

    fun info() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = WeatherPart4()
    val tuesday = WeatherPart4()
    val wednesday = WeatherPart4()
}