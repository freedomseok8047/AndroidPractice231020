package com.example.myapp_test6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityMainBinding
lateinit var binding:ActivityMainBinding
class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_join)
    }
}