package com.example.ExTest0221

import java.util.Scanner

class LunchManu {
}
fun main(){
    val scanner: Scanner = Scanner(System.`in`)

    println("점심메뉴를 입력해주세요 : ")
    var lunchMenu = scanner.nextLine()

    println("입력된 런치 메뉴 : ${lunchMenu}")
}