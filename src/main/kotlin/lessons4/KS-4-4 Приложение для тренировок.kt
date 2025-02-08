package org.example.lessons4

fun main() {

    var dayTren = 5

    val exercisesArmAb = dayTren % 2 != 0
    val exercisesLegsBack = dayTren % 2 == 0

    val conclusion = """
        Упражнения для рук:    $exercisesArmAb    
        Упражнения для ног:    $exercisesLegsBack    
        Упражнения для спины:  $exercisesLegsBack 
        Упражнения для пресса: $exercisesArmAb       
    """.trimIndent()

    print(conclusion)

}