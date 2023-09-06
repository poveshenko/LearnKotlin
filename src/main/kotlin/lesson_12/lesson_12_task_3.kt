package lesson_12

class WeatherPart3(
     _temperatureNight: Int ,
     _temperatureDay: Int ,
     _isRain: Boolean
) {
    val temperatureNight = _temperatureNight
    val temperatureDay = _temperatureDay
    val isRain = _isRain

    fun info() {
        println("Погода на сегодня:\n1.Ночь: $temperatureNight °C\n2.День: $temperatureDay °C\n3.Был ли дождь: $isRain\n")
    }
}

fun main() {
    val monday = WeatherPart3(8,18,true)
    monday.info()

    val tuesday = WeatherPart3(10,20,false)
    tuesday.info()

    val wednesday = WeatherPart3(12,22,true)
    wednesday.info()
}