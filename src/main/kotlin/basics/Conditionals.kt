package org.kotlin.basics

fun main(){
    val name = "John"
    var ifResult = if (name.length==4){
        println("name $name has four characters")
        name.length
    }else{
        println("name $name do not have four characters")
        name.length
    }

    println(ifResult)

    var position = 1

//    var medal = if(position==1){
//        "GOLD"
//    }else if (position ==2){
//        "SILVER"
//    }else if(position==3){
//        "BRONZE"
//    }else{
//        "NO MEDAL"
//    }

    val medal = when (position){
        1-> "GOLD"
        2-> "SILVER"
        3-> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)
}
