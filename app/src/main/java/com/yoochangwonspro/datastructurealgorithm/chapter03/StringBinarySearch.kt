package com.yoochangwonspro.datastructurealgorithm.chapter03

import java.util.*

// 문자열 배열에서의 검색
fun main(array: Array<String>) {
    val input = Scanner(System.`in`)

    val x = arrayOf(
        "abstract",   "assert",       "boolean",   "break",      "byte",
        "case",       "catch",        "char",      "class",      "const",
        "continue",   "default",      "do",        "double",     "else",
        "enum",       "extends",      "final",     "finally",    "float",
        "for",        "goto",         "if",        "implements", "import",
        "instanceof", "int",          "interface", "long",       "native",
        "new",        "package",      "private",   "protected",  "public",
        "return",     "short",        "static",    "strictfp",   "super",
        "switch",     "synchronized", "this",      "throw",      "throws",
        "transient",  "try",          "void",      "volatile",   "while")

    print("원하는 키워드를 입력하세요 : ")
    val key = input.next()

    val idx = Arrays.binarySearch(x, key)

    if (idx < 0) println("해당 키워드가 없습니다.")
    else println("해당 키워드는 x[$idx]에 있습니다.")
}