package org.kotlin.dataclasses

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DESIGN
)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN
}

fun main() {
    val course = Course(1,"Kotlin course", "John Doe")
    println(course)

    val course1 = Course(2,"Kotlin course", "John Doe")
    println("Check equality : ${course==course1}")

    val course3 = course1.copy(id=3)
    println(course3)
}