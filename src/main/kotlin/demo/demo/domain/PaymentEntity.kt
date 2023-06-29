package demo.demo.domain

import jakarta.persistence.*
import org.springframework.data.annotation.Id


@Entity
@Table(name = "tb_payment")
class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private val id: Long? = null

    @Column(name = "name")
    private val nome: String? = null

    @Column(unique = true, name = "email")
    private val email: String? = null

    @Column(unique=false,name = "payment_method")
    private val paymentMethod : Integer?=null
}