package demo.demo.strategy




class PayPalStrategy(private val email: String, private val password: String) : PaymentStrategy {
    override fun pay(amount: Double) {

        // Lógica de pagamento com PayPal aqui
    }
}
