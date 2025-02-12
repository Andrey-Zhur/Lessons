package org.example.lessons2

const val ONEHUNDRED = 100.0

fun main() {

    val cristRes = 7
    val ironRes = 11
    val bonus = 20

    val bonusConversion = bonus / ONEHUNDRED

    val cristResBonus1 = cristRes * bonusConversion
    val cristResBonus2 = cristResBonus1.toInt()

    val ironResBonus1 = ironRes * bonusConversion
    val ironResBonus2 = ironResBonus1.toInt()

    println(cristResBonus2)
    println(ironResBonus2)

}
