package lesson_8

fun main() {
    val recipeOfBorsch =
        arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
    println("Что вы желаете найти? ")
    val find = readln()
    println(recipeOfBorsch.contains(find))
}