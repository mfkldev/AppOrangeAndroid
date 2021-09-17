package br.com.marciosouza.loginorange.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.marciosouza.loginorange.R

class FormLoginActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        val username = findViewById<EditText>(R.id.form_login_username)
        val password = findViewById<EditText>(R.id.form_login_password)
        val login = findViewById<Button>(R.id.form_login_login)
        val forgot = findViewById<TextView>(R.id.form_login_forgot_password)
        val create = findViewById<TextView>(R.id.form_login_create_new_account)

        startOCR(username, password, login, forgot, create)
    }

    override fun onResume() {
        super.onResume()

    }

    private fun startOCR(
        username: EditText,
        password: EditText,
        login: Button,
        forgot: TextView,
        create: TextView
    ) {
        create.setOnClickListener() {
                startActivity(Intent(this, FormRegistrationActivity::class.java))
            }

        login.setOnClickListener() {


                if(checkUserData(username.text.toString(), password.text.toString())){
                    val intent = Intent(this, PersonalDataActivity::class.java)
                    intent.putExtra("name", username.text.toString())
                    intent.putExtra("email", password.text.toString())

                    startActivity(intent)
                }else {
                    Toast.makeText(this, "Fill in all fields", Toast.LENGTH_SHORT).show()
                }
            }

        forgot.setOnClickListener() {
                startActivity(Intent(this, UnderConstructionActivity::class.java))
            }
    }

    fun checkUserData(username: String, password: String): Boolean {
        return username.isNotEmpty() && password.isNotEmpty()
    }
}
