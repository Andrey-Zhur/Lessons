package org.example.lessons1

fun main() {

    val secondsFlight: Short = 6480
    val hour: Int = secondsFlight / 3600
    val remainingHour= secondsFlight % 3600
    val minute: Int = remainingHour / 60
    val seconds: Int = remainingHour % 60

    print("%02d:%02d:%02d".format(hour, minute, seconds))

}