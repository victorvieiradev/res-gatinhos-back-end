package com.res_gatinhos.api.application.usecase

import com.res_gatinhos.api.application.exceptions.VoluntarioNaoEncontradoException
import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.input.AtualizaVoluntarioUseCase
import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import org.springframework.stereotype.Service

@Service
class AtualizaVoluntarioUseCaseImpl(
    private val voluntarioRepository: VoluntarioRepository
) : AtualizaVoluntarioUseCase {
    override fun atualizar(idVoluntario: Long, voluntario: Voluntario): Voluntario {
        val voluntarioConsultado = voluntarioRepository.consultarPorId(idVoluntario).orElseThrow {
            VoluntarioNaoEncontradoException()
        }
        return voluntarioRepository.atualizar(
            voluntario = Voluntario(
                id = voluntarioConsultado.id,
                nome = voluntario.nome,
                email = voluntario.email,
                telefone = voluntario.telefone
            )
        )
    }
}