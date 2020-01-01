package com.pi.big.bodong.user

import javax.persistence.*

@Entity
@Table(name = "USER")
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "USER_NO")
        val no: Long = -1,
        @Column(name = "USER_ID")
        val id: String)