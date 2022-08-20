package com.example.vcutkitlendeksi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boy: EditText=findViewById(R.id.boyid)
        val kilo: EditText =findViewById(R.id.kiloid)
        val sonuc: TextView =findViewById(R.id.sonucid)
        val btnHesapla: Button =findViewById(R.id.btnHesapla)
        val durum: TextView = findViewById(R.id.durumid)



        btnHesapla.setOnClickListener{
            val boyu:Int=Integer.parseInt(boyid.text.toString())
            val kilo:Int=Integer.parseInt(kiloid.text.toString())
            val isonuc = kilo.toFloat() / (boyu.toFloat() * boyu.toFloat()) * 10000
            sonuc.text=isonuc.toString()
            sonuc.setText(isonuc.toString())
            if (isonuc <= 18.5){
                durum.setText("ZAYIF.")
            }else if (18.5 <= isonuc && isonuc <= 24.9){
                durum.setText("NORMAL")
            }else if (25.0 <= isonuc && isonuc <= 34.9){
                durum.setText("KİLOLU.")
            }else if (35.0 <= isonuc){
                durum.setText("OBEZ.")
            }

    }

}}

