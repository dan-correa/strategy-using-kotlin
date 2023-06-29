package demo.demo.domain

import jakarta.persistence.*
import org.springframework.data.annotation.Id

@Entity
@Table(name = "tb_payment_method")
class PaymentMethodEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private val id: Long? = null

    @Column(name = "payment_method")
    private val name: String? = null

}