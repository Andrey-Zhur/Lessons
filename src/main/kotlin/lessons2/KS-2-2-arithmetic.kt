package org.example.lessons2


fun main() {

    val oldWorker = 50
    val salaryOldWorker = 30000

    val intern = 30
    val salaryIntern = 20000

    val payOldWorker = oldWorker * salaryOldWorker
    val payIntern = intern * salaryIntern

    val totalConsumption = payOldWorker + payIntern
    val average = totalConsumption / (oldWorker+intern)

    println("Расходы на выплату зарплаты постоянных сотрудников $payOldWorker")
    println("Общие расходы по ЗП после прихода стажеров $totalConsumption")
    println("Среднюю ЗП одного сотрудника после устройства стажеров $average")

}
