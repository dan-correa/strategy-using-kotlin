package com.demo.strategy

import org.slf4j.Logger
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class PayPalStrategy() : com.demo.strategy.PaymentStrategy {
    override fun pay(amount: BigDecimal) {
        //TODO lógica de pagamento com paypal
    }
}
