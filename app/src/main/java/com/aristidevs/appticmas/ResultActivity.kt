package com.aristidevs.appticmas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.aristidevs.appticmas.R.*
import com.aristidevs.appticmas.R.id.*

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_result)
        val resultado = findViewById<TextView>(textResultado)

        val respuesta: String? = intent.extras?.getString("RESULTADO")
        resultado.text = "$respuesta"
    }
}