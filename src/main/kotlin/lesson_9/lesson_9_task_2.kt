package lesson_9

fun main() {
    val ingredients = mutableListOf("мука", "яйцо", "молоко")
    println("В рецепте есть базовые ингредиенты:\n")
    ingredients.forEach {
        Thread.sleep(1000)
        println("Ингредиент: ${ingredients.indexOf(it) + 1} - $it ")
    }
    Thread.sleep(2000)
    println("\nЖелаете добавить еще?")
    val user = readln()
    if (user.equals("Нет", ignoreCase = true)) {
        print("Завершение программы")
        return
    } else if (user.equals("Да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newAddIngredient = readln()
        ingredients.add(newAddIngredient)
        println("Теперь в рецепте есть следующие ингредиенты:\n")
        ingredients.forEach {
            Thread.sleep(1000)
            println("Ингредиент: ${ingredients.indexOf(it) + 1} - $it ")
        }
    }
}