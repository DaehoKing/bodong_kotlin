package com.pi.big.bodong.user

import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
class UserController (val userRepository:UserRepository, val userService: UserService) {

    @GetMapping("/users/{id}")
    fun getUsers(@PathVariable id:Long): User {
        return userRepository.findById(id).orElseThrow()
    }

    @PostMapping("/users")
    fun createUser(@RequestBody request:UserCreateDto ): Long {
        return userService.createUser(request)
    }
}