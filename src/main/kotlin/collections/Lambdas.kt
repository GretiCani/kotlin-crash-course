package org.kotlin.collections

fun calculate(x:Int, y:Int,op:(x:Int,y:Int)->Int):Int{
    println("Calculation of $x and $y")
    return op(x, y)
}

fun main() {
    val addition = {x:Int, y:Int -> x+y}
    println("${calculate(2,2){x:Int, y:Int -> x+y}}")
    val multiply = {x:Int, y:Int -> x*y}
    println("${calculate(2,2,multiply)}")
    val divide = {x:Int, y:Int ->x/y}
    println("${calculate(2,2,divide)}")

    val elm = listOf(1,2,3,4,5).filter { it>=3 }
    println(elm)

    val evenNumber= {x: Int -> x%2!=2}

    elm.filter { evenNumber.invoke(it) }.forEach{
        println(it)
    }

    val numbers = listOf(listOf(1,2,3,4,5),listOf(6,7,8,9,10),listOf(11,12,13,14))

    numbers.map {list-> list.map{nr-> nr.toDouble()}}.forEach { print(it) }
    println()
    numbers.flatMap { list -> list.map { nr-> nr.toDouble()}}.forEach { print(it) }


}

