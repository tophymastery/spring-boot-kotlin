package com.line.emoji.controller.rest

import com.line.emoji.entity.UserEntity
import com.line.emoji.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = "/services/emoji")
class UserResource {

    @Autowired
    var userService:UserService

    constructor(userService: UserService) {
        this.userService = userService
    }

    @GetMapping(value = "/all")
    fun getAll() = userService.findAll()

    @PostMapping(value = "/add")
    fun addUser(@RequestBody userEntity: UserEntity) {
        userService.save(userEntity)
    }

}