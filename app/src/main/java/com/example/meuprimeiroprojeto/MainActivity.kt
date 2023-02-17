package com.example.meuprimeiroprojeto

import android.content.Context
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val BtnCaucular: Button = findViewById<Button>(R.id.btnCaucular)
        val edtPeso: EditText = findViewById(R.id.edittxtpeso)
        val edtAltura: EditText = findViewById(R.id.edttxtaltura)

        BtnCaucular.setOnClickListener {

            val alturaStr = edtAltura.text.toString()
            val pesoStr = edtPeso.text.toString()

            if (alturaStr.isNotEmpty() && pesoStr.isNotEmpty()) {
                val altura: Float = alturaStr.toFloat()
                val alturaFinal: Float = altura * altura


                val peso: Float = pesoStr.toFloat()
                val result: Float = peso / alturaFinal

                val intent = Intent(this, ResultActivity::class.java)

                    .apply {
                        putExtra("EXTRA_RESULT", result)
                    }

                startActivity(intent)
            } else {
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()

            }


            }

        }


    }




