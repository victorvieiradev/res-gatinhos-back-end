package com.res_gatinhos.api.domain.ports.input

import com.res_gatinhos.api.domain.model.Voluntario

interface AtualizaVoluntarioUseCase {
    fun atualizar(idVoluntario: Long, voluntario: Voluntario): Voluntario
}