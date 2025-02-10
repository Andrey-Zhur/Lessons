package org.example.lesson5

fun main () {

    val winningNumbers1 = 5
    val winningNumbers2 = 15

    println("Для участия в лотереи введите число от 0 до 42")
    println("Введите 1 число")
    val result1 = readLine()!!.toInt()

    println("Введите 2 число")
    val result2 = readLine()!!.toInt()

    println("Для победы нужны числа $winningNumbers1 и $winningNumbers2 ")

    when {
        (result1 == winningNumbers1) && (result2 == winningNumbers2) -> println("Поздравляем! Вы выиграли главный приз!")
        (result2 == winningNumbers1) && (result1 == winningNumbers2) -> println("Поздравляем! Вы выиграли главный приз!")
        (result1 == winningNumbers1) || (result2 == winningNumbers2) -> println("Поздравляем! Вы выиграли утешительный приз!")
        (result2 == winningNumbers1) || (result1 == winningNumbers2) -> println("Поздравляем! Вы выиграли утешительный приз!")
        else -> print("Неудача")
    }
}
