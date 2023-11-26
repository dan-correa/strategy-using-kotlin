package com.demo.strategy

import java.math.BigDecimal


class CreditCardStrategy(private val cardNumber: String, private val cvv: String) : com.demo.strategy.PaymentStrategy {
    override fun pay(amount: BigDecimal) {

        // TODO lógica de pagamento com cartão de crédito
        // ex. validar o número de cartão de crédito
    }
}
