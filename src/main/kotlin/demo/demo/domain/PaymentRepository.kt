package demo.demo.domain

import org.springframework.data.jpa.repository.JpaRepository

interface PaymentRepository : JpaRepository <PaymentEntity,Long> {
}