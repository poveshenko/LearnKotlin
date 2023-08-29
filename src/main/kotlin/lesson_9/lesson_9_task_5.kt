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
//    sortedIngredients[1].capitalize()
//
//    println(sortedIngredients.joinToString(", ") + ".")
//}
//Нужно еще немного доработать)
//
//1.результат должен повторить повторы - для пробы поиска коллекции, которая не умеет хранить повторы и
//делать приведение, подобное ей.
//2.Чтобы сделать первый компонент заглавной буквы, достаточно сначала обратиться к нему по индексу,
//затем либо по принципу многомерного массива [][] также взять строки первого элемента, либо сначала вызвать для
//него()