package com.example.duastelas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val i =intent
        val nome = i.getStringExtra("nome")
        campo.text = nome


        val sharedPreferences = getSharedPreferences("SP_INFO", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("valor2","")
        campo2.text = name
    }
}
