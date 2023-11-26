package com.demo.strategy

import org.slf4j.Logger
import java.math.BigDecimal


class PayPalStrategy(private val email: String, private val password: String) : com.demo.strategy.PaymentStrategy {
    override fun pay(amount: BigDecimal) {
        //TODO lógica de pagamento com paypal
    }
}
