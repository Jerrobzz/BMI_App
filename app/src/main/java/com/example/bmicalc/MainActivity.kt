package com.example.bmicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var display_text:TextView
    lateinit var edtnum_1:EditText
    lateinit var edtnum_2:EditText
    lateinit var bmi_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_text = findViewById(R.id.textview)
        edtnum_1 = findViewById(R.id.edweight)
        edtnum_2 = findViewById(R.id.edheight)
        bmi_btn = findViewById(R.id.btn_bmi)

        bmi_btn.setOnClickListener {
            var weight = edtnum_1.text.toString().trim()
            var height = edtnum_2.text.toString().trim()

            var userweight = weight.toDouble()
            var userheight = height.toDouble()

            //calculations
            var result =  userweight / (userheight * userheight)

            var finalresult = result.toString()

            //display answer in textview
            display_text.setText(finalresult)

        }
    }
}