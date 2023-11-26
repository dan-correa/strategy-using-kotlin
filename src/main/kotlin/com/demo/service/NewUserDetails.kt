package com.demo.service;

import com.demo.utils.passwordUtils.Password
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.springframework.validation.annotation.Validated

@Validated
public class NewUserDetails (
        @field:Min(5)
        @field:Max(60)
        var userName : String,
        @field:Email
        var eMail : String,
        @field:com.demo.utils.passwordUtils.Password
        var password : String
        ) {
}
