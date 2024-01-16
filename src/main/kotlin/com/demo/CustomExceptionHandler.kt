package com.demo

import com.demo.utils.passwordUtils.WeakPasswordException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class CustomExceptionHandler {

   @ExceptionHandler(BindException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleValidationException(ex:BindException) : ResponseEntity<Map<String,String?>>{
        val errors = ex.fieldErrors.map{it.field to it.defaultMessage}.toMap()
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors)

    }

   @ExceptionHandler(WeakPasswordException::class)
   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleInternalServerError(ex: Exception):ResponseEntity<String>{
       val errorMessage = "Senha fraca, a senha deve ter no mínimo 8 caracteres, sendo " +
               "1 maiuscula, 1 caracter especial."
       return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage)
    }
}