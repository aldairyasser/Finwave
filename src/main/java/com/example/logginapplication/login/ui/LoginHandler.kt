package com.example.logginapplication.login.ui

interface LoginHandler {
    fun validateUser(user: String, pass: String): Boolean
}