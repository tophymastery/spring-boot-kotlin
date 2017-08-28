package com.line.emoji.repository

import com.line.emoji.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>  {

}

