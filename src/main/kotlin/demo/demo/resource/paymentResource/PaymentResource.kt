package demo.demo.resource.paymentResource

import demo.demo.service.ItensList
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = [("/payment")])
class PaymentResource {
    @PutMapping(value= ["/addPaymentMethods"])
    fun addPaymentMethods(@RequestBody idBuy: Long, name: String, email: String, cardNumber : String,
    cvv: String, password : String) : ResponseEntity<String> {


        return ResponseEntity.ok("Payment method ctreated with sucess!");
    }
}