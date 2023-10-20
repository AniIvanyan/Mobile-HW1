package com.example.kotlintutorial

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.ArithmeticException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner


fun main() {
    // task1. Declare an array and a list of your choice, initialize them with values, and print the elements.
    println("Here is the task 1")
    task1()
    // task2. Create a string variable and perform various string manipulations such as concatenation, substring extraction, and changing case, then print the modified string.
    println("Here is the task 2")
    task2()
    //task3. Declare a map with key-value pairs and iterate through it to print both keys and values.
    println("Here is the task 3")
    task3()
    //task4. Write a function that takes an integer as input and returns a string indicating whether it's positive, negative, or zero. Call this function with different integer inputs and print the results.
    println("Here is the task 4")
    task4()
    //task5. Create a program that asks the user for their name and age, then prints a personalized greeting with their name and a message based on their age.
    println("Here is the task 5")
    task5()
    //task6. Write a function that takes two numbers as input and divides them. Implement error handling to handle division by zero and print an appropriate message.
    println("Here is the task 6")
    task6()
    //task7. Get the current date and time, format it, and print it.
    println("Here is the task 7")
    task7()
    //task8. Define a class representing a simple "Person" with properties like name and age. Create an object of this class and print its properties.
    println("Here is the task 8")
    task8()
    //task9. Extend Person class and write a function that takes a person's age as input and returns a string indicating their life stage (e.g., "Child," "Teenager," "Adult”).
    println("Here is the task 9")
    task9()
    //task10. Declare a list of integers and use a lambda function to filter and print only the even numbers from the list.
    println("Here is the task 10")
    task10()
}

fun task1() {
    val array = arrayOf("This", "is", "an", "array")
    val list = listOf("This", "is", "a", "list")
    println("Elements of an array: ${array.joinToString()}")
    println("Elements of a list: ${list.joinToString()}")
}

fun task2() {
    var string = "This is a"
    string += " string"
    val substring = string.substring(10)
    val upperString = string.uppercase()
    println("Original string: $string")
    println("Substring: $substring")
    println("Uppercase string: $upperString")
}

fun task3() {
    val map = mapOf(1 to "first", 2 to "second", 3 to "third")
    for ((key, value) in map) {
        println("$key = $value")
    }
}

fun task4() {
    fun checkingNumSign(number: Int): String {
        return when {
            number > 0 -> "$number is positive"
            number < 0 -> "$number is negative"
            else -> "$number is zero"
        }
    }
    println(checkingNumSign(4))
    println(checkingNumSign(-4))
    println(checkingNumSign(-0))
}

fun task5() {
    val scanner = Scanner(System.`in`)
    println("Please enter your name")
    val name = scanner.next()
    println("Please enter your age")
    val age = scanner.nextInt()
    print("Hi dear $name. You are $age years old and are considered as ")
    when (age) {
        in 0..12 -> println("a child.")
        in 13..19 -> println("an adolescent.")
        in 20..39 -> println("a young adult.")
        in 40..64 -> println("an adult.")
        else -> println("a senior.")
    }
}

fun task6() {
    fun division(dividend: Double, divisor: Double): Double {
        if (divisor == 0.0) {
            throw ArithmeticException("Division by zero is not allowed.")
        } else {
            return dividend / divisor
        }
    }
    println(division(10.0, 2.0))
    println(division(10.0, 0.0))
}

@RequiresApi(Build.VERSION_CODES.O)
fun task7() {
    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formatted = current.format(formatter)
    println("Current Date and Time is: $formatted")
}

fun task8() {
    val person1 = Person("Sara", 17)
}

fun task9() {
    val person2 = Person("Anne", 21)
    println("You are a " + person2.defineLifeStage() + ".")
}

fun task10() {
    var intList = listOf(1, 5, 6, 8, 15, 20, 14, 7)
    intList = intList.filter { it % 2 == 0 }
    println("Only even elements of a list: ${intList.joinToString()}")
}
