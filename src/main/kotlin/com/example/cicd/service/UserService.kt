package com.example.cicd.service

import com.example.cicd.model.User
import com.example.cicd.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(private val userRepository: UserRepository) {

    @Transactional
    fun save(nickname: String, email: String, password: String) {
        userRepository.save(
            User.toCreate(nickname, email, password)
        )
    }

    @Transactional
    fun login(email: String, password: String): User {
        return userRepository.findByEmailAndPassword(email, password)
            ?: run{
                throw IllegalArgumentException("이메일 또는 비밀번호가 틀렸습니다.")
            }
    }
}