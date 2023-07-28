package lesson_5

fun main() {
    println("Введите дату рождения ")
    val dateOfBirth = readln().toInt()
    val userAge = 2023 - dateOfBirth
    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом ")
    else if (userAge == 16 || userAge == 17) println("Показать экран с ограниченным контентом ")
    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18