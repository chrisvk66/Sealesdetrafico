package com.signals.traffic.sealesdetrafico

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class Signals : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signals)
    }

    fun danger(view:View){
        startActivity(Intent(this, Signals_danger::class.java))
    }

    fun priority(view:View){
        startActivity(Intent(this, Signals_priority::class.java))
    }
}
