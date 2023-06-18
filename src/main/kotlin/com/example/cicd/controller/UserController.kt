package com.example.cicd.controller

import com.example.cicd.service.UserService
import org.springframework.stereotype.Controller


@Controller
class UserController(private val userService: UserService) {
}

