package lesson_9

fun main() {
    val omelette = listOf("Яицо", "Молоко", "Масло")
    val omelette2 = listOf(2, 50, 15)

    println("Введите количество порций?")
    val countPortion = readln().toInt()
    println("На [$countPortion] порций вам понадобится:")

    omelette.forEachIndexed() { portion, ingredient ->
        val otherValue = omelette2.getOrNull(portion)
        println("Ингридиент: $ingredient | Количество - ${otherValue!! * countPortion}")
    }
}