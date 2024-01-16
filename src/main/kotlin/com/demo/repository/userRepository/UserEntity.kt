package com.demo.repository.userRepository

import jakarta.persistence.*
import jakarta.validation.Valid
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import lombok.Data
import lombok.NoArgsConstructor


@Entity
@Table(name = "tb_users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    var id: Long? = null,

    @Column(name = "name_user")
    @Valid
    @field:Min(5, message = "Minimo de 5 caracteres para o nome")
    @field:Max(60, message = "Mázimo de 60 caracteres para o nome")
    var userName: String,

    @Column(unique = true, name = "email_user")
    @Valid
    @field:Email(message = "Deve ser um endereço de e-mail válido")
    private val email: String,

    @Column(unique = false, name = "password")
    @Valid
    @com.demo.utils.passwordUtils.Password
    var password: String
) {


}