package br.com.marciosouza.loginorange

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView

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
    }
}
