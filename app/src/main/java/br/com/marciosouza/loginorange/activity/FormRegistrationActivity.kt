package br.com.marciosouza.loginorange.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class FormRegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_registration)

        startComponent()
    }

    private fun startComponent() {
        findViewById<TextView>(R.id.form_registration_join)
            .setOnClickListener() {
                finish()
            }

        findViewById<TextView>(R.id.form_registration_login)
            .setOnClickListener() {
                finish()
            }
    }
}