package com.example.calculadora

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCadastro = findViewById<Button>(R.id.botaoCadastro)

        botaoCadastro.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
        val botaoRecuperar = findViewById<TextView>(R.id.botaoRecuperar)

        botaoRecuperar.setOnClickListener {
            val intent = Intent(this, Recuperar::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.politica -> {
                Toast.makeText(this, "Politica de privacidade", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.messenger -> {
                Toast.makeText(this, "Redirecionando para o AppStore", Toast.LENGTH_SHORT)
                    .show()
            }
            R.id.fundador -> {
                Toast.makeText(this, "Mark Zuckerberg", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        return super.onOptionsItemSelected(item)
    }


    fun Entrou(view: View) {
        Toast.makeText(
            this, "Parabéns você está logado!",
            Toast.LENGTH_LONG
        ).show()

    }
}