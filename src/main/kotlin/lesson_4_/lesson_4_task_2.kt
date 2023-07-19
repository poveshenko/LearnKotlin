package lesson_4_

fun main() {
    val cargoWithWeight = 50
    val volumeOfLiters = 100
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
                "${(cargoWithWeight <= 35) && (cargoWithWeight >= 100) && (volumeOfLiters >= 100)}")
}