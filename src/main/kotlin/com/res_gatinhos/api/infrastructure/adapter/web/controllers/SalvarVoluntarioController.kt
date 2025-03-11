package com.res_gatinhos.api.infrastructure.adapter.web.controllers

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.input.CadastrarVoluntarioUseCase
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/voluntarios")
class SalvarVoluntarioController(
    private val cadastrarVoluntarioUseCase: CadastrarVoluntarioUseCase
) {
    @PostMapping
    fun cadastrar(
        @RequestBody voluntarioRequest: Voluntario
    ): ResponseEntity<Voluntario> {
        return ResponseEntity.ok().body(cadastrarVoluntarioUseCase.cadastrar(voluntarioRequest))

    }
}