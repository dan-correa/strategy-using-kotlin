package com.demo.service

import com.demo.repository.userRepository.UserEntity
import com.demo.repository.userRepository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.IOException


@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    @Throws(IOException::class)
    fun newUser(newUserDetails: NewUserDetails): String {
        val userEntity = UserEntity(
            0L, newUserDetails.userName,
            newUserDetails.eMail,
            newUserDetails.password
        )
        userRepository.save(userEntity)
        return "New User Create"
    }
}