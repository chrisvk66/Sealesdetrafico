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
class Signals_obligation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_obligation)

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
            R.id.obligation1 ->{
                text_dialog.setText(R.string.obligation1)
                signal_dialog.setImageResource(R.drawable.obligation1)
            }

            R.id.obligation2 ->{
                text_dialog.setText(R.string.obligation2)
                signal_dialog.setImageResource(R.drawable.obligation2)
            }

            R.id.obligation3 ->{
                text_dialog.setText(R.string.obligation3)
                signal_dialog.setImageResource(R.drawable.obligation3)
            }

            R.id.obligation4 ->{
                text_dialog.setText(R.string.obligation4)
                signal_dialog.setImageResource(R.drawable.obligation4)
            }

            R.id.obligation5 ->{
                text_dialog.setText(R.string.obligation5)
                signal_dialog.setImageResource(R.drawable.obligation5)
            }

            R.id.obligation6 ->{
                text_dialog.setText(R.string.obligation6)
                signal_dialog.setImageResource(R.drawable.obligation6)
            }

            R.id.obligation7 ->{
                text_dialog.setText(R.string.obligation7)
                signal_dialog.setImageResource(R.drawable.obligation7)
            }

            R.id.obligation8 ->{
                text_dialog.setText(R.string.obligation8)
                signal_dialog.setImageResource(R.drawable.obligation8)
            }

            R.id.obligation9 ->{
                text_dialog.setText(R.string.obligation9)
                signal_dialog.setImageResource(R.drawable.obligation9)
            }

            R.id.obligation10 ->{
                text_dialog.setText(R.string.obligation10)
                signal_dialog.setImageResource(R.drawable.obligation10)
            }

            R.id.obligation11 ->{
                text_dialog.setText(R.string.obligation11)
                signal_dialog.setImageResource(R.drawable.obligation11)
            }

            R.id.obligation12 ->{
                text_dialog.setText(R.string.obligation12)
                signal_dialog.setImageResource(R.drawable.obligation12)
            }

            R.id.obligation13 ->{
                text_dialog.setText(R.string.obligation13)
                signal_dialog.setImageResource(R.drawable.obligation13)
            }

            R.id.obligation14 ->{
                text_dialog.setText(R.string.obligation14)
                signal_dialog.setImageResource(R.drawable.obligation14)
            }

            R.id.obligation15 ->{
                text_dialog.setText(R.string.obligation15)
                signal_dialog.setImageResource(R.drawable.obligation15)
            }

            R.id.obligation16 ->{
                text_dialog.setText(R.string.obligation16)
                signal_dialog.setImageResource(R.drawable.obligation16)
            }

            R.id.obligation17 ->{
                text_dialog.setText(R.string.obligation17)
                signal_dialog.setImageResource(R.drawable.obligation17)
            }

            R.id.obligation18 ->{
                text_dialog.setText(R.string.obligation18)
                signal_dialog.setImageResource(R.drawable.obligation18)
            }

            R.id.obligation19 ->{
                text_dialog.setText(R.string.obligation19)
                signal_dialog.setImageResource(R.drawable.obligation19)
            }

            R.id.obligation20 ->{
                text_dialog.setText(R.string.obligation20)
                signal_dialog.setImageResource(R.drawable.obligation20)
            }

            R.id.obligation21 ->{
                text_dialog.setText(R.string.obligation21)
                signal_dialog.setImageResource(R.drawable.obligation21)
            }

            R.id.obligation22 ->{
                text_dialog.setText(R.string.obligation22)
                signal_dialog.setImageResource(R.drawable.obligation22)
            }

            R.id.obligation23 ->{
                text_dialog.setText(R.string.obligation23)
                signal_dialog.setImageResource(R.drawable.obligation23)
            }

            R.id.obligation24 ->{
                text_dialog.setText(R.string.obligation24)
                signal_dialog.setImageResource(R.drawable.obligation24)
            }

            R.id.obligation25 ->{
                text_dialog.setText(R.string.obligation25)
                signal_dialog.setImageResource(R.drawable.obligation25)
            }
        }
    }
}
