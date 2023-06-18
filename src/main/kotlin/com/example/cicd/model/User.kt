package com.example.cicd.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class User(
    nickname: String,
    email: String,
    password: String
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null

    @Column(name = "nickname", nullable = false)
    var nickname = nickname
        protected set

    @Column(name = "email", nullable = false)
    var email = email
        protected set

    @Column(name = "password", nullable = false)
    var password = password
        protected set


    companion object {
        fun toCreate(nickname: String, email: String, password: String): User {
            return User(nickname, email, password)
        }
    }
}
