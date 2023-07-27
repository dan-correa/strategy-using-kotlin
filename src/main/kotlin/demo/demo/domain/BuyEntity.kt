package demo.demo.domain

import jakarta.persistence.*
import org.springframework.data.annotation.Id
import java.math.BigDecimal


@Entity
@Table(name = "tb_buy")
class BuyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBuy")
    private val id: Long? = null

    @Column(name = "nameBuyr")
    private val nameBuyr: String? = null

    @Column(unique = true, name = "email")
    private val email: String? = null

    @Column(unique=false,name = "payment_method")
    private val paymentMethod : String?=null

    @Column(unique=false,name = "total_purchased")
    private val totalPurchased : BigDecimal?=null

    @Column(unique=false,name = "isPayd")
    private val isPayd : Boolean?=null


}