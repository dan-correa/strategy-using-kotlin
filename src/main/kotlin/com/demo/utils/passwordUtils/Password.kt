package com.demo.utils.passwordUtils

import jakarta.validation.Constraint

@MustBeDocumented
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [com.demo.utils.passwordUtils.PasswordValidator::class])
annotation class Password {

}