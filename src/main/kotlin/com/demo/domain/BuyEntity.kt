package com.demo.domain

import com.demo.enums.PaymentMethodEnum
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

import java.math.BigDecimal


@Entity
@Table(name = "tb_buy")
@AllArgsConstructor
class BuyEntity(
    idBuy: Long,
    id_user: Long,
    email: String,
    paymentMethod: com.demo.enums.PaymentMethodEnum,
    total: BigDecimal
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBuy")
    private val id: Long? = null

    @Column(name = "id_user")
    private val id_user: Long? = null

    @Column(unique = true, name = "email")
    private val email: String? = null

    @Column(unique=false,name = "payment_method")
    private val paymentMethod : Long = 0

    @Column(unique=false,name = "total_purchased")
    private val totalPurchased : BigDecimal?=null

    @Column(unique=false,name = "itens_list")
    private val itensList : String?=null

    @Column(unique=false,name = "is_payd")
    private val isPayd : Boolean?=null


}