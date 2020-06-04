package br.com.tccope

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_perfil.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.view.*

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        textTitleToolbar?.text = "Perfil"

        toolbar.ibBack.setOnClickListener {
            onBackPressed()
        }


        btnExit.setOnClickListener {
            logout()
        }


        btnHome.setOnClickListener {
            goToHome()
        }


    }

    private fun goToHome() {
        val intent = Intent(this@PerfilActivity,HomeActivity::class.java)
        startActivity(intent)

    }

    private fun logout() {
        val intent = Intent(this@PerfilActivity,LoginActivity::class.java)
        startActivity(intent)

    }

}