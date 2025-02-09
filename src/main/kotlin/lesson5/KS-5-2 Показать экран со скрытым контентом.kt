package org.example.lesson5

const val YEAR = 2025
const val YEARACCESS = 18

fun main() {

    println("Введите свой год рождения: ")
    val result = readLine()!!.toInt()
    val access = YEAR - result

    if (access >= YEARACCESS) { println("Показать экран со скрытым контентомт")
    } else println("ты малявка")

}