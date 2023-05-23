package com.example.schoolapp

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import com.example.schoolapp.MainActivity2
import com.example.schoolapp.R
import kotlin.arrayOf as kotlinArrayOf

class MainActivity : AppCompatActivity() {
    lateinit var but: Button
    lateinit var img: ImageView
    val classes = kotlinArrayOf("5","6","7","8", "9","10","11")
    val days = kotlinArrayOf("понедельник", "вторник","среда","четверг","пятница","суббота")
    val words = kotlinArrayOf("А","Аш","Б","Л","Э")
    lateinit var spinner:Spinner
    lateinit var spin:Spinner
    var class_num=""
    var class_num1=""
    var day=""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but = findViewById(R.id.button2)
        spin = findViewById(R.id.spinner3)
        spinner = findViewById(R.id.spinner2)
        val arrayAdapter = ArrayAdapter<String>(this, R.layout.text, classes)
        arrayAdapter.setDropDownViewResource(R.layout.text)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                class_num=classes[p2]

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        val spinners = findViewById<Spinner>(R.id.spinner)
        val arrayAdaptera = ArrayAdapter<String>(this, R.layout.text, words)
        spinners.adapter = arrayAdaptera
        spinners.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                class_num1=words[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val arrayAdaptr = ArrayAdapter<String>(this, R.layout.text, days)
        arrayAdapter.setDropDownViewResource(R.layout.text)
        spin.adapter = arrayAdaptr
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                day=days[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        but.setOnClickListener {
            val i=Intent(this, MainActivity2::class.java)
            i.putExtra("one",class_num)
            i.putExtra("two",class_num1)
            i.putExtra("day1", day)
            //i.putExtra(MainActivity2.TOTAL_COUNT1,class_num1)
            startActivity(i)
        }

    }




}





