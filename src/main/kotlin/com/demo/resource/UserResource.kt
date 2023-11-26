package com.demo.resource

import com.demo.service.NewUserDetails
import com.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource @Autowired constructor (private var userService: UserService) {

    @PostMapping()
    fun createNewUser(@RequestBody newUser : NewUserDetails ): ResponseEntity<String> {
        userService.newUser(newUser)
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}