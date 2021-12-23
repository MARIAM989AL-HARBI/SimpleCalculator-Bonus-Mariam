package com.example.simplecalculatorbonus_mariam

import android.graphics.Insets.add
import android.graphics.Insets.subtract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener() {
            add()
        }
        btn_sub.setOnClickListener() {
            subtract()
        }

        btn_g.setOnClickListener() {
            divide()
        }
        btn_mutb.setOnClickListener() {
            multiply()
        }

    }


    fun add() {
        if (inputNOEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit1.text.toString().trim().toBigDecimal()
            RE.text = input1.add(input2).toString()
        }
    }


    fun subtract() {
        if (inputNOEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit1.text.toString().trim().toBigDecimal()
            RE.text = input1.subtract(input2).toString()
        }
    }

    fun multiply() {
        if (inputNOEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit1.text.toString().trim().toBigDecimal()
            RE.text = input1.multiply(input2).toString()
        }
    }

    fun divide() {
        if (inputNOEmpty()) {
            val input1 = edit1.text.toString().trim().toBigDecimal()
            val input2 = edit1.text.toString().trim().toBigDecimal()
            if (input2.compareTo(BigDecimal.ZERO) == 0) {
                edit2.error = "intt"
            } else {
                RE.text = input1.divide(input2, 2, RoundingMode.HALF_UP).toString()
            }
        }
    }
        fun inputNOEmpty(): Boolean {
            var b = true
            if (edit1.text.toString().trim().isEmpty()) {
                edit1.error = "Required"
                b = false
            }
            if (edit2.text.toString().trim().isEmpty()) {
                edit2.error = "Required"
                b = false
            }
            return b
        }

    }

