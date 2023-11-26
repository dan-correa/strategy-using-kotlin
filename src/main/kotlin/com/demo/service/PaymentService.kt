package com.demo.service

import org.springframework.stereotype.Service

@Service
class PaymentService {
    fun payment (paymentStrategy: com.demo.strategy.PaymentStrategy, closedCart: com.demo.resource.paymentResource.ClosedCart) {
        paymentStrategy.pay(closedCart.total)
    }
}
