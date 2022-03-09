package com.yoochangwonspro.datastructurealgorithm.chapter01.practicequestion

// 왼쪽 아래가 직각인 이등변삼각형
fun q15(a: Int) {

    for (i in 1..a) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}

// 왼쪽 위가 직각인 이등변 삼각형을 출력
fun q15_1(a: Int) {
    for (i in 1..a) {
        for (j in a downTo i) {
            print("*")
        }
        println()
    }
}

// 오른쪽 위가 직각인 이등변 삼각형을 출력
fun q15_2(a: Int) {
    for (i in 1..a) {
        if (i >= 2) {
            for (j in 2..i) {
                print(" ")
            }
        }

        for (j in i..a) {
            print("*")
        }
        println()
    }
}

// 오른쪽 아래가 직각인 이등변 삼각형을 출력
fun q15_3(a: Int) {
    var cnt = 1
    for (i in a downTo 1) {
        if (i >= 2) {
            for (j in i downTo 2) {
                print(" ")
            }
        }

        for (j in 1..cnt) {
            print("*")
        }
        cnt++
        println()
    }
}

fun main(array: Array<String>) {

    q15_3(10)
}