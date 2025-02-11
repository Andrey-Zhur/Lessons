package org.example.lesson5

const val USERNAME = "Zaphod"
const val USERPASSWORD = "PanGalactic"

fun main () {

    println("Для входа на корабль введите имя пользователя")
    val userNameEnter = readln()

    if (userNameEnter == USERNAME) {
        println("Введите пароль")
        val userPasswordEnter= readln()
        if (userPasswordEnter == USERPASSWORD) {
            println(" Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\"") }
        else { println("Пароль не верный")}
    } else {
        println("Данный пользователь не зарегистрирован")
    }
}