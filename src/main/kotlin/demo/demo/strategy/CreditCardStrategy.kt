package demo.demo.strategy

class CreditCardStrategy(private val cardNumber: String, private val cvv: String) : PaymentStrategy {
    override fun pay(amount: Double) {

        // TODO lógica de pagamento com cartão de crédito
        // ex. validar o número de cartão de crédito
    }
}
