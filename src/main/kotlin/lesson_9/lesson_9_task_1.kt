package lesson_9

fun main() {
    val saladRecipe = listOf("Помидор", "Огурец", "Лук", "Зелень")
    println("В рецепте есть следующие ингредиенты:")
    saladRecipe.forEach {
        println("Ингридиент: ${saladRecipe.indexOf(it) + 1} $it ")
    }
}