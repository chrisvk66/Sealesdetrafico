package com.signals.traffic.sealesdetrafico

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.gc.materialdesign.views.ButtonRectangle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttontest = findViewById<Button>(R.id.buttontest)
        buttontest.setOnClickListener { Toast.makeText(this,"Proximamente",Toast.LENGTH_SHORT).show() }
    }

    fun activitychange(view: View){

        //val i: Intent = Intent(this, Signals::class.java)
        startActivity(Intent(this, Signals::class.java))
    }
}