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

        //val img1=findViewById<ImageView>(R.id.pruebaimagen1)
        //val img2=findViewById<ImageView>(R.id.pruebaimagen2)
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
            R.id.pruebaimagen1 ->{
                text_dialog.text = "Imagen 1" //aqui cambiaria la descripcion
                signal_dialog.setImageResource(R.drawable.logo) //aqui cambia la imagen
            }

            R.id.pruebaimagen2-> text_dialog.text= "Imagen 2"
        }
    }


}
