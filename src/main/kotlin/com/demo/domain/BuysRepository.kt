package com.demo.domain

import org.springframework.data.jpa.repository.JpaRepository

interface BuysRepository : JpaRepository <com.demo.domain.BuyEntity,Long> {
}