package com.lds.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCrearCuenta.setOnClickListener{

            startActivity( Intent(this,CrearCuentaActivity::class.java))
        }

        btnCrearCuenta2.setOnClickListener{

            startActivity( Intent(this,ListView01Activity::class.java))
        }

        tvInicioSesion.setOnClickListener{

            startActivity( Intent(this,InicioSesionActivity::class.java))

        }

    }
}



