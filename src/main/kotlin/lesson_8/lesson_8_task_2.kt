package lesson_8

fun main() {
    val recipeOfBorsch = arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
    println("Что вы желаете найти? ")
    val find = readln()
    for (n in recipeOfBorsch) {
        if (n == find) {
            println("Ингредиент: [$find] в рецепте есть.")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")
}