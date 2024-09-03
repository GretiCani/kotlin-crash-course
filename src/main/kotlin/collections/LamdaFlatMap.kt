package org.kotlin.collections

import org.kotlin.dataclasses.Course
import org.kotlin.dataclasses.CourseCategory
import org.kotlin.functions.courseName

fun getCourses():MutableList<Course>{
    val courses = mutableListOf<Course>(
        Course(1,"book1","author1",CourseCategory.DESIGN),
        Course(2,"book2","author2",CourseCategory.BUSINESS),
        Course(3,"book3","author3",CourseCategory.DEVELOPMENT),
    )
    return courses
}

fun main() {
    val courses = getCourses()
    val devCourses = courses.filter { c ->
        val courseName = c.name
        c.category==CourseCategory.DEVELOPMENT
    }.map {courseName}

    println("Available Courses: $courses")
    println("Development Courses: $devCourses")

    var courses1 = courses.asSequence().filter { c -> c.id>=3 }.toList()
    println("As sequesnce $courses1")
}