package com.res_gatinhos.api.infrastructure.adapter.web.controllers

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.input.ConsultaVoluntarioUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/voluntarios")
class ConsultarVoluntarioController(
    private val consultaVoluntarioUseCase: ConsultaVoluntarioUseCase
) {

    @GetMapping
    fun consultar(): ResponseEntity<List<Voluntario>> {
        return ResponseEntity.ok().body(consultaVoluntarioUseCase.consultar())
    }
}