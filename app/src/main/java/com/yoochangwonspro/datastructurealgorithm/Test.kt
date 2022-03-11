package com.yoochangwonspro.datastructurealgorithm

var x = 1024

fun isOdd(x: Int): Boolean = x % 2 != 0
fun isEven(x: Int): Boolean = x % 2 == 0

fun main(args: Array<String>) {
    val strS = listOf("a", "bc", "def")
    println(strS.map(String::length))
}