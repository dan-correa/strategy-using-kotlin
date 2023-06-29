package demo.demo.strategy

class CreditCardStrategy(private val cardNumber: String, private val cvv: String) : PaymentStrategy {
    override fun pay(amount: Double) {

        // Lógica de pagamento com cartão de crédito aqui
    }
}
