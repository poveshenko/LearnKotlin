package lesson_8

fun main() {
    val recipeOfBorsch =
        arrayOf("Свекла", "Морковь", "Лук", "Картошка", "Томатная паста", "Честнок", "Говядина", "Соль")
    for (i in recipeOfBorsch) {
        println("Ингридиент:${recipeOfBorsch.indexOf(i) + 1}: $i")
    }
    do {
        var found = false
        println("\nЧто вы желаете найти? ")
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
    } while (!found)
    println("Введите индекс ингридиента для замены")
    val replaceIndex = readln().toInt()
    println("Введите ингридиент для замены")
    val replaceIngredient = readln()

    recipeOfBorsch.set(replaceIndex, replaceIngredient)
    for (i in recipeOfBorsch) {
        println("Готово! Вы сохранили следующий список:")
        println("Ингридиент:${recipeOfBorsch.indexOf(i) + 1}: $i")
    }
}