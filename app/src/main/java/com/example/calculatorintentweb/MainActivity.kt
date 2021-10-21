package com.example.calculatorintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Calc.setOnClickListener {
            val hesabu = Intent(this,CalculatorActivity::class.java)
            startActivity(hesabu)
        }
        btn2_Calc.setOnClickListener {
            val dialshare = Intent(this,IntentActivity::class.java)
            startActivity(dialshare)
        }
        btn3_Calc.setOnClickListener {
            val web = Intent(this,WebActivity::class.java)
            startActivity(web)
        }

    }
}