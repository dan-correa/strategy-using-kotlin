package com.demo.resource

import com.demo.resource.paymentResource.ClosedCart
import com.demo.service.ShoppingCartService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/closedCart")
class ClosedCartResource {

    private lateinit var shoppingCartService: com.demo.service.ShoppingCartService;

    @PostMapping
    //TODO criar objeto de request com validações de atributo
    //idBuy tem que ser um uuid
    //nameBuyer tem que ter no máximo 60 carac e no mínimo 5
    //validar o e-mail
    //paymentMethod tem que ser um enum
    //itensList tem que ter pelo menos um atributo nessa lista
    //total tem que ser maior que zero
    fun addPaymentMethods(@RequestBody closedCartResponse: com.demo.resource.paymentResource.ClosedCart
    ) : ResponseEntity<String> {
        shoppingCartService.checkout(closedCartResponse)
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
