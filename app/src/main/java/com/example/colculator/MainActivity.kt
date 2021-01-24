package com.example.colculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: EditText = findViewById(R.id.editText1)
        var num2: EditText = findViewById(R.id.editText2)
        var result: TextView = findViewById(R.id.Result)
        var btnSl: Button = findViewById(R.id.btnSl)
        var btnOt: Button = findViewById(R.id.btnOt)
        var btnUm: Button = findViewById(R.id.btnUm)
        var btnDe: Button = findViewById(R.id.btnDe)

        btnSl.setOnClickListener {
            var n1 = num1.text.toString().toDouble()
            var n2 = num2.text.toString().toDouble()
            var sum = n1 + n2
            result.text = sum.toString()
        }
        btnOt.setOnClickListener {
            var n1 = num1.text.toString().toDouble()
            var n2 = num2.text.toString().toDouble()
            var sum = n1 - n2
            result.text = sum.toString()

        }
        btnUm.setOnClickListener {
            var n1 = num1.text.toString().toDouble()
            var n2 = num2.text.toString().toDouble()
            var sum = n1 * n2
            result.text = sum.toString()
        }
        btnDe.setOnClickListener {
            var n1 = num1.text.toString().toDouble()
            var n2 = num2.text.toString().toDouble()
            var sum = n1 / n2
            result.text = sum.toString()
        }
    }

}


