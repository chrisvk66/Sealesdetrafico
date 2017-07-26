package com.signals.traffic.sealesdetrafico

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

/**
 * Created by David M on 26/07/2017.
 */
class Test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        val test_img = findViewById<ImageView>(R.id.test_img)
        val resp1 = findViewById<Button>(R.id.resp1)
        val resp2 = findViewById<Button>(R.id.resp2)
        val resp3 = findViewById<Button>(R.id.resp3)

        val img = listOf(R.drawable.danger1, R.drawable.danger2, R.drawable.danger3)
        val resp = listOf(getString(R.string.danger1), getString(R.string.danger2), getString(R.string.danger3))

        val imagenes = mutableSetOf<Int>()
        val respuestas = mutableSetOf<String>()

        while (imagenes.size < 3) {
            val random = (Math.random() * img.size).toInt()

            val r = resp[random]
            val r2 = img[random]

            respuestas.add(r)
            imagenes.add(r2)
        }


        val aleatorio = (Math.random() * img.size).toInt()
        test_img.setImageResource(imagenes.elementAt(aleatorio))
        resp1.text = respuestas.elementAt(0)
        resp2.text = respuestas.elementAt(1)
        resp3.text = respuestas.elementAt(2)

        resp1.setOnClickListener { comprobar_resp1(aleatorio, resp1, resp2, resp3) }

        resp2.setOnClickListener { comprobar_resp2(aleatorio, resp1, resp2, resp3) }

        resp3.setOnClickListener { comprobar_resp3(aleatorio, resp1, resp2, resp3) }


    }//OnCreate

    fun comprobar_resp1(num: Int, resp1: Button, resp2: Button, resp3: Button) {
        if (num == 0) {

            resp1.setBackgroundColor(Color.GREEN)
            resp2.isEnabled = false
            resp3.isEnabled = false
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

        } else if (num == 1) {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.GREEN)
            resp3.setBackgroundColor(Color.RED)

            resp1.isEnabled = false
            resp3.isEnabled = false

        } else {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.GREEN)

            resp1.isEnabled = false
            resp2.isEnabled = false
        }
    }

    fun comprobar_resp2(num: Int, resp1: Button, resp2: Button, resp3: Button) {
        if (num == 1) {

            resp2.setBackgroundColor(Color.GREEN)
            resp1.isEnabled = false
            resp3.isEnabled = false
            Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

        } else if (num == 0) {
            resp1.setBackgroundColor(Color.GREEN)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.RED)

            resp2.isEnabled = false
            resp3.isEnabled = false

        } else {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.GREEN)

            resp1.isEnabled = false
            resp2.isEnabled = false
        }
    }


    fun comprobar_resp3(num: Int, resp1: Button, resp2: Button, resp3: Button) {
            if (num == 2) {

                resp3.setBackgroundColor(Color.GREEN)
                resp1.isEnabled = false
                resp2.isEnabled = false
                Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

            } else if (num == 0) {
                resp1.setBackgroundColor(Color.GREEN)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.RED)

                resp2.isEnabled = false
                resp3.isEnabled = false

            } else {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.GREEN)
                resp3.setBackgroundColor(Color.RED)

                resp1.isEnabled = false
                resp3.isEnabled = false
            }
    }
}

