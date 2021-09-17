package br.com.marciosouza.loginorange.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.marciosouza.loginorange.R

class PersonalDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_data)

        startComponent()
    }

    private fun startComponent() {
        findViewById<TextView>(R.id.personal_data_loggout)
            .setOnClickListener() {
                finish()
            }
    }
}