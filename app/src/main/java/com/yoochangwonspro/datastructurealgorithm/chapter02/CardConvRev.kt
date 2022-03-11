package com.yoochangwonspro.datastructurealgorithm.chapter02

fun cardConvRev(x: Int, r: Int, d: MutableList<Char> = mutableListOf()) {
    var digits = 0
    val dChar = "0123456789ABCDEFGHIJKLNMOPQRSTUVWXYZ"
    var x2 = x

    do {
        d.add(dChar[x2 % r])
        digits++
        x2 /= r
    } while (x2 != 0)

    println(d)
    println(digits)
}

fun main(array: Array<String>) {
    cardConvRev(59, 32)
}