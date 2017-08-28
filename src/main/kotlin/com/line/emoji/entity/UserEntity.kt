package com.line.emoji.entity

import javax.persistence.*

@Entity
@Table(name = "user")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    val id: Long = 0

    @Column(name = "title")
    val title: String = ""

    @Column(name = "text")
    val text: String = ""

}