package com.lakota

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConcretePriceCalculatorApplication

fun main(args: Array<String>) {
    runApplication<ConcretePriceCalculatorApplication>(*args)
}
