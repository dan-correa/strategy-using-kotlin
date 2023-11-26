package com.demo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
@EnableAutoConfiguration
@ComponentScan(basePackages = ["com.demo.service.UserService","com.demo.strategy.PaymentStrategy", "com.demo.service.ShoppingCartService",
		"com.demo.service.PaymentService","com.demo.resource"])
class StrategyWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<StrategyWithKotlinApplication>(*args)
}
