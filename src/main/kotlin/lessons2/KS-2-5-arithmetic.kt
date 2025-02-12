package org.example.lessons2

const val ONEHUNGRED = 100

fun main() {

    val amountOfMoney = 70000.0
    val percent = 16.7
    val years = 20
    val interestRate = percent / ONEHUNGRED

    val finalAmount = amountOfMoney * Math.pow(1 + interestRate, years.toDouble())

    print("%.3f".format(finalAmount))

}