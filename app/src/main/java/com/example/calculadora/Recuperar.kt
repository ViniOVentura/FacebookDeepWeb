package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Recuperar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)

    }
    fun recuperarConta(view: View){
        Toast.makeText(this, "Chave enviada para o email", Toast.LENGTH_LONG).show()

    }
}