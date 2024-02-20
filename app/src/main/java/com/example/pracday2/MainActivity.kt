package com.example.pracday2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val order=findViewById<TextView>(R.id.finalorder)
        val meat= findViewById<RadioGroup>(R.id.rgmeat)
        val cheese=findViewById<RadioGroup>(R.id.rgcheese)
        val salad=findViewById<RadioGroup>(R.id.rgsalad)
        val sauces=findViewById<RadioGroup>(R.id.rgsauces)
        val btnorder = findViewById<Button>(R.id.button)
        btnorder.setOnClickListener {
            val meatchkd=meat.checkedRadioButtonId
            val b= findViewById<RadioButton>(meatchkd)
            val cheesechkd=cheese.checkedRadioButtonId
            val ch= findViewById<RadioButton>(cheesechkd)
            val saladchkd=salad.checkedRadioButtonId
            val sld= findViewById<RadioButton>(saladchkd)
            val sauceschkd=sauces.checkedRadioButtonId
            val sauce= findViewById<RadioButton>(sauceschkd)
            val fnlordr="You ordered a burger with: \n ${b.text}\n ${ch.text}\n ${sld.text}\n ${sauce.text}\n "
            order.text=fnlordr


        }

    }
}