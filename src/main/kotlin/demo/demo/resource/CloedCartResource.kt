package demo.demo.resource

import demo.demo.service.ItensList
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = [("/closedCart")])
class CloedCartResource {
    @PutMapping(value= ["/addPaymentMethods"])
    fun addPaymentMethods(@RequestBody idBuy: Long, nameBuyer : String, paymentMethodId : Long,
                          itensList: ItensList
    ) : ResponseEntity<String> {

        return ResponseEntity.ok("Payment method ctreated with sucess!");
    }
}
