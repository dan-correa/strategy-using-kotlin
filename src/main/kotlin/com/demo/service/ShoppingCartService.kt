package com.demo.service

import org.springframework.stereotype.Service


@Service
class ShoppingCartService() {


    fun checkout( closedCart: com.demo.resource.paymentResource.ClosedCart): String {

        var buyEntity = com.demo.domain.BuyEntity(
            closedCart.idBuy,
            closedCart.idBuyer,
            closedCart.eMail,
            closedCart.paymentMethod,
            closedCart.total
        );
        lateinit var repository : com.demo.domain.BuysRepository;
        repository.save(buyEntity)

        return "Buy saved";


    //TODO finalizar a lógica de pagamento com a adição no banco de dados
    }
}