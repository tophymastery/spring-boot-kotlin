package com.line.emoji.service

import com.line.emoji.entity.UserEntity
import com.line.emoji.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    var userRepository:UserRepository

    constructor(userRepository: UserRepository) {
        this.userRepository = userRepository
    }


    fun findAll(): List<UserEntity> {
        return userRepository.findAll()
    }

    fun save(userEntity: UserEntity) {
        userRepository.save(userEntity)
    }
}