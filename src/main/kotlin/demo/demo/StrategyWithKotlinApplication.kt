package demo.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StrategyWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<StrategyWithKotlinApplication>(*args)
}
