package com.signals.traffic.sealesdetrafico

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
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

        val next=findViewById<Button>(R.id.next)
        next.isEnabled= false

        val test_img = findViewById<ImageView>(R.id.test_img)
        val resp1 = findViewById<Button>(R.id.resp1)
        val resp2 = findViewById<Button>(R.id.resp2)
        val resp3 = findViewById<Button>(R.id.resp3)

        val img = intArrayOf(R.drawable.priority1,R.drawable.priority2,R.drawable.priority3,R.drawable.priority4,R.drawable.priority5,R.drawable.priority6, R.drawable.danger1, R.drawable.danger2, R.drawable.danger3,
                R.drawable.danger4, R.drawable.danger5,R.drawable.danger6, R.drawable.danger7, R.drawable.danger8, R.drawable.danger9, R.drawable.danger10, R.drawable.danger11,R.drawable.danger12,
                R.drawable.danger13, R.drawable.danger14, R.drawable.danger15, R.drawable.danger16, R.drawable.danger17, R.drawable.danger18, R.drawable.danger19, R.drawable.danger20, R.drawable.danger21,
                R.drawable.danger22, R.drawable.danger23, R.drawable.danger24, R.drawable.danger25, R.drawable.danger26, R.drawable.danger26, R.drawable.danger27, R.drawable.danger28, R.drawable.danger29,
                R.drawable.danger30, R.drawable.danger31, R.drawable.danger32,R.drawable.danger33, R.drawable.danger34, R.drawable.danger35, R.drawable.danger36, R.drawable.danger37, R.drawable.danger38,
                R.drawable.danger39, R.drawable.danger40, R.drawable.danger41, R.drawable.danger42, R.drawable.danger43, R.drawable.danger44, R.drawable.danger45, R.drawable.danger46, R.drawable.danger47,
                R.drawable.danger48, R.drawable.danger49, R.drawable.danger50, R.drawable.danger51,R.drawable.works1, R.drawable.works2, R.drawable.works3, R.drawable.works4, R.drawable.works5,R.drawable.works6,
                R.drawable.works7, R.drawable.works8, R.drawable.works9, R.drawable.works10, R.drawable.works11,R.drawable.works12, R.drawable.works13, R.drawable.works14, R.drawable.works15, R.drawable.works16,
                R.drawable.works17, R.drawable.works18, R.drawable.works19, R.drawable.works20, R.drawable.works21,R.drawable.works22, R.drawable.works23, R.drawable.works24, R.drawable.works25, R.drawable.works26,
                R.drawable.works26, R.drawable.works27, R.drawable.works28, R.drawable.works29, R.drawable.works30, R.drawable.works31, R.drawable.works32,R.drawable.works33, R.drawable.works34, R.drawable.works35, R.drawable.works36 )




        val resp = listOf(getString(R.string.priority1), getString(R.string.priority2), getString(R.string.priority3),getString(R.string.priority4),getString(R.string.priority5),getString(R.string.priority6),getString(R.string.danger1),
                getString(R.string.danger2), getString(R.string.danger3),getString(R.string.danger4),getString(R.string.danger5),getString(R.string.danger6),getString(R.string.danger7),getString(R.string.danger8),
                getString(R.string.danger9),getString(R.string.danger10),getString(R.string.danger11),getString(R.string.danger12),getString(R.string.danger13),getString(R.string.danger14),getString(R.string.danger15),getString(R.string.danger16),
                getString(R.string.danger17),getString(R.string.danger18),getString(R.string.danger19),getString(R.string.danger20),getString(R.string.danger21),getString(R.string.danger22),getString(R.string.danger23),getString(R.string.danger24),
                getString(R.string.danger25),getString(R.string.danger26),getString(R.string.danger26),getString(R.string.danger27),getString(R.string.danger28),getString(R.string.danger29),getString(R.string.danger30),getString(R.string.danger31),
                getString(R.string.danger32),getString(R.string.danger33),getString(R.string.danger34),getString(R.string.danger35),getString(R.string.danger36),getString(R.string.danger37),getString(R.string.danger38),getString(R.string.danger39),
                getString(R.string.danger40),getString(R.string.danger41),getString(R.string.danger42),getString(R.string.danger43),getString(R.string.danger44),getString(R.string.danger45),getString(R.string.danger46),getString(R.string.danger47),
                getString(R.string.danger48),getString(R.string.danger49),getString(R.string.danger50),getString(R.string.danger51), getString(R.string.works1),getString(R.string.works2), getString(R.string.works3),getString(R.string.works4),
                getString(R.string.works5),getString(R.string.works6),getString(R.string.works7),getString(R.string.works8),getString(R.string.works9),getString(R.string.works10),getString(R.string.works11),getString(R.string.works12),
                getString(R.string.works13),getString(R.string.works14),getString(R.string.works15),getString(R.string.works16),getString(R.string.works17),getString(R.string.works18),getString(R.string.works19),getString(R.string.works20),
                getString(R.string.works21),getString(R.string.works22),getString(R.string.works23),getString(R.string.works24),getString(R.string.works25),getString(R.string.works26),getString(R.string.works26),getString(R.string.works27),
                getString(R.string.works28),getString(R.string.works29),getString(R.string.works30),getString(R.string.works31), getString(R.string.works32),getString(R.string.works33),getString(R.string.works34),getString(R.string.works35),
                getString(R.string.works36)  )

        val imagenes = mutableSetOf<Int>()
        val respuestas = mutableSetOf<String>()

        while (imagenes.size < 3) {
            val random = (Math.random() * img.size).toInt()

            val r = resp[random]
            val r2 = img[random]

            respuestas.add(r)
            imagenes.add(r2)
        }


        var aleatorio = (Math.random() * 3).toInt()
        test_img.setImageResource(imagenes.elementAt(aleatorio))
        resp1.text = respuestas.elementAt(0)
        resp2.text = respuestas.elementAt(1)
        resp3.text = respuestas.elementAt(2)

        resp1.setOnClickListener { comprobar_resp1(aleatorio, resp1, resp2, resp3, next) }

        resp2.setOnClickListener { comprobar_resp2(aleatorio, resp1, resp2, resp3, next) }

        resp3.setOnClickListener { comprobar_resp3(aleatorio, resp1, resp2, resp3, next) }


        next.setOnClickListener {

            next.isEnabled= false
            resp1.isEnabled = true
            resp2.isEnabled = true
            resp3.isEnabled = true

            resp1.isClickable = true
            resp2.isClickable = true
            resp3.isClickable = true

            resp1.setBackgroundColor(Color.LTGRAY)
            resp2.setBackgroundColor(Color.LTGRAY)
            resp3.setBackgroundColor(Color.LTGRAY)

            imagenes.clear()
            respuestas.clear()

            while (imagenes.size < 3) {
                val random = (Math.random() * img.size).toInt()

                val r = resp[random]
                val r2 = img[random]

                respuestas.add(r)
                imagenes.add(r2)
            }


            var aleatorio2 = (Math.random() * 3).toInt()
            aleatorio = aleatorio2
            test_img.setImageResource(imagenes.elementAt(aleatorio))
            resp1.text = respuestas.elementAt(0)
            resp2.text = respuestas.elementAt(1)
            resp3.text = respuestas.elementAt(2)
        }


    }//OnCreate

    fun comprobar_resp1(num: Int, resp1: Button, resp2: Button, resp3: Button, next:Button) {
        if (num == 0) {

            resp1.setBackgroundColor(Color.GREEN)
            resp1.isClickable = false
            resp2.isEnabled = false
            resp3.isEnabled = false
            next.isEnabled= true
            //Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

        } else if (num == 1) {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.GREEN)
            resp3.setBackgroundColor(Color.RED)

            resp1.isEnabled = false
            resp2.isClickable = false
            resp3.isEnabled = false
            next.isEnabled= true

        } else {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.GREEN)

            resp1.isEnabled = false
            resp2.isEnabled = false
            resp3.isClickable = false
            next.isEnabled= true
        }
    }

    fun comprobar_resp2(num: Int, resp1: Button, resp2: Button, resp3: Button, next:Button) {
        if (num == 1) {

            resp2.setBackgroundColor(Color.GREEN)
            resp1.isEnabled = false
            resp2.isClickable = false
            resp3.isEnabled = false
            next.isEnabled= true
            //Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

        } else if (num == 0) {
            resp1.setBackgroundColor(Color.GREEN)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.RED)

            resp1.isClickable = false
            resp2.isEnabled = false
            resp3.isEnabled = false
            next.isEnabled= true

        } else {
            resp1.setBackgroundColor(Color.RED)
            resp2.setBackgroundColor(Color.RED)
            resp3.setBackgroundColor(Color.GREEN)

            resp1.isEnabled = false
            resp2.isEnabled = false
            resp3.isClickable = false
            next.isEnabled= true
        }
    }


    fun comprobar_resp3(num: Int, resp1: Button, resp2: Button, resp3: Button, next:Button) {
            if (num == 2) {

                resp3.setBackgroundColor(Color.GREEN)
                resp1.isEnabled = false
                resp2.isEnabled = false
                resp3.isClickable = false
                next.isEnabled= true
                //Toast.makeText(this, "¡Correcto!", Toast.LENGTH_SHORT).show()

            } else if (num == 0) {
                resp1.setBackgroundColor(Color.GREEN)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.RED)

                resp1.isClickable = false
                resp2.isEnabled = false
                resp3.isEnabled = false
                next.isEnabled= true

            } else {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.GREEN)
                resp3.setBackgroundColor(Color.RED)

                resp1.isEnabled = false
                resp2.isClickable = false
                resp3.isEnabled = false
                next.isEnabled= true
            }
    }
}

