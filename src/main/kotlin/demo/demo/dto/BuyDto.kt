package demo.demo.dto

import lombok.AllArgsConstructor
import java.math.BigDecimal

@AllArgsConstructor
class BuyDto (id : Long, nameBuyer : String, email : String, paymentMethod: String,
    totalPurchased : BigDecimal, isPaid : Boolean) {

}