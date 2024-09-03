package org.kotlin.scopefunctions

import org.kotlin.dataclasses.Course
import org.kotlin.dataclasses.CourseCategory

fun main() {
//    exploreApplyFnc()
//    exploreAlsoFnc()
//    println(exploreLetFunc())
//    exploreWithFunc()
//    exploreRunFunc()

    val addition = run {
        val x = 10
        val y = 20
        println("x=$x + y=$y")
        x+y
    }
    println("Sum is $addition")
}





fun exploreLetFunc():Int{
   val numbers = listOf(1,2,3,4,5)

   return numbers.map { x -> x * x }.let {
        println(it)
        it.sum()
    }
}

fun exploreApplyFnc() {
    var course = Course(1,"test1","test2")
        .apply {
            category = CourseCategory.DEVELOPMENT
        }

    println("course = $course")
}

fun exploreAlsoFnc() {
    var course = Course(1,"test1","test2")
        .apply {
            category = CourseCategory.DEVELOPMENT
        }
        .also {
//            it.category = CourseCategory.DEVELOPMENT
            println("course = $it")
        }


}

fun exploreWithFunc(){
    var numbers = listOf(1,2,3,4,5)

    with(numbers){
        println("numbers = $this")
    }
}

fun exploreRunFunc(){
    var numbers : MutableList<Int>?=null
    val sum = numbers.run {
        numbers = mutableListOf(1,2,3,4,5)
        numbers?.sum()
    }.also { println("it = $it") }
}
