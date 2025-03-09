package com.res_gatinhos.api.domain.ports.input

import com.res_gatinhos.api.domain.model.Voluntario

interface CadastrarVoluntarioUseCase {
    fun cadastrar(voluntario: Voluntario): Voluntario
}