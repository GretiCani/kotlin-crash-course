package org.kotlin.functions

fun main(){
    printName("John Doe")
    var result = addition(1,2)
    println("result 1+2=$result")
    println("additional result 1+2=${addition_approach1(1,2)}")
}

fun addition(nr1: Int, nr2: Int): Int {
    return nr1+nr2

}

fun addition_approach1(x:Int,y:Int) = x+y

fun printName(name: String) {
    println("Your name is $name")
}
