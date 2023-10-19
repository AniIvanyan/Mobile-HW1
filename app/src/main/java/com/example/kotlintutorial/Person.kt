package com.example.kotlintutorial

class Person(
    val name: String,
    val age: Int
) {
    init {
        println("Name: $name, Age: $age")
    }

    fun defineLifeStage():String{
        return when (age) {
            in 0..12 -> "child"
            in 13..19 -> "adolescent"
            in 20..39 -> "young adult"
            in 40..64 -> "adult"
            else -> "senior"
        }
    }
}