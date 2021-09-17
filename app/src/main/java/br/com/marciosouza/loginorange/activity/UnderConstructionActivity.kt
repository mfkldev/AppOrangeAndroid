package br.com.marciosouza.loginorange.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class UnderConstructionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_under_construction)

        startComponent()
    }

    private fun startComponent() {
        findViewById<TextView>(R.id.under_construction_back)
            .setOnClickListener() {
                finish()
            }
    }
}