package lesson_4_

fun main() {
    val numberOfDay = 1
    val isEven = numberOfDay % 2 == 0
    val arms =  "Упражнения для рук: ${!isEven}"
    val legs = "Упражнения для ног: $isEven"
    val back = "Упражнения для спины: $isEven"
    val press = "Упражнения для пресса: ${!isEven}"
    println("$arms\n$legs\n$back\n$press")
}
