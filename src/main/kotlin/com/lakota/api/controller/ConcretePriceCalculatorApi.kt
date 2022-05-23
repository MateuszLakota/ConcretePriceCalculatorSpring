package com.lakota.api.controller

import com.lakota.data.dto.ConcretePriceDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

interface ConcretePriceCalculatorApi {
    @GetMapping("/concrete")
    fun getPrice(): ResponseEntity<ConcretePriceDTO>
}
