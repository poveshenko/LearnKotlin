package lesson_8

fun main() {
    val week = arrayOf(3, 2, 5, 2, 1, 6, 4)
    var views = 0
    for (i in week) {
        views += i
        println("День - ${week.indexOf(i) + 1} | количество просмотров: $i")
    }
    println("\nВсего просмотров за неделю: $views")
}