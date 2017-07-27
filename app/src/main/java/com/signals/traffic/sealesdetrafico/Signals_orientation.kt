package com.signals.traffic.sealesdetrafico

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by David M on 19/07/2017.
 */
class Signals_orientation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_orientation)

    }


    /*override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
        startActivity(Intent(this, MainActivity::class.java))
    }*/


    //Cuando pulsas sobre un icono se abre el dialog con la imagen y la descripcion
    fun verSeñal(view: View){
        val context: Context =this

        val li:LayoutInflater= LayoutInflater.from(context)
        val prompt:View= li.inflate(R.layout.signals_dialog,null)
        val alert=AlertDialog.Builder(context)
        alert.setView(prompt)
        alert.setCancelable(true)
        val alertDialog:AlertDialog = alert.create()
        alertDialog.show()

        val signal_dialog=prompt.findViewById<ImageView>(R.id.signal_dialog)
        val text_dialog=prompt.findViewById<TextView>(R.id.text_dialog)


        when(view.id){

            //aqui se cambia el texto y la imagen segun que imagen se pulse
            R.id.orientation1 ->{
                text_dialog.setText(R.string.orientation1)
                signal_dialog.setImageResource(R.drawable.orientation1)
            }

            R.id.orientation2 ->{
                text_dialog.setText(R.string.orientation2)
                signal_dialog.setImageResource(R.drawable.orientation2)
            }

            R.id.orientation3 ->{
                text_dialog.setText(R.string.orientation3)
                signal_dialog.setImageResource(R.drawable.orientation3)
            }

            R.id.orientation4 ->{
                text_dialog.setText(R.string.orientation4)
                signal_dialog.setImageResource(R.drawable.orientation4)
            }

            R.id.orientation5 ->{
                text_dialog.setText(R.string.orientation5)
                signal_dialog.setImageResource(R.drawable.orientation5)
            }

            R.id.orientation6 ->{
                text_dialog.setText(R.string.orientation6)
                signal_dialog.setImageResource(R.drawable.orientation6)
            }

            R.id.orientation7 ->{
                text_dialog.setText(R.string.orientation7)
                signal_dialog.setImageResource(R.drawable.orientation7)
            }

            R.id.orientation8 ->{
                text_dialog.setText(R.string.orientation8)
                signal_dialog.setImageResource(R.drawable.orientation8)
            }

            R.id.orientation9 ->{
                text_dialog.setText(R.string.orientation9)
                signal_dialog.setImageResource(R.drawable.orientation9)
            }

            R.id.orientation10 ->{
                text_dialog.setText(R.string.orientation10)
                signal_dialog.setImageResource(R.drawable.orientation10)
            }

            R.id.orientation11 ->{
                text_dialog.setText(R.string.orientation11)
                signal_dialog.setImageResource(R.drawable.orientation11)
            }

            R.id.orientation12 ->{
                text_dialog.setText(R.string.orientation12)
                signal_dialog.setImageResource(R.drawable.orientation12)
            }

            R.id.orientation13 ->{
                text_dialog.setText(R.string.orientation13)
                signal_dialog.setImageResource(R.drawable.orientation13)
            }

            R.id.orientation14 ->{
                text_dialog.setText(R.string.orientation14)
                signal_dialog.setImageResource(R.drawable.orientation14)
            }

            R.id.orientation15 ->{
                text_dialog.setText(R.string.orientation15)
                signal_dialog.setImageResource(R.drawable.orientation15)
            }

            R.id.orientation16 ->{
                text_dialog.setText(R.string.orientation16)
                signal_dialog.setImageResource(R.drawable.orientation16)
            }

            R.id.orientation17 ->{
                text_dialog.setText(R.string.orientation17)
                signal_dialog.setImageResource(R.drawable.orientation17)
            }

            R.id.orientation18 ->{
                text_dialog.setText(R.string.orientation18)
                signal_dialog.setImageResource(R.drawable.orientation18)
            }

            R.id.orientation19 ->{
                text_dialog.setText(R.string.orientation19)
                signal_dialog.setImageResource(R.drawable.orientation19)
            }

            R.id.orientation20 ->{
                text_dialog.setText(R.string.orientation20)
                signal_dialog.setImageResource(R.drawable.orientation20)
            }

            R.id.orientation21 ->{
                text_dialog.setText(R.string.orientation21)
                signal_dialog.setImageResource(R.drawable.orientation21)
            }

            R.id.orientation22 ->{
                text_dialog.setText(R.string.orientation22)
                signal_dialog.setImageResource(R.drawable.orientation22)
            }

            R.id.orientation23 ->{
                text_dialog.setText(R.string.orientation23)
                signal_dialog.setImageResource(R.drawable.orientation23)
            }

            R.id.orientation24 ->{
                text_dialog.setText(R.string.orientation24)
                signal_dialog.setImageResource(R.drawable.orientation24)
            }

            R.id.orientation25 ->{
                text_dialog.setText(R.string.orientation25)
                signal_dialog.setImageResource(R.drawable.orientation25)
            }

            R.id.orientation26 ->{
                text_dialog.setText(R.string.orientation26)
                signal_dialog.setImageResource(R.drawable.orientation26)
            }

            R.id.orientation27 ->{
                text_dialog.setText(R.string.orientation27)
                signal_dialog.setImageResource(R.drawable.orientation27)
            }

            R.id.orientation28 ->{
                text_dialog.setText(R.string.orientation28)
                signal_dialog.setImageResource(R.drawable.orientation28)
            }

            R.id.orientation29 ->{
                text_dialog.setText(R.string.orientation29)
                signal_dialog.setImageResource(R.drawable.orientation29)
            }

            R.id.orientation30 ->{
                text_dialog.setText(R.string.orientation30)
                signal_dialog.setImageResource(R.drawable.orientation30)
            }

            R.id.orientation31 ->{
                text_dialog.setText(R.string.orientation31)
                signal_dialog.setImageResource(R.drawable.orientation31)
            }

            R.id.orientation32 ->{
                text_dialog.setText(R.string.orientation32)
                signal_dialog.setImageResource(R.drawable.orientation32)
            }

            R.id.orientation33 ->{
                text_dialog.setText(R.string.orientation33)
                signal_dialog.setImageResource(R.drawable.orientation33)
            }

            R.id.orientation34 ->{
                text_dialog.setText(R.string.orientation34)
                signal_dialog.setImageResource(R.drawable.orientation34)
            }

            R.id.orientation35 ->{
                text_dialog.setText(R.string.orientation35)
                signal_dialog.setImageResource(R.drawable.orientation35)
            }

            R.id.orientation36 ->{
                text_dialog.setText(R.string.orientation36)
                signal_dialog.setImageResource(R.drawable.orientation36)
            }

            R.id.orientation37 ->{
                text_dialog.setText(R.string.orientation37)
                signal_dialog.setImageResource(R.drawable.orientation37)
            }

            R.id.orientation38 ->{
                text_dialog.setText(R.string.orientation38)
                signal_dialog.setImageResource(R.drawable.orientation38)
            }

            R.id.orientation39 ->{
                text_dialog.setText(R.string.orientation39)
                signal_dialog.setImageResource(R.drawable.orientation39)
            }

            R.id.orientation40 ->{
                text_dialog.setText(R.string.orientation40)
                signal_dialog.setImageResource(R.drawable.orientation40)
            }

            R.id.orientation41 ->{
                text_dialog.setText(R.string.orientation41)
                signal_dialog.setImageResource(R.drawable.orientation41)
            }

            R.id.orientation42 ->{
                text_dialog.setText(R.string.orientation42)
                signal_dialog.setImageResource(R.drawable.orientation42)
            }

            R.id.orientation43 ->{
                text_dialog.setText(R.string.orientation43)
                signal_dialog.setImageResource(R.drawable.orientation43)
            }

            R.id.orientation44 ->{
                text_dialog.setText(R.string.orientation44)
                signal_dialog.setImageResource(R.drawable.orientation44)
            }

            R.id.orientation45 ->{
                text_dialog.setText(R.string.orientation45)
                signal_dialog.setImageResource(R.drawable.orientation45)
            }

            R.id.orientation46 ->{
                text_dialog.setText(R.string.orientation46)
                signal_dialog.setImageResource(R.drawable.orientation46)
            }

            R.id.orientation47 ->{
                text_dialog.setText(R.string.orientation47)
                signal_dialog.setImageResource(R.drawable.orientation47)
            }

            R.id.orientation48 ->{
                text_dialog.setText(R.string.orientation48)
                signal_dialog.setImageResource(R.drawable.orientation48)
            }

            R.id.orientation49 ->{
                text_dialog.setText(R.string.orientation49)
                signal_dialog.setImageResource(R.drawable.orientation49)
            }

            R.id.orientation50 ->{
                text_dialog.setText(R.string.orientation50)
                signal_dialog.setImageResource(R.drawable.orientation50)
            }

            R.id.orientation51 ->{
                text_dialog.setText(R.string.orientation51)
                signal_dialog.setImageResource(R.drawable.orientation51)
            }

            R.id.orientation52 ->{
                text_dialog.setText(R.string.orientation52)
                signal_dialog.setImageResource(R.drawable.orientation52)
            }

            R.id.orientation53 ->{
                text_dialog.setText(R.string.orientation53)
                signal_dialog.setImageResource(R.drawable.orientation53)
            }

            R.id.orientation54 ->{
                text_dialog.setText(R.string.orientation54)
                signal_dialog.setImageResource(R.drawable.orientation54)
            }

            R.id.orientation55 ->{
                text_dialog.setText(R.string.orientation55)
                signal_dialog.setImageResource(R.drawable.orientation55)
            }

            R.id.orientation56 ->{
                text_dialog.setText(R.string.orientation56)
                signal_dialog.setImageResource(R.drawable.orientation56)
            }

            R.id.orientation57 ->{
                text_dialog.setText(R.string.orientation57)
                signal_dialog.setImageResource(R.drawable.orientation57)
            }

            R.id.orientation58 ->{
                text_dialog.setText(R.string.orientation58)
                signal_dialog.setImageResource(R.drawable.orientation58)
            }

            R.id.orientation59 ->{
                text_dialog.setText(R.string.orientation59)
                signal_dialog.setImageResource(R.drawable.orientation59)
            }

            R.id.orientation60 ->{
                text_dialog.setText(R.string.orientation60)
                signal_dialog.setImageResource(R.drawable.orientation60)
            }

            R.id.orientation61 ->{
                text_dialog.setText(R.string.orientation61)
                signal_dialog.setImageResource(R.drawable.orientation61)
            }

            R.id.orientation62 ->{
                text_dialog.setText(R.string.orientation62)
                signal_dialog.setImageResource(R.drawable.orientation62)
            }

            R.id.orientation63 ->{
                text_dialog.setText(R.string.orientation63)
                signal_dialog.setImageResource(R.drawable.orientation63)
            }

            R.id.orientation64 ->{
                text_dialog.setText(R.string.orientation64)
                signal_dialog.setImageResource(R.drawable.orientation64)
            }

            R.id.orientation65 ->{
                text_dialog.setText(R.string.orientation65)
                signal_dialog.setImageResource(R.drawable.orientation65)
            }

            R.id.orientation66 ->{
                text_dialog.setText(R.string.orientation66)
                signal_dialog.setImageResource(R.drawable.orientation66)
            }

            R.id.orientation67 ->{
                text_dialog.setText(R.string.orientation67)
                signal_dialog.setImageResource(R.drawable.orientation67)
            }

            R.id.orientation68 ->{
                text_dialog.setText(R.string.orientation68)
                signal_dialog.setImageResource(R.drawable.orientation68)
            }

            R.id.orientation69 ->{
                text_dialog.setText(R.string.orientation69)
                signal_dialog.setImageResource(R.drawable.orientation69)
            }

            R.id.orientation70 ->{
                text_dialog.setText(R.string.orientation70)
                signal_dialog.setImageResource(R.drawable.orientation70)
            }

            R.id.orientation71 ->{
                text_dialog.setText(R.string.orientation71)
                signal_dialog.setImageResource(R.drawable.orientation71)
            }
        }
    }
}
