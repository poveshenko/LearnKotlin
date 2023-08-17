package lesson_9

fun main() {

    val omelette = listOf("Яйцо", "Молоко", "Масло")
    val omeletteOnePortion = listOf(2, 50, 15)

    println("Введите количество порций?")
    val countPortion = readln().toInt()
    println("На [$countPortion] порций вам понадобится:")

    val portion = omeletteOnePortion.map { it * countPortion }
    portion.forEachIndexed { index, addCount ->
        println("Ингредиент: ${omelette[index]} | Количество: $addCount")
    }
}