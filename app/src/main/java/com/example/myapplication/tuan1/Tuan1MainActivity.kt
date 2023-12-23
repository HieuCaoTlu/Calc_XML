package com.example.myapplication.tuan1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class Tuan1MainActivity : AppCompatActivity() {
    // khai báo các luồng điều khiển
    var text1:EditText? = null
    var text2:EditText? = null
    var btnCalc:Button? = null
    var result:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan1_main)

        supportActionBar?.hide()
        // ánh xạ
        text1 = findViewById(R.id.Input1)
        text2 = findViewById(R.id.Input2)
        btnCalc = findViewById(R.id.Calc)
        result = findViewById(R.id.Result)

        // xử lí sự kiện
        btnCalc!!.setOnClickListener(View.OnClickListener {
            tinhtong()


        })
    }

    private fun tinhtong() {
        // lấy dữ liệu được nhập vào từ EditText
        val str1 = text1!!.text.toString()
        val str2 = text2!!.text.toString()

        // Chuyển dữ liệu sang kiểu số
        val so1 = str1.toFloat()
        val so2 = str2.toFloat()

        // Tính kt quả
        val tong = so1 + so2
        result!!.text = tong.toString()


    }
}