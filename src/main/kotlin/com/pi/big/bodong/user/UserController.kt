package com.pi.big.bodong.user

import lombok.extern.slf4j.Slf4j
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.*

@Slf4j
@RestController
class UserController(val userRepository: UserRepository, val userService: UserService) {

    @GetMapping("/users/{id}")
    fun getUsers(@PathVariable id: Long): User {
        return userRepository.findById(id).orElseThrow()
    }

    @GetMapping("/users")
    fun getUsers(page: Pageable): List<User> {
        return userRepository.findAll(page).content
    }

    @PostMapping("/users")
    fun createUser(@RequestBody request: UserCreateDto): Long {
        return userService.createUser(request)
    }

    @DeleteMapping("/users/{id}")
    fun removeUser(@PathVariable id: Long) {
        userRepository.deleteById(id)
    }
}