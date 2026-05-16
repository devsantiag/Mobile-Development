package org.example.project.services

object LoginService {

    fun authenticate(
        email: String,
        password: String
    ): Boolean {

        return email == "admin@gmail.com"
                && password == "123456"
    }
}