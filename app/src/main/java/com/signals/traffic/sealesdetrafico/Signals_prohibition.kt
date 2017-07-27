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
class Signals_prohibition : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_prohibition)

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
            R.id.prohibition1 ->{
                text_dialog.setText(R.string.prohibition1)
                signal_dialog.setImageResource(R.drawable.prohibition1)
            }

            R.id.prohibition2 ->{
                text_dialog.setText(R.string.prohibition2)
                signal_dialog.setImageResource(R.drawable.prohibition2)
            }

            R.id.prohibition3 ->{
                text_dialog.setText(R.string.prohibition3)
                signal_dialog.setImageResource(R.drawable.prohibition3)
            }

            R.id.prohibition4 ->{
                text_dialog.setText(R.string.prohibition4)
                signal_dialog.setImageResource(R.drawable.prohibition4)
            }

            R.id.prohibition5 ->{
                text_dialog.setText(R.string.prohibition5)
                signal_dialog.setImageResource(R.drawable.prohibition5)
            }

            R.id.prohibition6 ->{
                text_dialog.setText(R.string.prohibition6)
                signal_dialog.setImageResource(R.drawable.prohibition6)
            }

            R.id.prohibition7 ->{
                text_dialog.setText(R.string.prohibition7)
                signal_dialog.setImageResource(R.drawable.prohibition7)
            }

            R.id.prohibition8 ->{
                text_dialog.setText(R.string.prohibition8)
                signal_dialog.setImageResource(R.drawable.prohibition8)
            }

            R.id.prohibition9 ->{
                text_dialog.setText(R.string.prohibition9)
                signal_dialog.setImageResource(R.drawable.prohibition9)
            }

            R.id.prohibition10 ->{
                text_dialog.setText(R.string.prohibition10)
                signal_dialog.setImageResource(R.drawable.prohibition10)
            }

            R.id.prohibition11 ->{
                text_dialog.setText(R.string.prohibition11)
                signal_dialog.setImageResource(R.drawable.prohibition11)
            }

            R.id.prohibition12 ->{
                text_dialog.setText(R.string.prohibition12)
                signal_dialog.setImageResource(R.drawable.prohibition12)
            }

            R.id.prohibition13 ->{
                text_dialog.setText(R.string.prohibition13)
                signal_dialog.setImageResource(R.drawable.prohibition13)
            }

            R.id.prohibition14 ->{
                text_dialog.setText(R.string.prohibition14)
                signal_dialog.setImageResource(R.drawable.prohibition14)
            }

            R.id.prohibition15 ->{
                text_dialog.setText(R.string.prohibition15)
                signal_dialog.setImageResource(R.drawable.prohibition15)
            }

            R.id.prohibition16 ->{
                text_dialog.setText(R.string.prohibition16)
                signal_dialog.setImageResource(R.drawable.prohibition16)
            }

            R.id.prohibition17 ->{
                text_dialog.setText(R.string.prohibition17)
                signal_dialog.setImageResource(R.drawable.prohibition17)
            }

            R.id.prohibition18 ->{
                text_dialog.setText(R.string.prohibition18)
                signal_dialog.setImageResource(R.drawable.prohibition18)
            }

            R.id.prohibition19 ->{
                text_dialog.setText(R.string.prohibition19)
                signal_dialog.setImageResource(R.drawable.prohibition19)
            }

            R.id.prohibition20 ->{
                text_dialog.setText(R.string.prohibition20)
                signal_dialog.setImageResource(R.drawable.prohibition20)
            }

            R.id.prohibition21 ->{
                text_dialog.setText(R.string.prohibition21)
                signal_dialog.setImageResource(R.drawable.prohibition21)
            }

            R.id.prohibition22 ->{
                text_dialog.setText(R.string.prohibition22)
                signal_dialog.setImageResource(R.drawable.prohibition22)
            }

            R.id.prohibition23 ->{
                text_dialog.setText(R.string.prohibition23)
                signal_dialog.setImageResource(R.drawable.prohibition23)
            }

            R.id.prohibition24 ->{
                text_dialog.setText(R.string.prohibition24)
                signal_dialog.setImageResource(R.drawable.prohibition24)
            }

            R.id.prohibition25 ->{
                text_dialog.setText(R.string.prohibition25)
                signal_dialog.setImageResource(R.drawable.prohibition25)
            }

            R.id.prohibition26 ->{
                text_dialog.setText(R.string.prohibition26)
                signal_dialog.setImageResource(R.drawable.prohibition26)
            }

            R.id.prohibition27 ->{
                text_dialog.setText(R.string.prohibition27)
                signal_dialog.setImageResource(R.drawable.prohibition27)
            }

            R.id.prohibition28 ->{
                text_dialog.setText(R.string.prohibition28)
                signal_dialog.setImageResource(R.drawable.prohibition28)
            }

            R.id.prohibition29 ->{
                text_dialog.setText(R.string.prohibition29)
                signal_dialog.setImageResource(R.drawable.prohibition29)
            }

            R.id.prohibition30 ->{
                text_dialog.setText(R.string.prohibition30)
                signal_dialog.setImageResource(R.drawable.prohibition30)
            }

            R.id.prohibition31 ->{
                text_dialog.setText(R.string.prohibition31)
                signal_dialog.setImageResource(R.drawable.prohibition31)
            }

            R.id.prohibition32 ->{
                text_dialog.setText(R.string.prohibition32)
                signal_dialog.setImageResource(R.drawable.prohibition32)
            }

            R.id.prohibition33 ->{
                text_dialog.setText(R.string.prohibition33)
                signal_dialog.setImageResource(R.drawable.prohibition33)
            }

            R.id.prohibition34 ->{
                text_dialog.setText(R.string.prohibition34)
                signal_dialog.setImageResource(R.drawable.prohibition34)
            }

            R.id.prohibition35 ->{
                text_dialog.setText(R.string.prohibition35)
                signal_dialog.setImageResource(R.drawable.prohibition35)
            }

            R.id.prohibition36 ->{
                text_dialog.setText(R.string.prohibition36)
                signal_dialog.setImageResource(R.drawable.prohibition36)
            }

            R.id.prohibition37 ->{
                text_dialog.setText(R.string.prohibition37)
                signal_dialog.setImageResource(R.drawable.prohibition37)
            }

            R.id.prohibition38 ->{
                text_dialog.setText(R.string.prohibition38)
                signal_dialog.setImageResource(R.drawable.prohibition38)
            }

            R.id.prohibition39 ->{
                text_dialog.setText(R.string.prohibition39)
                signal_dialog.setImageResource(R.drawable.prohibition39)
            }
        }
    }
}
