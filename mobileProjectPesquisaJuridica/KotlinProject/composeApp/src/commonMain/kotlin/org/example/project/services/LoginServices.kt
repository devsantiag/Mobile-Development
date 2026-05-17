package org.example.project.services

object LoginService {

    fun authenticate(
        email: String,
        password: String
    ): Boolean {

//        Fake information -- thie content has been not using
        return email == "admin@gmail.com"
                && password == "123456"
    }
}