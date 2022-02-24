package com.example.birthdayapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun createWish(view: View) {


        val name = name.editableText.toString()
        //Toast.makeText(this,"happy anniversary $name ",Toast.LENGTH_LONG).show()
        val intent=Intent(this,Greetingpage::class.java)
       intent.putExtra(Greetingpage.Name_Extra,name)
        startActivity(intent)

    }
}