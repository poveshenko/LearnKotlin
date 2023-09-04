package lesson_12


class weatherForEveryDay(
    var temperatureNight: Int,
    var temperatureDay: Int,
    var isRain: Boolean
) {


    fun info() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = weatherForEveryDay(10, 20, false)
    monday.info()

    val tuesday = weatherForEveryDay(8, 18, true)
    tuesday.info()

    val wednesday = weatherForEveryDay(6, 16, false)
    wednesday.info()
}