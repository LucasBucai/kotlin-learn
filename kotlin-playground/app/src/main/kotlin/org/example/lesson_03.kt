package org.example

fun accessMessage(age: Int): String =
    if (age >= 18) "Puede entrar" else "No puede entrar"

fun main() {
    val access1 = accessMessage(17)
    val access2 = accessMessage(23)
    println(access1)
    println(access2)
}