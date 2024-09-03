package org.kotlin.typeCheckingAndCasting

fun main() {
    val name = "John Doe"
    println(name is String)
    val number = 100
    val numberStr = number.toString()
    println(number)
}