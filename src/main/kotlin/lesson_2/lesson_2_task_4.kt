package lesson_2

fun main() {
    val buff = 20
    val oreCrystal = 7
    val ironOre = 11
    val amount = oreCrystal+ironOre
    val res = (amount * buff/100f).toInt()
    println("% $res боннусных")
}