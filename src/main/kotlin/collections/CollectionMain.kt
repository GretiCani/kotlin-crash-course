package org.kotlin.collections

fun main() {
    val immutableList = listOf("item1", "item2", "item3")
    println("immutableList: $immutableList")

    var mutableList = mutableListOf("item1", "item2", "item3")
    println("mutableList: $mutableList")

    val immutableMap = mapOf("item1" to  1, "item2" to 2, "item3" to 3)
    println("immutableMap : $immutableMap")

    var mutableMap = mutableMapOf("item2" to 1, "item2" to 2, "item3" to 3)
    println("mutableMap : $mutableMap")

    val immutableSet = setOf("item1", "item2", "item3")
    println("immutableSet: $immutableSet")

    var mutableSet = mutableSetOf("item1", "item2", "item3")
    println("mutableSet $mutableSet")

    var addition = {x: Int -> x+x}
    var numberList = mutableListOf(1, 2, 3)

    numberList.forEach{
        println("sum $it + $it  ${addition(it)}")
    }

    numberList.map{x -> x*2}.forEach{ println(it) }

    val multiply = {x:Int,y:Int ->
        println("X = $x,Y = $y")
        x+y
    }

    numberList.map { x-> multiply(x,x) }.forEach{ println(it) }


}