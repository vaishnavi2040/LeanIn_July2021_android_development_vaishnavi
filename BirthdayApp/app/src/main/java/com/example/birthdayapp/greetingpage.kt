package com.example.birthdayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Greetingpage : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_Greetingpage)

        val name=intent.getStringExtra(Name_Extra)

        hello.setText  =" Happy Anniversary $name"
    }
}