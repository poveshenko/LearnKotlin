package lesson_1


fun main() {
    val seconInSpace = 6480
    val sec = seconInSpace % 60
    val min = seconInSpace / 60 % 60
    val hours = seconInSpace / 60 / 60
    println("$hours:$min:$sec")

}