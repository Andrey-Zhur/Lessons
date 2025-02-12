package org.example.lessons2

const val HOUR = 60
const val DAY = 24

fun main() {

    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTime = 457

    val timeOfDay = (hourDeparture * HOUR + minuteDeparture) + travelTime

    val hourTravel = timeOfDay / HOUR % DAY
    val minuteTravel = timeOfDay % HOUR

    println("Прибытие поезда $hourTravel:$minuteTravel")

}