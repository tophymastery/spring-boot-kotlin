package com.line.emoji.service

import com.line.emoji.entity.UserEntity
import com.line.emoji.repository.UserRepository
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    var userRepository:UserRepository

    constructor(userRepository: UserRepository) {
        this.userRepository = userRepository
    }


    @HystrixCommand(fallbackMethod = "defaultFindAll")
    fun findAll(): List<UserEntity> {
        return userRepository.findAll()
    }

    fun save(userEntity: UserEntity) {
        userRepository.save(userEntity)
    }

    private fun defaultFindAll(): List<UserEntity> {
        return listOf(UserEntity(10, "tophy", "mastery"))
    }
}