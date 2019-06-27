package com.app.lared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registroNuevoNegocio : Button = findViewById(R.id.negocio)
        registroNuevoNegocio.setOnClickListener {
            val intent = Intent(this, registro_negocio :: class.java)
            startActivity(intent)
        }

        val registroNuevoCliente : Button = findViewById(R.id.cliente)
        registroNuevoCliente.setOnClickListener {
            val intent = Intent(this, registro_cliente :: class.java)
            startActivity(intent)
        }

        val usoAppNegocio : Button = findViewById(R.id.entrar_red_negocio)
        usoAppNegocio.setOnClickListener {
            val intent = Intent(this, uso_app_negocio :: class.java)
            startActivity(intent)
        }

        val usoAppCliente : Button = findViewById(R.id.entrar_red_cliente)
        usoAppCliente.setOnClickListener {
            val intent = Intent(this, uso_app_cliente :: class.java)
            startActivity(intent)
        }
    }
}
