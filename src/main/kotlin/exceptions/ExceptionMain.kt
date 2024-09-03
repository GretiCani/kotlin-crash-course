package org.kotlin.exceptions

fun returnNothing(): Nothing{
    throw RuntimeException("exception")
}


fun main() {
    println("name length is ${nameLength("Kotlin Exceptions")}")
    println("name length is ${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?): Int? {
   var result =  try {
       name!!.length
   }catch (ex: Exception){
       println("Exception is ${ex}")
       null
   }
    return result
}
