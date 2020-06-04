package br.com.tccope

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.home_activity.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.view.*

class HomeActivity : AppCompatActivity() {

    var listPersonas: ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        toolbar.ibBack.setOnClickListener {
            onBackPressed()
        }

        btnProfile.setOnClickListener{
            goToProfile()
        }


        val cad= listOf("Maria", "José","Felipe","Francisco","Joao")

        ListPersonas.adapter = ArrayAdapter(this,R.layout.select_dialog_item_material,cad)

        ListPersonas.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,cad[position],Toast.LENGTH_LONG).show()
        }


        if (this.listPersonas.size >= 0) {
            txtCadItems.visibility = View.GONE
        }else {
            txtCadItems.visibility = View.VISIBLE
        }

        btCad.setOnClickListener {
            goToCadastro()

        }

    }

    override fun onResume() {
        super.onResume()


    }

    fun goToCadastro(){

        val intent = Intent(this, CadastroActivity::class.java)
        startActivity(intent)
    }

    fun goToProfile(){

        val intent = Intent(this, PerfilActivity::class.java)
        startActivity(intent)
    }

}


