package com.res_gatinhos.api.domain.ports.output

import com.res_gatinhos.api.domain.model.Voluntario
import java.util.Optional

interface VoluntarioRepository {
    fun salvar(voluntario: Voluntario): Voluntario
    fun listar(): List<Voluntario>
    fun atualizar(voluntario: Voluntario): Voluntario
    fun consultarPorId(id: Long): Optional<Voluntario>
}