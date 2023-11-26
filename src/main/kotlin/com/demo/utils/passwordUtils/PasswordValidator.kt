package com.demo.utils.passwordUtils;

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

class PasswordValidator : ConstraintValidator<Password, String> {
     // Todo criar anotation para
     // validação de senha com regex : 1 maiusculo, 1 minusculo, 1 numero, 1 especial
     override fun isValid(value: String?, constraintContext : ConstraintValidatorContext ): Boolean {

         if (value == null) false
         return try {
             constraintContext.disableDefaultConstraintViolation();
             val pattern = "^(?=(.*[a-z]){1,})(?=(.*[A-Z]){1,})(?=(.*[0-9]){1,})(?=(.*[!@#\$" +
                     "%^&*()\\-__+.]){1,}).{8,}\$"
             val isStrongPassword = value?.let { Regex(pattern).matches(it) }
             true
         } catch (e: IllegalArgumentException) {
             constraintContext.buildConstraintViolationWithTemplate("This password is weak!!!").addConstraintViolation();
             false
         }

     }



}
