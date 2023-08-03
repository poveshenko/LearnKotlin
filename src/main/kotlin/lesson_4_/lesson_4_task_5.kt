package lesson_4_

fun main() {

//    //Корабль
//    println("Имеет ли корабль повреждения? ")
//    val isDamage = readln().toBoolean()
//    val commandOne = if (isDamage) "-Есть"
//    else "-Нет"
//
//    //Погода
//    println("Погода благоприятна или неблагоприятна? ")
//    val isWeather = readln().toBoolean()
//    val commandTwo = if (isWeather) "-Погода благоприятная"
//    else "-Погода неблагоприятная"
//
//    //Провизия
//    println("Укажите количество ящиков с провизией")
//    val boxesOfProvisions = readln().toInt()
//    val commandThree = if (boxesOfProvisions == NORMAL_BOXES) "-Провизии на борту коробля, достаточно! "
//    else "-Не достаточно провизии!"


    println("Имеет ли корабль повреждения?")
    val isDamage = readln().toBoolean()
    println("Погода благоприятна или неблагоприятна?")
    val isWeather = readln().toBoolean()
    println("Укажите количество ящиков с провизией")
    val boxesOfProvisions = readln().toInt()
    println("Укажите количесвто экипажа ")
    val crew = readln().toInt()
    val result =
        (!isDamage)&&(boxesOfProvisions >= NORMAL_BOXES) && (crew in CREW_FROM..CREW_UP_TO) || (crew == RECOMMENDED) && (isWeather)&&(boxesOfProvisions > NORMAL_BOXES)

    println(result)

    //Результат
//    println("Научно-исследовательский корабль:\n$commandOne\n$commandTwo\n$commandThree\n$commandFour\n")
}

const val CREW_FROM = 55
const val CREW_UP_TO = 70
const val RECOMMENDED = 70
const val NORMAL_BOXES = 50

