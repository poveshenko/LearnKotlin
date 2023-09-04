package lesson_12


class Weather(
    var temperatureNight: Int = 10,
    var temperatureDay: Int = 20,
    var isRain: Boolean = false
) {

    fun info() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = Weather()
    monday.info()

    val tuesday = Weather()
    tuesday.info()

    val wednesday = Weather()
    wednesday.info()
}