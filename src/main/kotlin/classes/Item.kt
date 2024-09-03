package org.kotlin.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0

    get() {
        println("inide getter")
        return field
    }

        set(value){
            if (value>=0.0){
                field =value
            }else{
                throw IllegalArgumentException("Not a valid value")
            }
        }

    constructor(_name: String):this(){
        name=_name
    }
}

fun main() {
    val item = Item("Android")
    item.price=-1.0
    println("name ${item.name} and Price: ${item.price}")
}