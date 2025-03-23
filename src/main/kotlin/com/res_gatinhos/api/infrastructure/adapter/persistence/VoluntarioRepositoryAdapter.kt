package com.res_gatinhos.api.infrastructure.adapter.persistence

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class VoluntarioRepositoryAdapter (
    private val jpaVoluntarioRepository: JpaVoluntarioRepository
): VoluntarioRepository {
    override fun salvar(voluntario: Voluntario): Voluntario {
        return jpaVoluntarioRepository.save(voluntario)
    }

    override fun listar(): List<Voluntario> {
        return jpaVoluntarioRepository.findAll()
    }

    override fun consultarPorId(id: Long): Optional<Voluntario> {
        return jpaVoluntarioRepository.findById(id)
    }

    override fun atualizar(voluntario: Voluntario): Voluntario {
        return jpaVoluntarioRepository.save(voluntario)
    }

}