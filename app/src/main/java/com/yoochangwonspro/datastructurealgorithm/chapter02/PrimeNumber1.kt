package com.yoochangwonspro.datastructurealgorithm.chapter02

fun main(args: Array<String>) {
    var count = 0
    for (n in 2..50) {
        var i = 2
        while (i < n) {
            count++
            if (n % i == 0) break
            i++
        }
        if (n == i) {
            println(n)
        }
    }
    println("나숫셈을 수행한 횟수 : $count")
}