package com.demo.utils.passwordUtils

import jakarta.validation.Constraint
import jakarta.validation.Payload
import kotlin.reflect.KClass

@MustBeDocumented
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [com.demo.utils.passwordUtils.PasswordValidator::class])
annotation class Password ( val message: String = "Weak PassWord",
                            val groups: Array<KClass<Any>> = [],
                            val payload: Array<KClass<Payload>> = []) {

}