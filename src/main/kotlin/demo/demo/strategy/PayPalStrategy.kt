package demo.demo.strategy

import org.slf4j.Logger


class PayPalStrategy(private val email: String, private val password: String) : PaymentStrategy {
    override fun pay(amount: Double) {

        //TODO lógica de pagamento com paypal
    }
}
