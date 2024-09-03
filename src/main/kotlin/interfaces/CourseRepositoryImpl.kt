package org.kotlin.interfaces

import org.kotlin.dataclasses.Course

class CourseRepositoryImpl : CourseRepository {

    override fun getCourseById(courseId: Int): Course {
        return Course(1,"kotlin","Author")
    }
}