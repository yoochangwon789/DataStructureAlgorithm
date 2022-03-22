package com.yoochangwonspro.datastructurealgorithm.chapter04

import java.util.*
import kotlin.jvm.JvmStatic

object IntStackTesterKotlin {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        val s = IntStack(64) // 최대 64개를 푸시할 수 있는 스택
        while (true) {
            println("현재 데이터 수：" + s.size() + " / "
                    + s.capacity())
            print("(1)푸시　(2)팝　(3)피크　" +
                    "(4)덤프　(0)종료：")
            val menu = stdIn.nextInt()
            if (menu == 0) break
            var x: Int
            when (menu) {
                1 -> {
                    print("데이터：")
                    x = stdIn.nextInt()
                    try {
                        s.push(x)
                    } catch (e: IntStack.OverflowIntStackException) {
                        println("스택이 가득 찼습니다.")
                    }
                }
                2 -> try {
                    x = s.pop()
                    println("팝한 데이터는 " + x + "입니다.")
                } catch (e: IntStack.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
                3 -> try {
                    x = s.peek()
                    println("피크한 데이터는 " + x + "입니다.")
                } catch (e: IntStack.EmptyIntStackException) {
                    println("스택이 비어 있습니다.")
                }
                4 -> s.dump()
            }
        }
    }
}