package com.demo.service;

import com.demo.utils.passwordUtils.Password
import jakarta.validation.Valid
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.springframework.validation.annotation.Validated

@Validated
public class NewUserDetails (
        @Min(5, message = "Minimo de 5 caracteres para o nome")
        @Max(60, message = "Mázimo de 60 caracteres para o nome")
        var userName : String,
        @Email(message = "Deve ser um endereço de e-mail válido")
        var eMail : String,
        @com.demo.utils.passwordUtils.Password
        var password : String
        ) {
}
