package com.example.cicd.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "cicd Application alive!"
    }
}