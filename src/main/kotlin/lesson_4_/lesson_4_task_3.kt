package lesson_4_

fun main() {
    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidity = 20
    val season = "Зима"

    val isSunny = true
    val isAwningOpen = true
    val airHumidityIs = 20
    val currentSeason = "Зима"

    println("Погода сегодня: ${weatherToday == isSunny}")
    println("Тент на данный момент: ${awningAtTheMoment == isAwningOpen}")
    println("Влажность воздуха: ${airHumidityIs == airHumidity}")
    println("Текущее время года: ${currentSeason != season}")
}

