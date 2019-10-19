package com.example.myapplicationunidad2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageButtonAventura.setOnClickListener {
            val intent: Intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }

        imageButtonHadas.setOnClickListener {
            val intent: Intent = Intent(this, Main4Activity::class.java)
            startActivity(intent)
        }

        imageButtonFicción.setOnClickListener {
            val intent: Intent = Intent(this, Main5Activity::class.java)
            startActivity(intent)
        }

    }
}
