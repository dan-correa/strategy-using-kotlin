package com.demo.strategy

import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class CreditCardStrategy() : com.demo.strategy.PaymentStrategy {
    override fun pay(amount: BigDecimal) {

        // TODO lógica de pagamento com cartão de crédito
        // ex. validar o número de cartão de crédito
    }
}
