package org.kotlin.functions

import java.time.LocalDate

fun main(){
    printPersonDetails(email="johndoe@yahoo.com", name = "John Doe")
}

fun printPersonDetails(name:String, email: String="", dob:LocalDate=LocalDate.now()){
    println("Name:$name, Email:$email, DOB:$dob")
}