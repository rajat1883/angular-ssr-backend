package com.angular.ssr.angularssrbackend.controller

import org.slf4j.LoggerFactory
import org.slf4j.Logger
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/ssr")
@CrossOrigin(origins = ["https://angularssrwebapp.azurewebsites.net"])
class HelloWorldController {
    private val log: Logger = LoggerFactory.getLogger(HelloWorldController::class.java)

    @GetMapping
    fun helloWorld(): String {
        log.info("Hello world Api called")
        return "Hello World!! from Spring Boot api endpoint!!"
    }
}