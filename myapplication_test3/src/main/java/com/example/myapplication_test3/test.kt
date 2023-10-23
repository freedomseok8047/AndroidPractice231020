package com.example.myapplication_test3

class test {

}

// 함수 밖, 최상위 영역(전역)
val test1 = "test";
val test2 = null;

//val test5:String;
//val test6:String;

// 결론, IDE를 사용하는 이유? 작업의 편의성, 생산성 향상
// 그래서, 기본 문법에 너무 외워서 다 맞춰서 작업할 필요가 없음 -> 1차 문법 체크
// IDE에 맡기는 것을 추천
// 자동 완성등 벤치 마킹 적극 활용

val data1 : Int by lazy {
    println("순서 3) in lazy")
    10
}

//fun main(){
//
//    println("순서 1) main 먼저 실행")
//    println("순서 2) lazy 호출 확인 : " + data1)
//
//
//    // 함수 내부 (지역)
//    val test3:String;
//    val test4:String;
//    // var 변수 , val 상수,
//    // ex) var 변수명 : 타입 = 값;
//    // 기본은 변경이 되지 않은 상수를 주로 사용을 하되, 만약 변경이 되는 부분이면 var 쓰면 됨
//    // 코들린에서는 모든 타입이 , 객체(참조형) -> 알아서 타입 지정
//    // 자바는 : 기본(형) 타입 8가지, 그외 형(참조형)
//    var name = "ljs";
//    var name2 : String = "ljs2"
//    var age : Int = 20;
//    var age2 = 21;
//    println("이름 : " + name )
//    println("Hello Android by Kotlin")
//}



// 자바, 모양
// 일반 함수와는 다란것이, 매개변수 자리에 함수타입이 들어가고, 반환형 타입에도 함수형 타입이 들어감

fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}
fun main() {
    val result = hofFun({no -> no > 0})
    println(result())
}
