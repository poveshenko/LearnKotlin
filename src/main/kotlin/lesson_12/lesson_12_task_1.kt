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
    val monday = Weather(
        temperatureDay = 11,
        temperatureNight = 23,
        isRain = true
    )
    monday.info()
    monday.temperatureNight = 8
    monday.temperatureDay = 25
    monday.isRain = false
    monday.info()

    val
            tuesday = Weather(
        temperatureDay = 9,
        temperatureNight = 25,
        isRain = true
    )
    tuesday.info()
    tuesday.temperatureNight = 7
    tuesday.temperatureDay = 28
    tuesday.isRain = false
    tuesday.info()
}