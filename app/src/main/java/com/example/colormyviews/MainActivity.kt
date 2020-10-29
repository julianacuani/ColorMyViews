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
        setBoxColor()
    }

    private fun setBoxColor() {
        box_one_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_two_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_three_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_four_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }
        box_five_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
        }

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
