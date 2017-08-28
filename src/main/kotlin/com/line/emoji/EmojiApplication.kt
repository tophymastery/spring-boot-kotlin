package com.line.emoji

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

@SpringBootApplication
@EnableCircuitBreaker
class EmojiApplication

fun main(args: Array<String>) {
    SpringApplication.run(EmojiApplication::class.java, *args)
}
