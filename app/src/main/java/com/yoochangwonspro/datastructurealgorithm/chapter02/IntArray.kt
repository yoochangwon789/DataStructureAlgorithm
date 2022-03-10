package com.yoochangwonspro.datastructurealgorithm.chapter02

fun main(array: Array<String>) {

    val a = Array<Int>(5) { i -> i * 100 }
    a[1] = 37
    a[2] = 51
    a[4] = a[1] * 2

//    for (i in a.indices) println("a[$i] = ${a[i]}")
//    println()
//    intArrayInit()

    cloneArray()
}

fun intArrayInit() {
    val a = arrayOf(1,2,3,4,5)

    for (i in a.indices) println("a[$i] = ${a[i]}")
}

fun cloneArray() {
    val a = arrayOf(1,2,3,4,5)
    val b = a.clone()

    b[3] = 0

    print("a = ")
    for (i in a.indices) print("${a[i]}, ")
    println()
    print("b = ")
    for (i in b.indices) print("${b[i]}, ")
}