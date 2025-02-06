package org.example.lessons2

fun main() {

    val cristRes = 7
    val ironRes = 11
    val bonus = 0.2

    val cristResBonus1 = cristRes * bonus
    val cristResBonus2 = cristResBonus1.toInt()

    val ironResBonus1 = ironRes * bonus
    val ironResBonus2 = ironResBonus1.toInt()

    println(cristResBonus2)
    println(ironResBonus2)

}