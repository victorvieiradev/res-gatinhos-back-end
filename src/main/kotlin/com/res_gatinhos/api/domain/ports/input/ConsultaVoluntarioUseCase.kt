package com.res_gatinhos.api.domain.ports.input

import com.res_gatinhos.api.domain.model.Voluntario

interface ConsultaVoluntarioUseCase {
    fun consultar(): List<Voluntario>
}