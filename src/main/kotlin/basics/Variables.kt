package org.kotlin.basics

fun main(){
    val salary = 3000L
    println(salary)
    val course = "Kotlin Spring"
    println("Course: $course and the course length is ${course.length}")

    val multiLine = "ABC \nDEF"
    println(multiLine)

    val multiLine1 =  """
        ABC
        DEF
     """.trimIndent()
    println(multiLine1)

}