package demo.demo.service

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.math.BigDecimal

@AllArgsConstructor
@NoArgsConstructor
class ItemFromCart (itemName : String, codItem : Long, quant : Integer, price : BigDecimal) {
}