package com.example.customizedalertbox

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Create a variable of type dialogue
    lateinit var dialogue : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.btnClick)


        dialogue = Dialog(this)
        dialogue.setContentView(R.layout.custom_dialogue)
        // dialogue.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        // creating variable for the custom dialogue.xml design

        var buttonGood = dialogue.findViewById<Button>(R.id.btnGood)
        var feedbackButton = dialogue.findViewById<Button>(R.id.btnGood2)

        buttonGood.setOnClickListener {
            dialogue.dismiss()
        }
        feedbackButton.setOnClickListener {

        }
        myButton.setOnClickListener {
            dialogue.show()
        }
    }
}