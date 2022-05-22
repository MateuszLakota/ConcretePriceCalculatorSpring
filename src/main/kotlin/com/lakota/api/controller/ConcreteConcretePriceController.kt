package com.lakota.api.controller

import com.lakota.api.client.BuildingMaterialsClient
import com.lakota.data.dto.ConcretePriceDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ConcreteConcretePriceController(private val client: BuildingMaterialsClient) : ConcretePriceApi {
    override fun getPrice(): ResponseEntity<ConcretePriceDTO> {
        val cementPrice = client.retrieveCementPrice()
        val chippingsPrice = client.retrieveChippingsPrice()
        val sandPrice = client.retrieveSandPrice()
        val waterPrice = client.retrieveWaterPrice()
        val sum = Integer.valueOf(cementPrice) + Integer.valueOf(waterPrice) + Integer.valueOf(sandPrice)
        + Integer.valueOf(chippingsPrice)
        return responseWith<ConcretePriceDTO>(HttpStatus.OK).body(ConcretePriceDTO(sum))
    }

    private fun <R> responseWith(status: HttpStatus): ResponseEntity.BodyBuilder {
        return ResponseEntity.status(status)
    }
}
