package org.example.lesson5

fun main() {

    println("Решите пример: 4+5= ")
    val result = readLine()!!.toInt()

    if (result == 9) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}