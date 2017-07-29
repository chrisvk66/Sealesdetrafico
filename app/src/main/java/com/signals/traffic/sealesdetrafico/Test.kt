package com.signals.traffic.sealesdetrafico

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by David M on 26/07/2017.
 */
class Test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        var contador_preguntas:Int=1
        val num_preguntas = findViewById<TextView>(R.id.num_preguntas)

        var aciertos:Int=0
        var fallos:Int=0

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
                R.drawable.works26, R.drawable.works27, R.drawable.works28, R.drawable.works29, R.drawable.works30, R.drawable.works31, R.drawable.works32,R.drawable.works33, R.drawable.works34, R.drawable.works35, R.drawable.works36,
                R.drawable.orientation1, R.drawable.orientation2, R.drawable.orientation3, R.drawable.orientation4, R.drawable.orientation5,R.drawable.orientation6, R.drawable.orientation7, R.drawable.orientation8, R.drawable.orientation9,
                R.drawable.orientation10, R.drawable.orientation11,R.drawable.orientation12, R.drawable.orientation13, R.drawable.orientation14, R.drawable.orientation15, R.drawable.orientation16, R.drawable.orientation17, R.drawable.orientation18,
                R.drawable.orientation19, R.drawable.orientation20, R.drawable.orientation21, R.drawable.orientation22, R.drawable.orientation23, R.drawable.orientation24, R.drawable.orientation25, R.drawable.orientation26, R.drawable.orientation26,
                R.drawable.orientation27, R.drawable.orientation28, R.drawable.orientation29, R.drawable.orientation30, R.drawable.orientation31, R.drawable.orientation32,R.drawable.orientation33, R.drawable.orientation34, R.drawable.orientation35,
                R.drawable.orientation36, R.drawable.orientation37, R.drawable.orientation38, R.drawable.orientation39, R.drawable.orientation40, R.drawable.orientation41, R.drawable.orientation42, R.drawable.orientation43, R.drawable.orientation44,
                R.drawable.orientation45, R.drawable.orientation46, R.drawable.orientation47, R.drawable.orientation48, R.drawable.orientation49, R.drawable.orientation50, R.drawable.orientation51, R.drawable.orientation52, R.drawable.orientation53,
                R.drawable.orientation54,R.drawable.orientation55, R.drawable.orientation56,R.drawable.orientation57, R.drawable.orientation58, R.drawable.orientation59, R.drawable.orientation60, R.drawable.orientation61, R.drawable.orientation62,
                R.drawable.orientation63, R.drawable.orientation64, R.drawable.orientation65, R.drawable.orientation66, R.drawable.orientation67, R.drawable.orientation68, R.drawable.orientation69, R.drawable.orientation70, R.drawable.orientation71,
                R.drawable.service1, R.drawable.service2, R.drawable.service3, R.drawable.service4, R.drawable.service5,R.drawable.service6, R.drawable.service7, R.drawable.service8, R.drawable.service9, R.drawable.service10, R.drawable.service11,R.drawable.service12,
                R.drawable.service13, R.drawable.service14, R.drawable.service15, R.drawable.service16, R.drawable.service17, R.drawable.service18, R.drawable.service19, R.drawable.service20, R.drawable.service21,
                R.drawable.service22, R.drawable.service23, R.drawable.service24, R.drawable.service25, R.drawable.service26, R.drawable.service26, R.drawable.service27, R.drawable.service28, R.drawable.service29,
                R.drawable.prohibition1, R.drawable.prohibition2, R.drawable.prohibition3,R.drawable.prohibition4, R.drawable.prohibition5,R.drawable.prohibition6, R.drawable.prohibition7, R.drawable.prohibition8, R.drawable.prohibition9, R.drawable.prohibition10, R.drawable.prohibition11,
                R.drawable.prohibition12,  R.drawable.prohibition13, R.drawable.prohibition14, R.drawable.prohibition15, R.drawable.prohibition16, R.drawable.prohibition17, R.drawable.prohibition18, R.drawable.prohibition19, R.drawable.prohibition20, R.drawable.prohibition21,
                R.drawable.prohibition22, R.drawable.prohibition23, R.drawable.prohibition24, R.drawable.prohibition25, R.drawable.prohibition26,  R.drawable.prohibition27, R.drawable.prohibition28, R.drawable.prohibition29,
                R.drawable.prohibition30, R.drawable.prohibition31, R.drawable.prohibition32,R.drawable.prohibition33, R.drawable.prohibition34, R.drawable.prohibition35, R.drawable.prohibition36, R.drawable.prohibition37, R.drawable.prohibition38,
                R.drawable.prohibition39, R.drawable.obligation1, R.drawable.obligation2, R.drawable.obligation3,R.drawable.obligation4, R.drawable.obligation5,R.drawable.obligation6, R.drawable.obligation7, R.drawable.obligation8, R.drawable.obligation9, R.drawable.obligation10, R.drawable.obligation11,
                R.drawable.obligation12,  R.drawable.obligation13, R.drawable.obligation14, R.drawable.obligation15, R.drawable.obligation16, R.drawable.obligation17, R.drawable.obligation18, R.drawable.obligation19, R.drawable.obligation20, R.drawable.obligation21,
                R.drawable.obligation22, R.drawable.obligation23, R.drawable.obligation24, R.drawable.obligation25)




        val resp = listOf(getString(R.string.priority1), getString(R.string.priority2), getString(R.string.priority3),getString(R.string.priority4),getString(R.string.priority5),getString(R.string.priority6),getString(R.string.danger1),
                getString(R.string.danger2), getString(R.string.danger3),getString(R.string.orientation4),getString(R.string.danger5),getString(R.string.danger6),getString(R.string.danger7),getString(R.string.danger8),
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
                getString(R.string.works36), getString(R.string.orientation1),getString(R.string.orientation2),getString(R.string.orientation3),getString(R.string.orientation4),getString(R.string.orientation5),getString(R.string.orientation6),getString(R.string.orientation7),getString(R.string.orientation8),getString(R.string.orientation9),
                getString(R.string.orientation10),getString(R.string.orientation11),getString(R.string.orientation12),getString(R.string.orientation13),getString(R.string.orientation14),getString(R.string.orientation15),getString(R.string.orientation16),getString(R.string.orientation17),getString(R.string.orientation18),
                getString(R.string.orientation19),getString(R.string.orientation20),getString(R.string.orientation21),getString(R.string.orientation22),getString(R.string.orientation23),getString(R.string.orientation24),getString(R.string.orientation25),getString(R.string.orientation26),getString(R.string.orientation26),
                getString(R.string.orientation27),getString(R.string.orientation28),getString(R.string.orientation29),getString(R.string.orientation30),getString(R.string.orientation31),getString(R.string.orientation32),getString(R.string.orientation33),getString(R.string.orientation34),getString(R.string.orientation35),
                getString(R.string.orientation36),getString(R.string.orientation37),getString(R.string.orientation38),getString(R.string.orientation39),getString(R.string.orientation40),getString(R.string.orientation41),getString(R.string.orientation42),getString(R.string.orientation43),getString(R.string.orientation44),
                getString(R.string.orientation45),getString(R.string.orientation46),getString(R.string.orientation47),getString(R.string.orientation48),getString(R.string.orientation49),getString(R.string.orientation50),getString(R.string.orientation51),getString(R.string.orientation52),getString(R.string.orientation53),
                getString(R.string.orientation54),getString(R.string.orientation55),getString(R.string.orientation56),getString(R.string.orientation57),getString(R.string.orientation58),getString(R.string.orientation59),getString(R.string.orientation60),getString(R.string.orientation61),getString(R.string.orientation62),
                getString(R.string.orientation63),getString(R.string.orientation64),getString(R.string.orientation65),getString(R.string.orientation66),getString(R.string.orientation67),getString(R.string.orientation68),getString(R.string.orientation69),getString(R.string.orientation70),
                getString(R.string.orientation71),getString(R.string.service1), getString(R.string.service2), getString(R.string.service3),getString(R.string.orientation4),getString(R.string.service5),getString(R.string.service6),getString(R.string.service7),getString(R.string.service8),
                getString(R.string.service9),getString(R.string.service10),getString(R.string.service11),getString(R.string.service12),getString(R.string.service13),getString(R.string.service14),getString(R.string.service15),getString(R.string.service16),
                getString(R.string.service17),getString(R.string.service18),getString(R.string.service19),getString(R.string.service20),getString(R.string.service21),getString(R.string.service22),getString(R.string.service23),getString(R.string.service24),
                getString(R.string.service25),getString(R.string.service26),getString(R.string.service26),getString(R.string.service27),getString(R.string.service28),getString(R.string.service29), getString(R.string.prohibition1), getString(R.string.prohibition2), getString(R.string.prohibition3),getString(R.string.orientation4),getString(R.string.prohibition5),getString(R.string.prohibition6),getString(R.string.prohibition7),getString(R.string.prohibition8),
                getString(R.string.prohibition9),getString(R.string.prohibition10),getString(R.string.prohibition11),getString(R.string.prohibition12),getString(R.string.prohibition13),getString(R.string.prohibition14),getString(R.string.prohibition15),getString(R.string.prohibition16),
                getString(R.string.prohibition17),getString(R.string.prohibition18),getString(R.string.prohibition19),getString(R.string.prohibition20),getString(R.string.prohibition21),getString(R.string.prohibition22),getString(R.string.prohibition23),getString(R.string.prohibition24),
                getString(R.string.prohibition25),getString(R.string.prohibition26),getString(R.string.prohibition27),getString(R.string.prohibition28),getString(R.string.prohibition29),getString(R.string.prohibition30),getString(R.string.prohibition31),
                getString(R.string.prohibition32),getString(R.string.prohibition33),getString(R.string.prohibition34),getString(R.string.prohibition35),getString(R.string.prohibition36),getString(R.string.prohibition37),getString(R.string.prohibition38),
                getString(R.string.prohibition39), getString(R.string.obligation1), getString(R.string.obligation2), getString(R.string.obligation3),getString(R.string.orientation4),getString(R.string.obligation5),getString(R.string.obligation6),getString(R.string.obligation7),getString(R.string.obligation8),
                getString(R.string.obligation9),getString(R.string.obligation10),getString(R.string.obligation11),getString(R.string.obligation12),getString(R.string.obligation13),getString(R.string.obligation14),getString(R.string.obligation15),getString(R.string.obligation16),
                getString(R.string.obligation17),getString(R.string.obligation18),getString(R.string.obligation19),getString(R.string.obligation20),getString(R.string.obligation21),getString(R.string.obligation22),getString(R.string.obligation23),getString(R.string.obligation24),
                getString(R.string.obligation25) )



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

        resp1.setOnClickListener {
            if (aleatorio == 0) {

                resp1.setBackgroundColor(Color.GREEN)
                resp1.isClickable = false
                resp2.isEnabled = false
                resp3.isEnabled = false
                next.isEnabled= true

                aciertos++

            } else if (aleatorio == 1) {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.GREEN)
                resp3.setBackgroundColor(Color.RED)

                resp1.isEnabled = false
                resp2.isClickable = false
                resp3.isEnabled = false
                next.isEnabled= true

                fallos++

            } else {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.GREEN)

                resp1.isEnabled = false
                resp2.isEnabled = false
                resp3.isClickable = false
                next.isEnabled= true

                fallos++
            }
        }

        resp2.setOnClickListener {
            if (aleatorio == 1) {

                resp2.setBackgroundColor(Color.GREEN)
                resp1.isEnabled = false
                resp2.isClickable = false
                resp3.isEnabled = false
                next.isEnabled= true

                aciertos++

            } else if (aleatorio == 0) {
                resp1.setBackgroundColor(Color.GREEN)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.RED)

                resp1.isClickable = false
                resp2.isEnabled = false
                resp3.isEnabled = false
                next.isEnabled= true

                fallos++

            } else {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.GREEN)

                resp1.isEnabled = false
                resp2.isEnabled = false
                resp3.isClickable = false
                next.isEnabled= true

                fallos++
            }
        }

        resp3.setOnClickListener {
            if (aleatorio == 2) {

                resp3.setBackgroundColor(Color.GREEN)
                resp1.isEnabled = false
                resp2.isEnabled = false
                resp3.isClickable = false
                next.isEnabled= true

                aciertos++

            } else if (aleatorio == 0) {
                resp1.setBackgroundColor(Color.GREEN)
                resp2.setBackgroundColor(Color.RED)
                resp3.setBackgroundColor(Color.RED)

                resp1.isClickable = false
                resp2.isEnabled = false
                resp3.isEnabled = false
                next.isEnabled= true

                fallos++


            } else {
                resp1.setBackgroundColor(Color.RED)
                resp2.setBackgroundColor(Color.GREEN)
                resp3.setBackgroundColor(Color.RED)

                resp1.isEnabled = false
                resp2.isClickable = false
                resp3.isEnabled = false
                next.isEnabled= true

                fallos++

            }
        }


        next.setOnClickListener {

            if (contador_preguntas==10){

                //finalizan las preguntas y se iniciaría la siguiente actividad mostrando los fallos y los aciertos
                //Toast.makeText(this,"A: $aciertos F: $fallos", Toast.LENGTH_SHORT).show()
                finish()

            }else{

                contador_preguntas++

                num_preguntas.text = contador_preguntas.toString()
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


                val aleatorio2 = (Math.random() * 3).toInt()
                aleatorio = aleatorio2
                test_img.setImageResource(imagenes.elementAt(aleatorio))
                resp1.text = respuestas.elementAt(0)
                resp2.text = respuestas.elementAt(1)
                resp3.text = respuestas.elementAt(2)
            }

        }


    }//OnCreate

}

