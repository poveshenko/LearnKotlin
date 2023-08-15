package lesson_9

fun main() {
    val saladRecipe = listOf<String>("Помидор", "Огурец", "Лук", "Зелень")
    println("В рецепте есть следующие ингредиенты:\n[список_ингредиентов]")
    saladRecipe.forEach() {
        println("Ингридиент: ${saladRecipe.indexOf(it) + 1} $it ")
    }
}