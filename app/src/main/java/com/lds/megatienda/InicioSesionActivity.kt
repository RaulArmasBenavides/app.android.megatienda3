package com.lds.megatienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class InicioSesionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
    }
      // Para implementar el menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_inicio_sesion, menu)
        return true
    }

    //Para implementar el evento click del menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.nav_informacion -> {
                mostrarInformacion()
                true
            }
            R.id.nav_acerca_de -> {
                mostrarAcerca()
                true
            }
            R.id.nav_terminos -> {
                mostrarTerminos()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun mostrarTerminos() {
        //{startActivity( Intent(this,MainActivity::class.java))
    }

    private fun mostrarAcerca() {
       // {startActivity( Intent(this,MainActivity::class.java))
    }

    private fun mostrarInformacion() {
        startActivity( Intent(this,InformacionActivity::class.java))
    }

}
