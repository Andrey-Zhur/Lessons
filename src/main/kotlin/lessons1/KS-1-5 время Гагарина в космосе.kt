package org.example.lessons1

const val SIXTY: Int = 60

fun main() {

    val secondsFlight: Short = 6480
    val hour: Int = secondsFlight / (SIXTY*SIXTY)
    val remainingHour= secondsFlight % (SIXTY*SIXTY)
    val minute: Int = remainingHour / SIXTY
    val seconds: Int = remainingHour % SIXTY

    println("%02d:%02d:%02d".format(hour, minute, seconds))

}