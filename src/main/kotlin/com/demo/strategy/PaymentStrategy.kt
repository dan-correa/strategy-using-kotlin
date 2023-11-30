package com.demo.strategy

import org.springframework.stereotype.Component
import java.math.BigDecimal

//@Component
interface PaymentStrategy {
    public fun pay(amount: BigDecimal)
}