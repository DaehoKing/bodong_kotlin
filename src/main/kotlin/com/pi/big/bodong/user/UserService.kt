package com.pi.big.bodong.user

import org.springframework.stereotype.Service

@Service
class UserService (val userRepository: UserRepository) {

    fun createUser(userCreateDto: UserCreateDto): Long {
        val user = User(id=userCreateDto.id)
        return userRepository.save(user).no
    }
}