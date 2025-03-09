package com.res_gatinhos.api.infrastructure.adapter.persistence

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import org.springframework.stereotype.Repository

@Repository
class VoluntarioRepositoryAdapter (
    private val jpaVoluntarioRepository: JpaVoluntarioRepository
): VoluntarioRepository {
    override fun salvar(voluntario: Voluntario): Voluntario {
        return jpaVoluntarioRepository.save(voluntario)
    }
}