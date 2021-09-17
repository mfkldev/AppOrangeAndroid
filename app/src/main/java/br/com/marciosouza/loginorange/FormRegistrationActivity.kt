package br.com.marciosouza.loginorange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

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