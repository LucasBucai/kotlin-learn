package org.example

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun isAdult(age: Int): Boolean{
    val adultAge = 18 
    if (age >= adultAge) {
        return true
    } else {
        return false
    }
}

// Version corta
fun isAdultShort(age: Int): Boolean = age >= 18

fun welcome(name: String): String = "Bienvenido, $name"

fun main() {
    val plus = sum(2, 4)
    println(plus)
    val isMinor = isAdult(12)
    println(isMinor)
    val isMajor = isAdult(18)
    println(isMajor)
    val messageWelcome = welcome("Lucas")
    println(messageWelcome)
}
