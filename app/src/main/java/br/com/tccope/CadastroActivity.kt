package br.com.tccope

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.cadastro_activity.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.view.*

class CadastroActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_activity)

        textTitleToolbar?.text = "Cadastro"

        toolbar.ibBack.setOnClickListener {
            onBackPressed()
        }

        btnProfile.setOnClickListener {
            goToProfile()
        }



    }

    private fun goToProfile() {
        val intent = Intent(this@CadastroActivity,PerfilActivity::class.java)
        startActivity(intent)

    }

}