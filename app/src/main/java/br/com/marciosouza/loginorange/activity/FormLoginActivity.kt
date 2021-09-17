package br.com.marciosouza.loginorange.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class FormLoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        startComponent()
    }

    private fun startComponent() {
        findViewById<TextView>(R.id.form_login_create_new_account)
            .setOnClickListener() {
                startActivity(Intent(this, FormRegistrationActivity::class.java))
            }

        findViewById<TextView>(R.id.form_login_login)
            .setOnClickListener() {
                startActivity(Intent(this, PersonalDataActivity::class.java))
            }
    }
}
