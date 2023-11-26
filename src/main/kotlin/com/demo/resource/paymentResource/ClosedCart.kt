package com.demo.resource.paymentResource

import com.demo.enums.PaymentMethodEnum
import com.demo.service.ItensList
import jakarta.persistence.Enumerated
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import org.jetbrains.annotations.NotNull
import org.springframework.validation.annotation.Validated
import java.math.BigDecimal

//idBuy tem que ser um uuid
//nameBuyer tem que ter no máximo 60 carac e no mínimo 5
//validar o e-mail
//paymentMethod tem que ser um enum
//itensList tem que ter pelo menos um atributo nessa lista
//total tem que ser maior que zero
@Validated
class ClosedCart (
    @NotNull
    var idBuy : Long,
    @field:Min(5)
    @field:Max(60)
    var idBuyer : Long,
    @field:Email
    var eMail : String,
    @field:Enumerated()
    var paymentMethod : com.demo.enums.PaymentMethodEnum,
    @field:Min.List(value = [])
    var itensList : com.demo.service.ItensList,
    @field:Min(value = 1)
    var total : BigDecimal  ){


}