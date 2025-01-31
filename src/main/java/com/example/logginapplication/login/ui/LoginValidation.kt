package com.example.logginapplication.login.ui

object LoginValidation : LoginHandler {
    override fun validateUser(user: String, pass: String): Boolean {
        return user == "admin" && pass == "admin"
    }
}