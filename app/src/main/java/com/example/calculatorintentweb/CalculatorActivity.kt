package com.example.calculatorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_Add.setOnClickListener {

//        receive entered data from the user
            var firstnumber = editTextNumber3.text.toString()
            var secondnumber = editTextNumber4.text.toString()

//        checking entered data
            if (firstnumber.isEmpty() or secondnumber.isEmpty()){
                textView2.text = "Please fill in all the details"
            } else {
                var answer = firstnumber.toDouble() + secondnumber.toDouble()
                textView2.text = answer.toString()
            }
        }

        btn_Sub.setOnClickListener {

//        receive entered data from the user
            var firstnumber = editTextNumber3.text.toString()
            var secondnumber = editTextNumber4.text.toString()

//        checking entered data
            if (firstnumber.isEmpty() or secondnumber.isEmpty()){
                textView2.text = "Please fill in all the details"
            } else {
                var answer = firstnumber.toDouble() - secondnumber.toDouble()
                textView2.text = answer.toString()
            }
        }

//        receive entered data from the user
        var firstnumber = editTextNumber3.text.toString()
        var secondnumber = editTextNumber4.text.toString()

//        checking entered data
        if (firstnumber.isEmpty() or secondnumber.isEmpty()){
            textView2.text = "Please fill in all the details"
        } else {
            var answer = firstnumber.toDouble() + secondnumber.toDouble()
            textView2.text = answer.toString()
        }
        btn_Mul.setOnClickListener {

//        receive entered data from the user
            var firstnumber = editTextNumber3.text.toString()
            var secondnumber = editTextNumber4.text.toString()

//        checking entered data
            if (firstnumber.isEmpty() or secondnumber.isEmpty()){
                textView2.text = "Please fill in all the details"
            } else {
                var answer = firstnumber.toDouble() * secondnumber.toDouble()
                textView2.text = answer.toString()
            }
        }
        btn_Div.setOnClickListener {

//        receive entered data from the user
            var firstnumber = editTextNumber3.text.toString()
            var secondnumber = editTextNumber4.text.toString()

//        checking entered data
            if (firstnumber.isEmpty() or secondnumber.isEmpty()){
                textView2.text = "Please fill in all the details"
            } else {
                var answer = firstnumber.toDouble() / secondnumber.toDouble()
                textView2.text = answer.toString()
            }
        }


    }
}