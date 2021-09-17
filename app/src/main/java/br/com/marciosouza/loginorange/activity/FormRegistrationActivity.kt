package br.com.marciosouza.loginorange.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.com.marciosouza.loginorange.R
import br.com.marciosouza.loginorange.activity.model.User
import br.com.marciosouza.loginorange.activity.model.UserList

class FormRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_registration)

        val name = findViewById<EditText>(R.id.form_registration_name)
        val email = findViewById<EditText>(R.id.form_registration_username)
        val password = findViewById<EditText>(R.id.form_registration_password)
        val join = findViewById<Button>(R.id.form_registration_join)
        val login = findViewById<TextView>(R.id.form_registration_login)

        startOCR(name, email, password, join, login)
    }

    private fun startOCR(
        name: EditText,
        email: EditText,
        password: EditText,
        join: Button,
        login: TextView
    ) {

        join.setOnClickListener() {
            if(checkUserData(name.text.toString(), email.text.toString(), password.text.toString())){
                registerNewAccount(name.text.toString(), email.text.toString(), password.text.toString())

                finish()
            }else {
                Toast.makeText(this, "Fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        login.setOnClickListener() {
            finish()
        }
    }

    private fun registerNewAccount(name: String, email: String, password: String) {
        val userList = UserList()
        userList.add(User(name, email, password))
        Toast.makeText(this, "Successfully registered user", Toast.LENGTH_SHORT).show()
    }


        fun checkUserData(name: String, email: String, password: String): Boolean {
            return name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()
        }

}