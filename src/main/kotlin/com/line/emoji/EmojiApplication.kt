package com.line.emoji

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class EmojiApplication

fun main(args: Array<String>) {
    SpringApplication.run(EmojiApplication::class.java, *args)
}
