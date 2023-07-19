package lesson_4_

fun main() {
    val weatherToday = true
    val awningAtTheMoment = true
    val airHumidity = 20
    val season = "Зима"

    val thePresenceOfSunnyWeather = true
    val openTent = true
    val airHumidityIs = 20
    val currentSeason = "Не зима"

    println("Погода сегодня: ${weatherToday == thePresenceOfSunnyWeather}")
    println("Тент на данный момент: ${awningAtTheMoment == openTent}")
    println("Влажность воздуха: ${airHumidityIs == airHumidity}")
    println("Текущее время года: ${currentSeason == season}")
}