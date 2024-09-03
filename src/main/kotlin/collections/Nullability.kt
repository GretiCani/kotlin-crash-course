package org.kotlin.collections

fun collectionNullability(){
    var list : MutableList<String>? = null
    list = mutableListOf()
    list.add("Elem1")
    list.forEach { println(it) }
}

fun main() {
    println(collectionNullability())
    var strings : List<String?> = listOf("elem1",null, "elem2")
    strings.forEach { println("Value length is ${it?.length}") }
}
