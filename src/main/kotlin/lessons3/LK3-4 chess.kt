package org.example.lessons3

fun main() {

    var whereFrom = "E2"
    var whereTo = "E4"
    var moveNumber1 = 20

    println("[$whereFrom - $whereTo; $moveNumber1]")

    whereFrom = "D2"
    whereTo = "D3"
    var moveNumber2 = moveNumber1 + 1

    println("[$whereFrom - $whereTo; $moveNumber2]")

}