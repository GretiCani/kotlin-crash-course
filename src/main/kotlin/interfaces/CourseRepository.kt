package org.kotlin.interfaces

import org.kotlin.dataclasses.Course

interface CourseRepository {

    fun getCourseById(courseId : Int): Course
    fun printCourse(course : Course) = println(course)
}