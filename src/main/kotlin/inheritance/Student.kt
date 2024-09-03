package org.kotlin.inheritance

class Student(name:String) : User(name) {

    companion object{

        const val numberOfAttempts = 30

        fun userDetails(){
            println("User Details")
        }

        fun userDetails1(){
            println("User Details")
        }
    }
}