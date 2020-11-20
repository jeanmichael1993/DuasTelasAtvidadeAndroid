package com.example.duastelas

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun navegar(view: View) {
        var valor = valor1.text.toString()
        val i = Intent(this, Main3Activity::class.java)
        i.putExtra("nome", valor)
        startActivity(i)

       val sharedPreferences = getSharedPreferences("SP_INFO", Context.MODE_PRIVATE)
        val valor3 = valor2.text.toString()
        val editor = sharedPreferences.edit()
        editor.putString("valor2",valor3)
        editor.apply()
    }
}