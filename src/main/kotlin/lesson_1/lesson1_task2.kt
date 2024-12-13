package org.example.lesson_1

fun main() {
    var countOrders: Int = 75
    val thanksMessage: String = "Thanks for the purchase!"
    var countWorker = 2000

    println("Number of orders: $countOrders")
    println(thanksMessage)
    //println("Number of employees: $countWorker")

    countWorker -= 1
    println("Number of employees: $countWorker")
}