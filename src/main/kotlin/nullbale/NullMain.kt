package org.kotlin.nullbale

fun main() {
    var field1: String?  = null
    println(field1)
    field1 = "test"
    println(field1)

    var field2  = "test2"
    println(field2)
    castObj(2.2)
    castObj(25)


}

fun castObj( input: Any){
    when(input){
        input as? Double -> println("Hello Double")
        input as? Int -> println("Hello Int")
    }
}

