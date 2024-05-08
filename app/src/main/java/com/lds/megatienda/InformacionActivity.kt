package com.lds.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_informacion.*

class InformacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)


        btnCrearCuenta2.setOnClickListener{

            startActivity( Intent(this,ListView01Activity::class.java))
        }
    }


}
