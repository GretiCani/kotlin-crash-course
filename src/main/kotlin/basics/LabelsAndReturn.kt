package org.kotlin.basics

fun main(){

    label()

    listOf(1,2,3,4,5).forEach each@ {
        println("forEach it: $it")
        if (it==3)return@each
    }

    println("End of program")
}

fun label() {
    loop@ for (i in 1..5){
        println("i in label $1")
//        if (i==3) break@loop
        innerLabel@ for(j in 1..5){
            println("inner loop label index $j")
            if(j==3)break@innerLabel
        }
    }
}
