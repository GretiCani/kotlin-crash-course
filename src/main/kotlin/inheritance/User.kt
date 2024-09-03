package org.kotlin.inheritance

open class User(val name: String) {

    fun login(){
        println("Login user $name")
    }
}