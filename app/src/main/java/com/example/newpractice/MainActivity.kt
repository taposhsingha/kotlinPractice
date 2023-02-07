package com.example.newpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MYTAG","MainActivity : OnCreate")
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val offers = findViewById<Button>(R.id.button2)
        var enteredName=""
        button.setOnClickListener {
            enteredName = editText.text.toString()
            if(enteredName == ""){
                offers.visibility = INVISIBLE
                textView.text=""
                Toast.makeText(this@MainActivity,
                "Please, enter your name!",
                Toast.LENGTH_SHORT).show()
            }
            else{
                val message = "Welcome $enteredName"
                Log.i("MYTAG",message)
                textView.text = message
                Log.i("MYTAG","after displaying the message on the textview")
                editText.text.clear()
                offers.visibility = VISIBLE
            }
        }
        offers.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity : Onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity : OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity : OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity : OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity : OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity : OnRestart")
    }
}