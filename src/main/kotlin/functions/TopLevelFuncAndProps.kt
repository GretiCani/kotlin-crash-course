package org.kotlin.functions

fun topLevelFunc() = (0..100).random()
val courseName = "Kotlin Programming"

fun main() {
    val num = topLevelFunc()
    println("course: $courseName, random nr is $num")
}