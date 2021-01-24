package com.example.assign5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val erroradd = Toast.makeText(applicationContext,"Can't add the more value", Toast.LENGTH_LONG)
        val errorminus = Toast.makeText(applicationContext,"Can't minus more", Toast.LENGTH_LONG)
        val resets = Toast.makeText(applicationContext,"The number has been reset.", Toast.LENGTH_LONG)
        var pressnum = 0

        add.setOnClickListener() {
            if (pressnum > 0 && pressnum < 9) {
                pressnum++
                var add = findViewById<TextView>(R.id.add)
                add.setText("$pressnum")
            } else {
                erroradd.show()
            }
        }

        minus.setOnClickListener() {
            if (pressnum < 0 && pressnum > 9) {
                pressnum--
                var minus = findViewById<TextView>(R.id.minus)
                minus.setText("$pressnum")
            } else {
                errorminus.show()
            }
        }

        reset.setOnClickListener(){
                pressnum = 0
                var reset = findViewById<TextView>(R.id.reset)
                reset.setText("$pressnum")
                resets.show()
        }
    }
}