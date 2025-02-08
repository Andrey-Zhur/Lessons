package org.example.lessons4

fun main() {

    var weight = 20
    var volume = 80

    var catAverageWeight = (weight > 35) && (weight <= 100)
    var catAveragevolume = volume < 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${catAverageWeight && catAveragevolume}")

    weight = 50
    volume = 100

    catAverageWeight = weight > 35
    catAveragevolume = volume < 100

    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${catAverageWeight && catAveragevolume}")

}
