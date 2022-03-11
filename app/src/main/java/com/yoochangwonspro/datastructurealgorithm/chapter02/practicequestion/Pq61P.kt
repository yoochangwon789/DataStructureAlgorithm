package com.yoochangwonspro.datastructurealgorithm.chapter02.practicequestion

fun selectSwap(a: Array<Int>, first: Int, last: Int) {
    val swap = a[first]
    a[first] = a[last]
    a[last] = swap
}

fun selectReverse(a: Array<Int>) {
    var changeArray = a

    for (i in 0 until a.size / 2) {
        for (j in a.indices) {
            print("${changeArray[j]} ")
        }

        println()

        println("a[$i]과(와) a[${a.size - i - 1}]를 교환합니다.")
        selectSwap(changeArray, i, a.size - i - 1)
        changeArray = a

        if (i == a.size / 2 - 1) {
            for (j in a.indices) {
                print("${changeArray[j]} ")
            }
            println()
            println("역순 정렬을 마쳤습니다.")
        }
    }
}

fun q3(a: Array<Int>): Int {
    var sum = 0

    if (a.size % 2 == 1) {
        for (i in 0 until a.size / 2) {
            sum += a[i] + a[a.size - i - 1]
        }
        sum += a[a.size / 2]
    } else {
        for (i in 0 until a.size / 2) {
            sum += a[i] + a[a.size - i - 1]
        }
    }

    return sum
}

fun main(array: Array<String>) {
    val x = arrayOf(1,2,3,4,5,6)
//    selectReverse(x)

    print(q3(x))
}