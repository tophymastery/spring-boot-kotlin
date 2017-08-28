package com.line.emoji.entity

import javax.persistence.*

@Entity
@Table(name = "user")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    var id: Long = 0

    @Column(name = "title")
    var title: String = ""

    @Column(name = "text")
    var text: String = ""

    constructor()
    constructor(id: Long, name: String, text: String) {
        this.id = id
        this.text = name
        this.title = text
    }
}