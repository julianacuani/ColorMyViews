package com.example.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setColorButtonsAction()
    }

    private fun setColorButtonsAction() {
        red_button.setOnClickListener {
            currentColor = R.color.red
        }

        yellow_button.setOnClickListener {
            currentColor = R.color.yellow
        }

        green_button.setOnClickListener {
            currentColor = R.color.green
        }
    }
}
