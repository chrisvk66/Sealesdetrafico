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
class Signals_service : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_service)

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
            R.id.service1 ->{
                text_dialog.setText(R.string.service1)
                signal_dialog.setImageResource(R.drawable.service1)
            }

            R.id.service2 ->{
                text_dialog.setText(R.string.service2)
                signal_dialog.setImageResource(R.drawable.service2)
            }

            R.id.service3 ->{
                text_dialog.setText(R.string.service3)
                signal_dialog.setImageResource(R.drawable.service3)
            }

            R.id.service4 ->{
                text_dialog.setText(R.string.service4)
                signal_dialog.setImageResource(R.drawable.service4)
            }

            R.id.service5 ->{
                text_dialog.setText(R.string.service5)
                signal_dialog.setImageResource(R.drawable.service5)
            }

            R.id.service6 ->{
                text_dialog.setText(R.string.service6)
                signal_dialog.setImageResource(R.drawable.service6)
            }

            R.id.service7 ->{
                text_dialog.setText(R.string.service7)
                signal_dialog.setImageResource(R.drawable.service7)
            }

            R.id.service8 ->{
                text_dialog.setText(R.string.service8)
                signal_dialog.setImageResource(R.drawable.service8)
            }

            R.id.service9 ->{
                text_dialog.setText(R.string.service9)
                signal_dialog.setImageResource(R.drawable.service9)
            }

            R.id.service10 ->{
                text_dialog.setText(R.string.service10)
                signal_dialog.setImageResource(R.drawable.service10)
            }

            R.id.service11 ->{
                text_dialog.setText(R.string.service11)
                signal_dialog.setImageResource(R.drawable.service11)
            }

            R.id.service12 ->{
                text_dialog.setText(R.string.service12)
                signal_dialog.setImageResource(R.drawable.service12)
            }

            R.id.service13 ->{
                text_dialog.setText(R.string.service13)
                signal_dialog.setImageResource(R.drawable.service13)
            }

            R.id.service14 ->{
                text_dialog.setText(R.string.service14)
                signal_dialog.setImageResource(R.drawable.service14)
            }

            R.id.service15 ->{
                text_dialog.setText(R.string.service15)
                signal_dialog.setImageResource(R.drawable.service15)
            }

            R.id.service16 ->{
                text_dialog.setText(R.string.service16)
                signal_dialog.setImageResource(R.drawable.service16)
            }

            R.id.service17 ->{
                text_dialog.setText(R.string.service17)
                signal_dialog.setImageResource(R.drawable.service17)
            }

            R.id.service18 ->{
                text_dialog.setText(R.string.service18)
                signal_dialog.setImageResource(R.drawable.service18)
            }

            R.id.service19 ->{
                text_dialog.setText(R.string.service19)
                signal_dialog.setImageResource(R.drawable.service19)
            }

            R.id.service20 ->{
                text_dialog.setText(R.string.service20)
                signal_dialog.setImageResource(R.drawable.service20)
            }

            R.id.service21 ->{
                text_dialog.setText(R.string.service21)
                signal_dialog.setImageResource(R.drawable.service21)
            }

            R.id.service22 ->{
                text_dialog.setText(R.string.service22)
                signal_dialog.setImageResource(R.drawable.service22)
            }

            R.id.service23 ->{
                text_dialog.setText(R.string.service23)
                signal_dialog.setImageResource(R.drawable.service23)
            }

            R.id.service24 ->{
                text_dialog.setText(R.string.service24)
                signal_dialog.setImageResource(R.drawable.service24)
            }

            R.id.service25 ->{
                text_dialog.setText(R.string.service25)
                signal_dialog.setImageResource(R.drawable.service25)
            }

            R.id.service26 ->{
                text_dialog.setText(R.string.service26)
                signal_dialog.setImageResource(R.drawable.service26)
            }

            R.id.service27 ->{
                text_dialog.setText(R.string.service27)
                signal_dialog.setImageResource(R.drawable.service27)
            }

            R.id.service28 ->{
                text_dialog.setText(R.string.service28)
                signal_dialog.setImageResource(R.drawable.service28)
            }

            R.id.service29 ->{
                text_dialog.setText(R.string.service29)
                signal_dialog.setImageResource(R.drawable.service29)
            }
        }
    }
}
