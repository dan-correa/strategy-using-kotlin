package demo.demo.resource

import demo.demo.domain.PaymentEntity
import demo.demo.domain.PaymentMethodEntity
import demo.demo.domain.PaymentMethodRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = [("/paymentMethod")])
class PaymentMethodController {

    @Autowired
    private lateinit var repository : PaymentMethodRepository

    @GetMapping(value = ["/{id}"])
    fun retriveById(@PathVariable id: Long): ResponseEntity<PaymentMethodEntity> {
        return ResponseEntity.ok(repository.getReferenceById(id)) }

    @PutMapping(value= ["/addPaymentMethods"])
    fun addPaymentMethods(@RequestBody id: Long, name : String) : ResponseEntity<PaymentMethodEntity>{
        val paymentEntity : PaymentEntity
        repository.save()
    }
}

