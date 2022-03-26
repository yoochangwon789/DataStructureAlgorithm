package com.yoochangwonspro.datastructurealgorithm.chapter04.practicequestion

import com.yoochangwonspro.datastructurealgorithm.chapter04.IntArrayQueue
import java.util.*
import kotlin.jvm.JvmStatic

internal object IntQueueTester {
    @JvmStatic
    fun main(args: Array<String>) {
        val stdIn = Scanner(System.`in`)
        val s = IntArrayQueue(64) // 최대 64개를 인큐할 수 있는 큐
        while (true) {
            System.out.println("현재 데이터 수：" + s.size().toString() + " / "
                    + s.capacity())
            print("(1)인큐　(2)디큐　(3)피크　" +
                    "(4)덤프　(0)종료：")
            val menu = stdIn.nextInt()
            if (menu == 0) break
            var x: Int
            when (menu) {
                1 -> {
                    print("데이터：")
                    x = stdIn.nextInt()
                    try {
                        s.enque(x)
                    } catch (e: IntArrayQueue.OverflowIntQueueException) {
                        println("큐가 가득 찼습니다.")
                    }
                }
                2 -> try {
                    x = s.deque()
                    println("디큐한 데이터는 " + x + "입니다.")
                } catch (e: IntArrayQueue.EmptyIntQueueException) {
                    println("큐가 비어 있습니다.")
                }
                3 -> try {
                    x = s.peek()
                    println("피크한 데이터는 " + x + "입니다.")
                } catch (e: IntArrayQueue.EmptyIntQueueException) {
                    println("큐가 비어 있습니다.")
                }
                4 -> s.dump()
            }
        }
    }
}