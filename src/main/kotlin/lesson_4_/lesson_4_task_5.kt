package lesson_4_

fun main() {
    println("Имеет ли корабль повреждения? ")
    val ship = readLine()!!.toBoolean()
    val commandOne = when (ship) {
        true -> "-Корабль поврежден"
        false -> "-Корабль не имеет повреждений"
    }

    println("Погода благоприятна или неблагоприятна? ")
    val weather = readLine()!!.toBoolean()
    val commandTwo = when (weather) {
        true -> "-Погода благоприятная"
        false -> "-Погода неблагоприятная"
    }

    println("Укажите количество ящиков с провизией")
    val boxesOfProvisions = readLine()!!.toInt()
    val commandThree = if (boxesOfProvisions == normalBoxes)
        "-Провизии на борту коробля, достаточно! "
    else "-Не достаточно провизии!"

    println("Укажите количество экипажа  на борту")
    val crew = readLine()!!.toInt()
    val commandFour = if (crew >= crewFrom && crew <= crewUpTo) "-Текущий состав экипажа в норме"
   // else if (crew == normalCrew) "-Состав экипажа в полной готовности"
    else "-Не достаточно людей на борту"


    println("Научно-исследовательский корабль:\n $commandOne\n$commandTwo\n$commandThree\n$commandFour\n ")
}

//const val normalCrew = 70
const val crewFrom = 55
const val crewUpTo = 70
const val normalBoxes = 50