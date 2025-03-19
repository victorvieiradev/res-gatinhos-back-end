package com.res_gatinhos.api.domain.ports.output

import com.res_gatinhos.api.domain.model.Voluntario

interface VoluntarioRepository {
    fun salvar(voluntario: Voluntario): Voluntario
    fun listar(): List<Voluntario>
}