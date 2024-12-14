package org.example.lesson_2

fun main() {
    val workers = 50
    val junior = 30
    val salaryWorker = 30000
    val salaryJunior = 20000

    val expSalaryWorkers = workers * salaryWorker
    val allExp = expSalaryWorkers + junior * salaryJunior
    val averageSalary = allExp / (workers + junior)

    println(expSalaryWorkers)
    println(allExp)
    println(averageSalary)

}