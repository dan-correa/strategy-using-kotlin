package demo.demo.service

import demo.demo.strategy.PayPalStrategy

class PaymentService {
    fun payment (idBuy: Long, name: String, email: String, cardNumber : String,
                 cvv: String, passWord : String) {
        if(cvv.isEmpty())
           PayPalStrategy(email,passWord)
    }
}