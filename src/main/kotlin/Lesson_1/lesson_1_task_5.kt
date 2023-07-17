package lesson_1

fun main() {
    val seconInSpace = 6480
    val min = seconInSpace / 60 % 60
    val hours = seconInSpace / 60 / 60
    val time = String.format("%02d:%02d", hours, min)
    println(time)
}