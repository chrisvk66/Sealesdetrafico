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
class Signals_works : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_works)

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
            R.id.works1 ->{
                text_dialog.setText(R.string.works1)
                signal_dialog.setImageResource(R.drawable.works1)
            }

            R.id.works2 ->{
                text_dialog.setText(R.string.works2)
                signal_dialog.setImageResource(R.drawable.works2)
            }

            R.id.works3 ->{
                text_dialog.setText(R.string.works3)
                signal_dialog.setImageResource(R.drawable.works3)
            }

            R.id.works4 ->{
                text_dialog.setText(R.string.works4)
                signal_dialog.setImageResource(R.drawable.works4)
            }

            R.id.works5 ->{
                text_dialog.setText(R.string.works5)
                signal_dialog.setImageResource(R.drawable.works5)
            }

            R.id.works6 ->{
                text_dialog.setText(R.string.works6)
                signal_dialog.setImageResource(R.drawable.works6)
            }

            R.id.works7 ->{
                text_dialog.setText(R.string.works7)
                signal_dialog.setImageResource(R.drawable.works7)
            }

            R.id.works8 ->{
                text_dialog.setText(R.string.works8)
                signal_dialog.setImageResource(R.drawable.works8)
            }

            R.id.works9 ->{
                text_dialog.setText(R.string.works9)
                signal_dialog.setImageResource(R.drawable.works9)
            }

            R.id.works10 ->{
                text_dialog.setText(R.string.works10)
                signal_dialog.setImageResource(R.drawable.works10)
            }

            R.id.works11 ->{
                text_dialog.setText(R.string.works11)
                signal_dialog.setImageResource(R.drawable.works11)
            }

            R.id.works12 ->{
                text_dialog.setText(R.string.works12)
                signal_dialog.setImageResource(R.drawable.works12)
            }

            R.id.works13 ->{
                text_dialog.setText(R.string.works13)
                signal_dialog.setImageResource(R.drawable.works13)
            }

            R.id.works14 ->{
                text_dialog.setText(R.string.works14)
                signal_dialog.setImageResource(R.drawable.works14)
            }

            R.id.works15 ->{
                text_dialog.setText(R.string.works15)
                signal_dialog.setImageResource(R.drawable.works15)
            }

            R.id.works16 ->{
                text_dialog.setText(R.string.works16)
                signal_dialog.setImageResource(R.drawable.works16)
            }

            R.id.works17 ->{
                text_dialog.setText(R.string.works17)
                signal_dialog.setImageResource(R.drawable.works17)
            }

            R.id.works18 ->{
                text_dialog.setText(R.string.works18)
                signal_dialog.setImageResource(R.drawable.works18)
            }

            R.id.works19 ->{
                text_dialog.setText(R.string.works19)
                signal_dialog.setImageResource(R.drawable.works19)
            }

            R.id.works20 ->{
                text_dialog.setText(R.string.works20)
                signal_dialog.setImageResource(R.drawable.works20)
            }

            R.id.works21 ->{
                text_dialog.setText(R.string.works21)
                signal_dialog.setImageResource(R.drawable.works21)
            }

            R.id.works22 ->{
                text_dialog.setText(R.string.works22)
                signal_dialog.setImageResource(R.drawable.works22)
            }

            R.id.works23 ->{
                text_dialog.setText(R.string.works23)
                signal_dialog.setImageResource(R.drawable.works23)
            }

            R.id.works24 ->{
                text_dialog.setText(R.string.works24)
                signal_dialog.setImageResource(R.drawable.works24)
            }

            R.id.works25 ->{
                text_dialog.setText(R.string.works25)
                signal_dialog.setImageResource(R.drawable.works25)
            }

            R.id.works26 ->{
                text_dialog.setText(R.string.works26)
                signal_dialog.setImageResource(R.drawable.works26)
            }

            R.id.works27 ->{
                text_dialog.setText(R.string.works27)
                signal_dialog.setImageResource(R.drawable.works27)
            }

            R.id.works28 ->{
                text_dialog.setText(R.string.works28)
                signal_dialog.setImageResource(R.drawable.works28)
            }

            R.id.works29 ->{
                text_dialog.setText(R.string.works29)
                signal_dialog.setImageResource(R.drawable.works29)
            }

            R.id.works30 ->{
                text_dialog.setText(R.string.works30)
                signal_dialog.setImageResource(R.drawable.works30)
            }

            R.id.works31 ->{
                text_dialog.setText(R.string.works31)
                signal_dialog.setImageResource(R.drawable.works31)
            }

            R.id.works32 ->{
                text_dialog.setText(R.string.works32)
                signal_dialog.setImageResource(R.drawable.works32)
            }

            R.id.works33 ->{
                text_dialog.setText(R.string.works33)
                signal_dialog.setImageResource(R.drawable.works33)
            }

            R.id.works34 ->{
                text_dialog.setText(R.string.works34)
                signal_dialog.setImageResource(R.drawable.works34)
            }

            R.id.works35 ->{
                text_dialog.setText(R.string.works35)
                signal_dialog.setImageResource(R.drawable.works35)
            }

            R.id.works36 ->{
                text_dialog.setText(R.string.works36)
                signal_dialog.setImageResource(R.drawable.works36)
            }
            
        }
    }
}
