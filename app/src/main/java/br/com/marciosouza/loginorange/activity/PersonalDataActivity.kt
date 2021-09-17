package br.com.marciosouza.loginorange.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class PersonalDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_data)

        val name = findViewById<TextView>(R.id.personal_data_name)
        val email = findViewById<TextView>(R.id.personal_data_email)
        val loggout = findViewById<Button>(R.id.personal_data_loggout)
        val chocolate = findViewById<TextView>(R.id.personal_data_chocolate)

        val bundleUser: Bundle = intent.extras!!

        name.text = bundleUser.getString("name")
        email.text = bundleUser.getString("email")

        startOCR(loggout, chocolate)
    }

    private fun startOCR(loggout: Button, chocolate: TextView) {

        loggout.setOnClickListener() {
                finish()
            }

        chocolate.setOnClickListener() {
                startActivity(Intent(this, AboutActivity::class.java))
            }
    }
}