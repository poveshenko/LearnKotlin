package lesson_2

fun main() {
    val trainDeparture ="Поезд выехал в 9:39"
    val enRoute = 457
    val min = enRoute / 60 % 60
    val hours = enRoute / 60 / 60
    val arrivalTime = String.format("%02d:%02d", hours, min)
    println(trainDeparture)
    println("Прибытие поезда в $arrivalTime")
}