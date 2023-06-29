package demo.demo.service

import demo.demo.strategy.PaymentStrategy

class ShoppingCart(private val paymentStrategy: PaymentStrategy) {
    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
        // Lógica adicional de finalização da compra aqui
    }
}