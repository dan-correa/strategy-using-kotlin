package com.demo.dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.math.BigDecimal

@AllArgsConstructor
@NoArgsConstructor
@Data
class BuyDto (id : Long, nameBuyer : String, email : String, paymentMethodId : Long, paymentMethod: String,
    totalPurchased : BigDecimal, isPaid : Boolean) {

}