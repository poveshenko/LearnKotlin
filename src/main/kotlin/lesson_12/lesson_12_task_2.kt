package lesson_12


class WeatherForEveryDay(
    var temperatureNight: Int = 10,
    var temperatureDay: Int = 20,
    var isRain: Boolean = false
) {

    fun info() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = WeatherForEveryDay()
    monday.info()

    val tuesday = WeatherForEveryDay()
    tuesday.info()

    val wednesday = WeatherForEveryDay()
    wednesday.info()
}