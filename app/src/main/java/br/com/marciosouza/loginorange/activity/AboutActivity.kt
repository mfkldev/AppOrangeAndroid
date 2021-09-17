package br.com.marciosouza.loginorange.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        startComponent()
    }

    private fun startComponent() {
        findViewById<TextView>(R.id.about_back)
            .setOnClickListener() {
                finish()
            }
    }

}