package com.example.myapplication_test3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 액티비티, 시스템 클래스, 컴포넌트 클래스,
// 일반 클래스와 차이점은, 어느 클래스 상속을 받는 지 여부에 따라 결정 됨.
// 예) 자식 : 부모 -> java - 자식 extends 부모
// 부모 클래스는 선언할때 open으로 열어줘야 함


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}