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
class Signals_danger : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_danger)

    }



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
            R.id.danger1 ->{
                text_dialog.setText(R.string.danger1) //aqui cambiaria la descripcion
                signal_dialog.setImageResource(R.drawable.danger1) //aqui cambia la imagen
            }

            R.id.danger2 ->{
                text_dialog.setText(R.string.danger2) //aqui cambiaria la descripcion
                signal_dialog.setImageResource(R.drawable.danger2) //aqui cambia la imagen
            }

            R.id.danger3 ->{
                text_dialog.setText(R.string.danger3) //aqui cambiaria la descripcion
                signal_dialog.setImageResource(R.drawable.danger3) //aqui cambia la imagen
            }

            R.id.danger4 ->{
                text_dialog.setText(R.string.danger4) //aqui cambiaria la descripcion
                signal_dialog.setImageResource(R.drawable.danger4) //aqui cambia la imagen
            }
        }
    }


}
