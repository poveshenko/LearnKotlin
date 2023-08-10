package lesson_8

fun main() {
    println("Введите Количество ингридиентов:")
    val quantityOfIngredients = readln().toInt()
    val recipeOfBorsch = Array(quantityOfIngredients) { "" }
    println("Введите ингридиенты:")
    for (i in 0..<quantityOfIngredients) {
        recipeOfBorsch[i] = readln()
    }
    // Вывод массива
    println("Список ингридиентов")
    for (element in recipeOfBorsch) {
        println("Ингридиенты:${recipeOfBorsch.indexOf(element) + 1}: $element")
    }
}