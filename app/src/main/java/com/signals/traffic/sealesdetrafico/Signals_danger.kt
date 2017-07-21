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
            R.id.danger1 ->{
                text_dialog.setText(R.string.danger1)
                signal_dialog.setImageResource(R.drawable.danger1)
            }

            R.id.danger2 ->{
                text_dialog.setText(R.string.danger2)
                signal_dialog.setImageResource(R.drawable.danger2)
            }

            R.id.danger3 ->{
                text_dialog.setText(R.string.danger3)
                signal_dialog.setImageResource(R.drawable.danger3)
            }

            R.id.danger4 ->{
                text_dialog.setText(R.string.danger4)
                signal_dialog.setImageResource(R.drawable.danger4)
            }

            R.id.danger5 ->{
                text_dialog.setText(R.string.danger5)
                signal_dialog.setImageResource(R.drawable.danger5)
            }

            R.id.danger6 ->{
                text_dialog.setText(R.string.danger6)
                signal_dialog.setImageResource(R.drawable.danger6)
            }

            R.id.danger7 ->{
                text_dialog.setText(R.string.danger7)
                signal_dialog.setImageResource(R.drawable.danger7)
            }

            R.id.danger8 ->{
                text_dialog.setText(R.string.danger8)
                signal_dialog.setImageResource(R.drawable.danger8)
            }

            R.id.danger9 ->{
                text_dialog.setText(R.string.danger9)
                signal_dialog.setImageResource(R.drawable.danger9)
            }

            R.id.danger10 ->{
                text_dialog.setText(R.string.danger10)
                signal_dialog.setImageResource(R.drawable.danger10)
            }

            R.id.danger11 ->{
                text_dialog.setText(R.string.danger11)
                signal_dialog.setImageResource(R.drawable.danger11)
            }

            R.id.danger12 ->{
                text_dialog.setText(R.string.danger12)
                signal_dialog.setImageResource(R.drawable.danger12)
            }

            R.id.danger13 ->{
                text_dialog.setText(R.string.danger13)
                signal_dialog.setImageResource(R.drawable.danger13)
            }

            R.id.danger14 ->{
                text_dialog.setText(R.string.danger14)
                signal_dialog.setImageResource(R.drawable.danger14)
            }

            R.id.danger15 ->{
                text_dialog.setText(R.string.danger15)
                signal_dialog.setImageResource(R.drawable.danger15)
            }

            R.id.danger16 ->{
                text_dialog.setText(R.string.danger16)
                signal_dialog.setImageResource(R.drawable.danger16)
            }

            R.id.danger17 ->{
                text_dialog.setText(R.string.danger17)
                signal_dialog.setImageResource(R.drawable.danger17)
            }

            R.id.danger18 ->{
                text_dialog.setText(R.string.danger18)
                signal_dialog.setImageResource(R.drawable.danger18)
            }

            R.id.danger19 ->{
                text_dialog.setText(R.string.danger19)
                signal_dialog.setImageResource(R.drawable.danger19)
            }

            R.id.danger20 ->{
                text_dialog.setText(R.string.danger20)
                signal_dialog.setImageResource(R.drawable.danger20)
            }

            R.id.danger21 ->{
                text_dialog.setText(R.string.danger21)
                signal_dialog.setImageResource(R.drawable.danger21)
            }

            R.id.danger22 ->{
                text_dialog.setText(R.string.danger22)
                signal_dialog.setImageResource(R.drawable.danger22)
            }

            R.id.danger23 ->{
                text_dialog.setText(R.string.danger23)
                signal_dialog.setImageResource(R.drawable.danger23)
            }

            R.id.danger24 ->{
                text_dialog.setText(R.string.danger24)
                signal_dialog.setImageResource(R.drawable.danger24)
            }

            R.id.danger25 ->{
                text_dialog.setText(R.string.danger25)
                signal_dialog.setImageResource(R.drawable.danger25)
            }

            R.id.danger26 ->{
                text_dialog.setText(R.string.danger26)
                signal_dialog.setImageResource(R.drawable.danger26)
            }

            R.id.danger27 ->{
                text_dialog.setText(R.string.danger27)
                signal_dialog.setImageResource(R.drawable.danger27)
            }

            R.id.danger28 ->{
                text_dialog.setText(R.string.danger28)
                signal_dialog.setImageResource(R.drawable.danger28)
            }

            R.id.danger29 ->{
                text_dialog.setText(R.string.danger29)
                signal_dialog.setImageResource(R.drawable.danger29)
            }

            R.id.danger30 ->{
                text_dialog.setText(R.string.danger30)
                signal_dialog.setImageResource(R.drawable.danger30)
            }

            R.id.danger31 ->{
                text_dialog.setText(R.string.danger31)
                signal_dialog.setImageResource(R.drawable.danger31)
            }

            R.id.danger32 ->{
                text_dialog.setText(R.string.danger32)
                signal_dialog.setImageResource(R.drawable.danger32)
            }

            R.id.danger33 ->{
                text_dialog.setText(R.string.danger33)
                signal_dialog.setImageResource(R.drawable.danger33)
            }

            R.id.danger34 ->{
                text_dialog.setText(R.string.danger34)
                signal_dialog.setImageResource(R.drawable.danger34)
            }

            R.id.danger35 ->{
                text_dialog.setText(R.string.danger35)
                signal_dialog.setImageResource(R.drawable.danger35)
            }

            R.id.danger36 ->{
                text_dialog.setText(R.string.danger36)
                signal_dialog.setImageResource(R.drawable.danger36)
            }

            R.id.danger37 ->{
                text_dialog.setText(R.string.danger37)
                signal_dialog.setImageResource(R.drawable.danger37)
            }

            R.id.danger38 ->{
                text_dialog.setText(R.string.danger38)
                signal_dialog.setImageResource(R.drawable.danger38)
            }

            R.id.danger39 ->{
                text_dialog.setText(R.string.danger39)
                signal_dialog.setImageResource(R.drawable.danger39)
            }

            R.id.danger40 ->{
                text_dialog.setText(R.string.danger40)
                signal_dialog.setImageResource(R.drawable.danger40)
            }

            R.id.danger41 ->{
                text_dialog.setText(R.string.danger41)
                signal_dialog.setImageResource(R.drawable.danger41)
            }

            R.id.danger42 ->{
                text_dialog.setText(R.string.danger42)
                signal_dialog.setImageResource(R.drawable.danger42)
            }

            R.id.danger43 ->{
                text_dialog.setText(R.string.danger43)
                signal_dialog.setImageResource(R.drawable.danger43)
            }

            R.id.danger44 ->{
                text_dialog.setText(R.string.danger44)
                signal_dialog.setImageResource(R.drawable.danger44)
            }

            R.id.danger45 ->{
                text_dialog.setText(R.string.danger45)
                signal_dialog.setImageResource(R.drawable.danger45)
            }

            R.id.danger46 ->{
                text_dialog.setText(R.string.danger46)
                signal_dialog.setImageResource(R.drawable.danger46)
            }

            R.id.danger47 ->{
                text_dialog.setText(R.string.danger47)
                signal_dialog.setImageResource(R.drawable.danger47)
            }

            R.id.danger48 ->{
                text_dialog.setText(R.string.danger48)
                signal_dialog.setImageResource(R.drawable.danger48)
            }

            R.id.danger49 ->{
                text_dialog.setText(R.string.danger49)
                signal_dialog.setImageResource(R.drawable.danger49)
            }

            R.id.danger50 ->{
                text_dialog.setText(R.string.danger50)
                signal_dialog.setImageResource(R.drawable.danger50)
            }

            R.id.danger51 ->{
                text_dialog.setText(R.string.danger51)
                signal_dialog.setImageResource(R.drawable.danger51)
            }
        }
    }
}
