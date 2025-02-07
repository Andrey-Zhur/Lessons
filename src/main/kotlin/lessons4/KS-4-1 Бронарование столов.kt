package org.example.lessons4

const val RESERVEDTABLE = 13

fun main() {

    val reservedToday = 13
    val reservedTomorrow = 9

    val employment1 = reservedToday == RESERVEDTABLE
    val employment2 = reservedTomorrow > RESERVEDTABLE
           println("[Доступность столиков на сегодня:$employment1]\n[Доступность столиков на сегодня:$employment2]")

}