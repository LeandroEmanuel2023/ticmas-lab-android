package com.aristidevs.appticmas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class PrincipalActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val btnComparar = findViewById<AppCompatButton>(R.id.btnComparar)
        val etView1 = findViewById<AppCompatEditText>(R.id.etView1)
        val etView2 = findViewById<AppCompatEditText>(R.id.etView2)
        val resultado = findViewById<AppCompatTextView>(R.id.textResultado)

        btnComparar.setOnClickListener {
            val val1 = etView1.text.toString()
            val val2 = etView2.text.toString()
            if(val1 == val2){
                val resultado = "Son iguales"
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("RESULTADO", resultado)
                startActivity(intent)
            }else{
                val resultado = "No son iguales"
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("RESULTADO", resultado)
                startActivity(intent)
            }

        }

    }
}