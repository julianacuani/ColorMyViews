package com.example.colormyviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey
    var boxOneColor = R.color.grey
    var boxTwoColor = R.color.grey
    var boxThreeColor = R.color.grey
    var boxFourColor = R.color.grey
    var boxFiveColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val color = sharedPreferences.getInt("color_box_one", R.color.grey)
        box_one_text.setBackgroundResource(color)

        val color2 = sharedPreferences.getInt("color_box_two", R.color.grey)
        box_two_text.setBackgroundResource(color2)

        val color3 = sharedPreferences.getInt("color_box_three", R.color.grey)
        box_three_text.setBackgroundResource(color3)

        val color4 = sharedPreferences.getInt("color_box_four", R.color.grey)
        box_four_text.setBackgroundResource(color4)

        val color5 = sharedPreferences.getInt("color_box_five", R.color.grey)
        box_five_text.setBackgroundResource(color5)

        setColorButtonsAction()
        setBoxColor()
    }

    override fun onStop(){
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()

        sharedPreferencesEditor.putInt("color_box_one", boxOneColor)
        sharedPreferencesEditor.apply()
        sharedPreferencesEditor.putInt("color_box_two", boxTwoColor)
        sharedPreferencesEditor.apply()
        sharedPreferencesEditor.putInt("color_box_three", boxThreeColor)
        sharedPreferencesEditor.apply()
        sharedPreferencesEditor.putInt("color_box_four", boxFourColor)
        sharedPreferencesEditor.apply()
        sharedPreferencesEditor.putInt("color_box_five", boxFiveColor)
        sharedPreferencesEditor.apply()
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


    private fun setBoxColor() {
        box_one_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxOneColor = currentColor
        }
        box_two_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxTwoColor = currentColor
        }
        box_three_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxThreeColor = currentColor
        }
        box_four_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxFourColor = currentColor
        }
        box_five_text.setOnClickListener{
            it.setBackgroundResource(currentColor)
            boxFiveColor = currentColor
        }

    }

}
