package org.example.lessons4

const val CATWEATHER = "солнечная"
const val CATAWNINGISOPEN = "открыт"
const val CATHUMIDITY = 20
const val CATTIMEOFYEAR = "не зима"

fun main() {

    val weather = "солнечная"
    val awningIsOpen = "открыт"
    val humidity = 20
    val timeOfYear = "зима"

    val correspondence = (weather == CATWEATHER) && (awningIsOpen == CATAWNINGISOPEN)
            && (humidity == CATHUMIDITY) && (timeOfYear == CATTIMEOFYEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $correspondence")

}