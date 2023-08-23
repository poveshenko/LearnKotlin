package lesson_9

fun main() {
    println("Введите пять названий ингредиентов блюда, разделяя их запятыми:")
    val ingredientsStr = readln()
    val sortedIngredients = ingredientsStr.split(",").sorted()
    println("Отсортированный список ингредиентов:")
    sortedIngredients.forEach {
        println(" Ингридиент: (${sortedIngredients.indexOf(it) + 1}) - $it")
    }
}