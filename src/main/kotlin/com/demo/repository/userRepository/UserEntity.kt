package com.demo.repository.userRepository

import com.demo.enums.PaymentMethodEnum
import jakarta.persistence.*
import lombok.EqualsAndHashCode
import lombok.Getter
import lombok.Setter

@Entity
@Table(name = "tb_users")
@Setter
@Getter
@EqualsAndHashCode
class UserEntity (idUser: Long,
                  nameUser: String,
                  email: String,
                  password: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private val id: Long? = null

    @Column(name = "name_user")
    private val nameBuyer: String? = null

    @Column(unique = true, name = "email_user")
    private val email: String? = null

    @Column(unique=false,name = "password")
    private val itensList : String?=null

}