package org.example.lessons2

fun main() {

    val amountOfMoney = 70000.0
    val percent = 16.7 / 100
    val years = 20

    val finalAmount = amountOfMoney * Math.pow(1 + percent, years.toDouble())

    print("%.3f".format(finalAmount))

}