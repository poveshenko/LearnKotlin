package lesson_4_

fun main() {
    val cargoWithWeight = 50
    val volumeOfLiters = 100
    println(
        "Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': " +
                "${(cargoWithWeight <= AVERAGE_WEIGHT_FROM) && (cargoWithWeight >= AVERAGE_VOLUME_UP_TO) && (volumeOfLiters >= AVERAGE_VOLUME)}"
    )
}

const val AVERAGE_WEIGHT_FROM = 35
const val AVERAGE_VOLUME_UP_TO = 100
const val AVERAGE_VOLUME = 100