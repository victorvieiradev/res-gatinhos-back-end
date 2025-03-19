package com.res_gatinhos.api.application.usecase

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.input.ConsultaVoluntarioUseCase
import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import org.springframework.stereotype.Service

@Service
class ConsultaVoluntarioUseCaseImpl(
    private val voluntarioRepository: VoluntarioRepository
) : ConsultaVoluntarioUseCase {
    override fun consultar(): List<Voluntario> {
        return voluntarioRepository.listar()
    }
}