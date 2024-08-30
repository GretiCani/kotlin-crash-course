package org.kotlin.basics

fun main(){
    val range = 1..10
    for(i in range){
        println("index is $i")
    }

    val reverseRange = 10 downTo 1
    for(i in reverseRange){
        println("reverse index : $i")
    }

    for(i in reverseRange step 2){
        println("Skip reverse index : $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var x = 5

    do{
        println("Do while index $x")
        x++
    }while (x<10)
}

fun exploreWhile() {
    var x = 1
    while(x <5){
        println("while index $x")
        x++
    }
}
