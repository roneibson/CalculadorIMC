package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import java.util.jar.Attributes.Name

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




        val tvResult = findViewById<TextView>(R.id.textviem_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_Classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()


        var Classificacao = ""


        if (result < 18.5f) {
            Classificacao = "ABAIXO DO PESO "
        } else if (result in 18.5f..24.9f) {
            Classificacao = "NORMAL "
        } else if (result in 25.0f..29.9f) {
            Classificacao = "SOBREPESO "
        } else if (result in 30.0f..39.9f) {
            Classificacao = "OBESIDADE I "
        } else if (result > 40f) {
            Classificacao = "OBESIDADE II "

        }

        tvClassificacao.text = getString(R.string.message_Classificacao, Classificacao)

    }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
         finish()

         return super.onOptionsItemSelected(item)
     }

}












