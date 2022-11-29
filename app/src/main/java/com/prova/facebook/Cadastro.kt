package com.example.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val Cadastrar = findViewById<Button>(R.id.Cadastrar)
        Cadastrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            Toast.makeText(this, "Cadastro Realizado com sucesso!",Toast.LENGTH_SHORT)
                .show()
                startActivity(intent)

        }
    }


}