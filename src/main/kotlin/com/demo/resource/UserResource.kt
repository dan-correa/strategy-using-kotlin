package com.demo.resource

import com.demo.service.NewUserDetails
import com.demo.service.UserService
import com.demo.utils.passwordUtils.WeakPasswordException
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource (private val  userService: UserService) {

    @PostMapping()
    fun createNewUser(@RequestBody @Valid newUser : NewUserDetails ): ResponseEntity<String> {
            userService.newUser(newUser)
            return ResponseEntity.status(HttpStatus.CREATED).build();

    }

}