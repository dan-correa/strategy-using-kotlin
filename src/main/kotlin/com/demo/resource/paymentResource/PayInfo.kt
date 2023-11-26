package com.demo.resource.paymentResource

import com.demo.enums.PaymentMethodEnum
import jakarta.persistence.Enumerated
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.hibernate.validator.constraints.CreditCardNumber
import org.jetbrains.annotations.NotNull

/*
@RequestBody idBuy: Long, name: String, email: String, cardNumber : String,
    cvv: String, password : String) : ResponseEntity<String>
 */
class PayInfo (
    @NotNull
    var idBuy : Long,

    @field:Min(5)
    @field:Max(60)
    var name: String,

    @field:Email
    var eMail : String,

    @field:CreditCardNumber
    var CardNumber : String,

    @field:Max(3)
    var cvv : Long,

    @field:Min(8)
    @field:Max(12)
    var passWord : String,

    @field:Enumerated
    var paymentMethod : com.demo.enums.PaymentMethodEnum
)  {
}