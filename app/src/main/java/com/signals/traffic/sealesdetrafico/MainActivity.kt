package com.signals.traffic.sealesdetrafico

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttontest = findViewById<Button>(R.id.buttontest)
        buttontest.setOnClickListener { startActivity(Intent(this, Test::class.java)) }

        val buttonsiganls = findViewById<Button>(R.id.buttonsignals)
        buttonsiganls.setOnClickListener { startActivity(Intent(this, Signals::class.java)) }

        val mAdView = findViewById<AdView>(R.id.adView)
        val adRequest = AdRequest.Builder().build()

        mAdView.loadAd(adRequest)
    }

}