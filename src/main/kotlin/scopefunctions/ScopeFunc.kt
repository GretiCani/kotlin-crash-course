package org.kotlin.scopefunctions

fun main() {
    var name: String? = null

    name?.run {
        println("Value of var name is $this")
    }

    name = "Name1"
    name?.run {
        println("Value of var name is $this")
    }

    val numbers = listOf(1,2,3,4,5)

    numbers.let { println("Current value is $it") }
}