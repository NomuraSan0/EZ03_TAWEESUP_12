package com.example.zalo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pn1: EditText = findViewById(R.id.pn1)
        val pn2: EditText = findViewById(R.id.pn2)
        val pn3: TextView = findViewById(R.id.pn3)
        val muti: TextView = findViewById(R.id.muti)
        val plus: Button = findViewById(R.id.plus)
        val minus: Button = findViewById(R.id.minus)
        val multiply: Button = findViewById(R.id.multiply)
        val divder: Button = findViewById(R.id.divder)
        val modulo: Button = findViewById(R.id.modulo)
        val clear: Button = findViewById(R.id.clear)

        clear.setOnClickListener {
            pn1.setText(" ")
            pn2.setText(" ")
            pn3.setText(" ")
            muti.setText(" ")
        }
        plus.setOnClickListener {
            var num1 = pn1.text.toString()
            var num2 = pn2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() + num2.toInt()
                pn3.text = result.toString()
                muti.setText("+")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        minus.setOnClickListener {
            var num1 = pn1.text.toString()
            var num2 = pn2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() - num2.toInt()
                pn3.text = result.toString()
                muti.setText("-")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        multiply.setOnClickListener {
            var num1 = pn1.text.toString()
            var num2 = pn2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() * num2.toInt()
                pn3.text = result.toString()
                muti.setText("X")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        divder.setOnClickListener {
            var num1 = pn1.text.toString()
            var num2 = pn2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() / num2.toInt()
                pn3.text = result.toString()
                muti.setText("/")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
        modulo.setOnClickListener {
            var num1 = pn1.text.toString()
            var num2 = pn2.text.toString()

            if (num1 != "" && num2 != "") {
                var result = num1.toInt() % num2.toInt()
                pn3.text = result.toString()
                muti.setText("%")
            } else {
                Toast.makeText(applicationContext, "ใส่ให้ครบดิ", Toast.LENGTH_SHORT).show()
            }
        }
    }

    }

