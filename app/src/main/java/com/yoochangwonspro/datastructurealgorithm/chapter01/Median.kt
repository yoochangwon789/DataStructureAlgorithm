package com.yoochangwonspro.datastructurealgorithm.chapter01

import java.util.*

fun median(a: Int, b: Int, c: Int): Int {
    if (a >= b)
        if (b >= c)
            return b
        else if (a <= c)
            return a
        else
            return c
    else if (a > c)
        return a
    else if (b > c)
        return c
    else
        return b
}

fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    println("세 정수의 중앙값을 구합니다.")
    print("정수 a : ")
    val a = input.nextInt()
    print("정수 b : ")
    val b = input.nextInt()
    print("정수 c : ")
    val c = input.nextInt()
    println("세 정수의 중앙 값은 ${median(a, b, c)} 입니다.")
}

//	연습1-5 해답
//	가장 처음의 if 문의 판단
//	if ((b >= a && c<= a) || (b <= a && c >= a))
//	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
//	else if ((a > b && c < b) || (b <= a && c > b))
//	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if 에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.
