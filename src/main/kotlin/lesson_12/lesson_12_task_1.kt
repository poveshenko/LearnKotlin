package lesson_12


class Weather {
    var temperatureNight = 10
    var temperatureDay = 20
    var isRain = false

    fun printInfo() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = Weather()
    monday.printInfo()
    monday.temperatureNight = 8
    monday.temperatureDay = 25
    monday.isRain = false
    monday.printInfo()

    val tuesday = Weather()
    tuesday.printInfo()
    tuesday.temperatureNight = 7
    tuesday.temperatureDay = 28
    tuesday.isRain = false
    tuesday.printInfo()
}