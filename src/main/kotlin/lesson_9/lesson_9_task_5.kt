package lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    while (ingredients.size < 5) {
        print("Введите название ингредиента: ")
        val ingredient = readln()
        ingredients.add(ingredient)
    }
    val sortedIngredients = ingredients.sorted()
    println(sortedIngredients.joinToString(", ") + ".")
}