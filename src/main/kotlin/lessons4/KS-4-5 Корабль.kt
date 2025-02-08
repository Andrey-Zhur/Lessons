package org.example.lessons4


fun main() {

    println("Введите наличие повреждений корпуса (true/false):")
    val hasDamage = readLine().toBoolean()

    println("Введите текущий состав экипажа:")
    val crewCount = readLine()!!.toInt()

    println("Введите количество ящиков с провизией на борту:")
    val foodBoxes = readLine()!!.toInt()

    println("Введите благоприятность метеоусловий (true/false):")
    val isWeatherFavorable = readLine().toBoolean()

    val canSail = (
            (!hasDamage && crewCount in 55..70 && foodBoxes > 50) ||
                    (hasDamage && crewCount == 70 && isWeatherFavorable && foodBoxes >= 50)
            )

    println("Корабль может отправиться в плавание: $canSail")
}