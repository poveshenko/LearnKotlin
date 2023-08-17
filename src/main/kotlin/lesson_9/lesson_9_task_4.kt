package lesson_9

fun main() {
    println("Введите пять названий ингредиентов блюда, разделяя их запятыми:")

    val ingredientsStr = readln() // считываем строку с ингредиентами
    val ingredientsList = ingredientsStr.split(",").toList() // разбиваем строку на список ингредиентов
    //-----
    val sortedIngredients = ingredientsList.sorted() // сортируем список ингредиентов по алфавиту
    println("Отсортированный список ингредиентов:")
    sortedIngredients.forEach {
        println(" Ингридиент: (${sortedIngredients.indexOf(it) + 1}) - $it")
    } // выводим отсортированный список ингредиентов
}