package demo.demo.service

import demo.demo.strategy.PaymentStrategy

class ShoppingCart(private val paymentStrategy: PaymentStrategy) {
    fun checkout(idBuy: Long, nameBuyer : String, paymentMethodId : Long,
                 itensList: ItensList) {

        //TODO finalizar a lógica de pagamento com a adição no banco de dados
    }
}