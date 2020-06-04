package br.com.tccope

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val txtEmail = findViewById<TextView>(R.id.textInputEmail)
        txtEmail.text = getString(R.string.Email)

        val txtSenha = findViewById<TextView>(R.id.textInputSenha)
        txtSenha.text = getString(R.string.Senha)

        textInputEmail.setOnClickListener {

                Toast.makeText(baseContext, "Digite um Email Valido" , Toast.LENGTH_LONG).show()

        }

        textInputSenha.setOnClickListener {

                Toast.makeText(baseContext, "Digite uma Senha Valida" , Toast.LENGTH_LONG).show()

        }

        buttonLogin.setOnClickListener {

            goToHome()

            Toast.makeText(baseContext, "Seja bem Vindo" , Toast.LENGTH_LONG).show()

        }

    }


    override fun onResume() {
        super.onResume()

    }


    fun goToHome(){

        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
    }


}