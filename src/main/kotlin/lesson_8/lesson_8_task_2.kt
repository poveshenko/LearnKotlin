package lesson_8

fun main() {
    val recipeOfBorsch = arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
    var found = false
    println("Что вы желаете найти? ")
    val find = readln()
    for (n in recipeOfBorsch) {
        if (n == find) {
            found = true
            break
        }
    }
    if (found) {
        println("Ингредиент: [$find] в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}