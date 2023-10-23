package com.example.ExTest0221

import java.util.Scanner

object ScannerTest {
    @JvmStatic
    fun main(args: Array<String>) {

        val scanner = Scanner(System.`in`)
        println("ID:")
        // 문자열 읽기.
        val id = scanner.nextLine()
        println("PW:")
        val pw = scanner.nextLine()
        println("Email:")
        val email = scanner.nextLine()
        println("Phone:")
        val phone = scanner.nextLine()

        println(id)
        println(pw)
        println(email)
        println(phone)
    }
}