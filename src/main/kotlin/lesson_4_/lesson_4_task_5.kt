package lesson_4_

fun main() {

    //Корабль
    println("Имеет ли корабль повреждения? ")
    val isShip = readln().toBoolean()
    val commandOne = if (isShip) "-Есть"
    else "-Нет"

    //Погода
    println("Погода благоприятна или неблагоприятна? ")
    val isWeather = readln().toBoolean()
    val commandTwo = if (isShip) "-Погода благоприятная"
    else "-Погода неблагоприятная"

    //Провизия
    println("Укажите количество ящиков с провизией")
    val boxesOfProvisions = readln().toInt()
    val commandThree = if (boxesOfProvisions == NORMAL_BOXES) "-Провизии на борту коробля, достаточно! "
    else "-Не достаточно провизии!"

    //Экипаж
    println("Укажите количество экипажа  на борту")
    val crew = readln().toInt()
    val commandFour = if (crew >= CREW_FROM && crew <= CREW_UP_TO) "-Текущий состав экипажа в норме"
    else "-Не достаточно людей на борту"

    //Результат
    println("Научно-исследовательский корабль:\n$commandOne\n$commandTwo\n$commandThree\n$commandFour\n")
}

const val CREW_FROM = 55
const val CREW_UP_TO = 70
const val NORMAL_BOXES = 50