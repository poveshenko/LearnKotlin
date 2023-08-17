package lesson_8

fun main() {
    val recipeOfBorsch =
        arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
    println("Что вы желаете найти? ")
    val find = readln()
    if (recipeOfBorsch.contains(find)) {
        println("Ингридиент: [$find] есть в рецепте")
    } else {
        println("Ингридиент: [$find] в рецепте нет")
    }
}