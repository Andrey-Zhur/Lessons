package org.example.lessons3

fun main() {

    var surname = "Андреева"
    val name = "Татьяна"
    val otchestvo = "Сергеевна"
    var age = 20

    println("$surname $name $otchestvo Возвраст:$age")

    age = age + 2
    surname = "Сидорова"

    println("$surname $name $otchestvo Возвраст:$age")

}