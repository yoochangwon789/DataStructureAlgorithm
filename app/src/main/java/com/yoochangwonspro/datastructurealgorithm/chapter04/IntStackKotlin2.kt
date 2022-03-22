package com.yoochangwonspro.datastructurealgorithm.chapter04

import java.util.*

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)
    val s = IntStackKotlin(64)

    while (true) {
        println("현재 데이터 수 : ${s.size()} / ${s.capacity()}")
        print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ")
        val menu = input.nextInt()

        if (menu == 0) break

        var x: Int
        when (menu) {
            1 -> {
                // 푸쉬
                print("데이터 : ")
                x = input.nextInt()
                try {
                    s.push(x)
                } catch (e : IntStackKotlin.OverflowIntStackException) {
                    println("스택이 가득 찼습니다.")
                }
            }
            2 -> {
                // 팝
                try {
                    x = s.pop()
                    print("팝한 데이터는 $x 입니다.")
                } catch (e: IntStackKotlin.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
            }
            3 -> try {
                x = s.peek()
                println("피크한 데이터는 $x 입니다.")
            } catch (e: IntStackKotlin.EmptyIntStackException) {
                println("스택이 비어 있습니다.")
            }
            4 -> s.dump()
        }
    }
}
