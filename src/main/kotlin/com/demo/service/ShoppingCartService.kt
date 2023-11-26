package com.demo.service

import com.demo.domain.BuyEntity
import com.demo.domain.BuysRepository
import com.demo.resource.paymentResource.ClosedCart
import com.demo.strategy.PaymentStrategy
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.math.BigDecimal


@Service
class ShoppingCartService(private val paymentStrategy: com.demo.strategy.PaymentStrategy) {


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