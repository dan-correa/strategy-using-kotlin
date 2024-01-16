package com.demo.service

import com.demo.repository.userRepository.UserEntity
import com.demo.repository.userRepository.UserRepository
import jakarta.validation.Valid
import org.springframework.stereotype.Service
import java.io.IOException


@Service
class UserService( private val userRepository: UserRepository) {

    @Throws(IOException::class)
    fun newUser(@Valid newUserDetails: NewUserDetails): String {
        val userEntity = UserEntity( 0L,newUserDetails.userName,
            newUserDetails.eMail,
            newUserDetails.password
        )
        userRepository.save(userEntity)
        return "New User Create"
    }
}