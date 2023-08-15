package lesson_9

fun main() {
    val omelette = listOf("Яицо", "Молоко", "Масло")
    val omelette2 = listOf(2, 50, 15)

    println("Введите количество порций?")
    val countPortion = readln().toInt()
    println("На [$countPortion] порций вам понадобится:")

    omelette.forEachIndexed() { addPortion, ingredient ->
        val portion = omelette2.getOrNull(addPortion)
        println("Ингридиент: $ingredient | Количество - ${portion!! * countPortion}")
    }
}