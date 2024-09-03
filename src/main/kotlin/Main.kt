package org.kotlin

import org.kotlin.interfaces.CourseRepository
import org.kotlin.interfaces.CourseRepositoryImpl

fun main() {
    val courseRepository: CourseRepository = CourseRepositoryImpl()
    courseRepository.printCourse(courseRepository.getCourseById(1))
}