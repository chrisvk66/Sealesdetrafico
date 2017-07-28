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

    fun works(view:View){
        startActivity(Intent(this, Signals_works::class.java))
    }

    fun prohibition(view:View){
        startActivity(Intent(this, Signals_prohibition::class.java))
    }

    fun orientation(view:View){
        startActivity(Intent(this, Signals_orientation::class.java))
    }

    fun service(view:View){
        startActivity(Intent(this, Signals_service::class.java))
    }

    fun obligation(view:View){
        startActivity(Intent(this, Signals_obligation::class.java))
    }
}
