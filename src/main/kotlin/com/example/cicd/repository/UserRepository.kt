package com.example.cicd.repository

import com.example.cicd.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Int> {
    fun findByEmailAndPassword(email: String, password: String): User?
}