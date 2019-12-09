package com.example.ciclodevidaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnCreate" )
        // La actividad está creada.
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnStart")
        // La actividad está a punto de hacerse visible.
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnResume")
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnPause")
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnStop")
        // La actividad ya no es visible (ahora está "detenida")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show()
        Log.w("MisMensajes", "OnDestroy")
        // La actividad está a punto de ser destruida.
    }

}
