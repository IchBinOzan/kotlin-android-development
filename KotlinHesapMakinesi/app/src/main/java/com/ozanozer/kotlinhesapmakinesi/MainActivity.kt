package com.ozanozer.kotlinhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View){
        var a : Int = editTextNumber.text.toString().toInt()
        var b : Int = editTextNumber2.text.toString().toInt()
        var sonuc : Int = a + b
        textView.text = "Sonuc: ${sonuc}"
    }
    fun cikar(view: View){
        var a : Int = editTextNumber.text.toString().toInt()
        var b : Int = editTextNumber2.text.toString().toInt()
        var sonuc : Int = a - b
        textView.text = "Sonuc: ${sonuc}"
    }
    fun bol(view: View){
        var a : Int = editTextNumber.text.toString().toInt()
        var b : Int = editTextNumber2.text.toString().toInt()
        var sonuc : Int = a / b
        textView.text = "Sonuc: ${sonuc}"
    }
    fun carp(view: View){
        var a : Int = editTextNumber.text.toString().toInt()
        var b : Int = editTextNumber2.text.toString().toInt()
        var sonuc : Int = a * b
        textView.text = "Sonuc: ${sonuc}"
    }

}