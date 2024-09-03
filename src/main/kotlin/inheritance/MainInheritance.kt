package org.kotlin.inheritance

fun main() {
    val student = Student("student")
    val instructor = Instructor("instructor")
    student.login()
    instructor.login()
    Authenticate.authenticate()
    Student.userDetails()
    Student.userDetails1()
    println(Student.numberOfAttempts)
}