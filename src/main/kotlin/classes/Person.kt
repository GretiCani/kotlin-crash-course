package org.kotlin.classes

class Person(val name: String = "", val age: Int=0) {
    var email: String = ""
    var nameLength = 0
    init {
        println("Person class initialized")
        nameLength = name.length
    }

    constructor(_email: String): this(){
        email=_email
    }

    constructor(_email: String,_name:String="",_age:Int=0): this(_name,_age){
        email=_email
    }
    fun action(){
        println("Person walks")
    }
}

fun main(){
    val person = Person("John Doe",18)
    person.action()
    println("name: ${person.name} and Age ${person.age}")

    val person1 = Person()
    person.action()
    println("name: ${person1.name} and Age ${person1.age}")

    val person2 = Person(_email = "abc@gmail.com", _name = "John", _age = 20)
    println("name: ${person1.name} and nameLength is: ${person2.nameLength} and Age ${person1.age} and Email is ${person2.name}")
}