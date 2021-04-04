package com.example.sampleintentservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        val btnStop: Button = findViewById(R.id.btn_stop)
        val textService: TextView = findViewById(R.id.text_service)

        btnStart.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                textService.text = "Service is Running"
            }
        }

        btnStop.setOnClickListener {
            MyIntentService.stopService()
            textService.text = "Service is Stoppped"
        }
    }
}