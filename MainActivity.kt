package com.example.latihan1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textCounter : TextView
    private lateinit var buttonPlus : Button
    private lateinit var buttonMines : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textCounter = findViewById(R.id.textCounter)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMines = findViewById(R.id.buttonMines)

        var timesClicked = 0

        buttonPlus.setOnClickListener {

            timesClicked += 1

            textCounter.text = timesClicked.toString()
        }
        buttonMines.setOnClickListener {

            timesClicked -= 1

            textCounter.text = timesClicked.toString()
        }
    }
}
