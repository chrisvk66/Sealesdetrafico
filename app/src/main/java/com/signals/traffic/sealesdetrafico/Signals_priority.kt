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
class Signals_priority : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_priority)

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
        alertDialog.window.setBackgroundDrawableResource(R.drawable.dialog_border)
        alertDialog.show()

        val signal_dialog=prompt.findViewById<ImageView>(R.id.signal_dialog)
        val text_dialog=prompt.findViewById<TextView>(R.id.text_dialog)


        when(view.id){

            //aqui se cambia el texto y la imagen segun que imagen se pulse
            R.id.priority1 ->{
                text_dialog.setText(R.string.priority1)
                signal_dialog.setImageResource(R.drawable.priority1)
            }

            R.id.priority2 ->{
                text_dialog.setText(R.string.priority2)
                signal_dialog.setImageResource(R.drawable.priority2)
            }

            R.id.priority3 ->{
                text_dialog.setText(R.string.priority3)
                signal_dialog.setImageResource(R.drawable.priority3)
            }

            R.id.priority4 ->{
                text_dialog.setText(R.string.priority4)
                signal_dialog.setImageResource(R.drawable.priority4)
            }

            R.id.priority5 ->{
                text_dialog.setText(R.string.priority5)
                signal_dialog.setImageResource(R.drawable.priority5)
            }

            R.id.priority6 ->{
                text_dialog.setText(R.string.priority6)
                signal_dialog.setImageResource(R.drawable.priority6)
            }

        }
    }
}
