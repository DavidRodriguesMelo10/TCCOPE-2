package br.com.tccope

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class SplashActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        changeToLogin()
    }

        fun changeToLogin(){
            val intent = Intent(this,LoginActivity::class.java)

            val handler = Handler()
            handler.postDelayed({
                intent.change()

            }, 30)

        }

    fun Intent.change(){
        startActivity(this)
        finish()

    }

}
