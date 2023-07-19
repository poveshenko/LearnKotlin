package lesson_2

fun main() {
    val buff = 20
    val oreCrystal = 7
    val ironOre = 11
    val res = (oreCrystal * buff / 100f).toInt()
    val res2 = (ironOre * buff / 100f).toInt()
    println("Кристалическая Руда:  $res% бонусных")
    println("Железная Руда:  $res2% бонусных")

}