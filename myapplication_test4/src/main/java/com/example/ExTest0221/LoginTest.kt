package com.example.ExTest0221

class LoginTest {

    companion object{
        fun LoginLogic(member: Member){
            if(member.name.equals("admin") && member.password.equals("1234") ){
                println("로그인 성공")
            }else{
                println("아이디 및 패스워드를 확인해주세요")
            }
        }
    }
}