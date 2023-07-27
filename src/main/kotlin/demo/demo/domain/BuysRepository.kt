package demo.demo.domain

import org.springframework.data.jpa.repository.JpaRepository

interface BuysRepository : JpaRepository <BuyEntity,Long> {
}