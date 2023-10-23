package com.example.ExTest0221

class Test231023 constructor(val name :String, val age: Int , val email : String){

    constructor(name :String, age: Int, email : String, password : String) : this(name,age,email)

    var name3 : String = "이준석"
    var email3 : String = "ljs@naver.com"

    // 초기화를 미루겠다. 결론, 사용하는 시점에 초기화 함
    lateinit var name2 : String
    var email2 : String ="클래스 내부에서 선언만 안됨. 예외는 lateinit"

    val data4 : Int by lazy {
        println("by lazy  사용, 뒤늦게 초기화")
        30
    }

    val data5 : Array<String> = Array(3, {"기본값"} )


}

open class SuperClass(val name:String, val email:String) {

    fun sayHello(){
        println("클래스의 맴버 이름과 이메일 출력하기 :  ${name}, ${email}")
    }

}

class SubClass : SuperClass("이준석", "ljs@naver.com") {
    val password: String = "1234"

    fun printPassword(){
        println("password : ${password}")
    }

}


fun main(){


    val test33 = SubClass();
    test33.printPassword()
    test33.sayHello()


    val test1 : Test231023 = Test231023("이준석", 27, "ljs@naver.com","1234")
    println("비 데이터 클래스 toString goqhrl (의미없는 메모리 주소값 표기):" + test1.toString())

    test1.name2 = "초기값 할당 후 사용"
    val lateInitName =  test1.name2
    println("lateInitName 사용 :" + lateInitName)

    val array_0 = test1.data5.get(0)
    test1.data5.set(0,"이준석 0")
    println("array_0의 값: " + array_0 )

    var mutableList = mutableListOf<Int>(10,20,30)

    for (i in mutableList.indices){
        println("리스트 가져오기 :${mutableList.get(i)}")
    }



    val data4_2 =test1.data4
    println("data4_2:" + data4_2)
    println("data4_2: 문자열 내부에서 특정 변수값 사용 : ${data4_2}" )


    val test2 : User = User("이준석", "ljs@naver.com","1234")
    println("데이터 클래스 toString goqhrl (실제값 표기):" + test2.toString())
}










