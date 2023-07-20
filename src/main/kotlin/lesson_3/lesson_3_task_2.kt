package lesson_3

fun main() {
    val name = "Татьяна Сергеевна"
    val surName = "Андреева $name"
    val age = "20"
    val surName2 = "Сидорова $name"
    val age2 = "22"
    println("До момента как вышла замуж.\nФИО:$surName \nВозраст: $age")
    println()
    println(("Вышла замуж.\nФИО:$surName2 \nВозраст: $age2"))
}