package com.example.myapp_test6

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var imgCheck:String
    lateinit var TAG: String
    lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        imgCheck = "Y"
        TAG= "MainAvtivity"
        //뷰 바인딩 설정 순서2
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        // 뷰 바인딩 설정 순서
        setContentView(R.layout.activity_main)
        // 기본, fingViewById를 이용해서, 로그인 버튼 클릭시, 해당 화면으로 이동하기


        // 버튼으로, 뷰 show/hide 해보기
        val testBtn : Button = findViewById(R.id.testBtn)
        testBtn.setOnClickListener {
            Log.d(TAG,"버튼 클릭시 확인")
            if(imgCheck.equals("Y")){
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.VISIBLE
                imgCheck = "N"
            }else{
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.INVISIBLE
                imgCheck = "Y"
            }
        }

        //클릭시, 이벤트 리스너 이용해서, 해당 화면으로 이동
        val loginBtn: Button = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,Login_Form::class.java)
        }
        // viewBinding 기술을 이용해서, 좀더 쉽게 뷰를 선택하는 방법 이용해서 , 해당 화면으로 이동하기
    }
}