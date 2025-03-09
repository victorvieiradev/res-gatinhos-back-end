package com.res_gatinhos.api.application.usecase

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.input.CadastrarVoluntarioUseCase
import com.res_gatinhos.api.domain.ports.output.NotificacaoPort
import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class CadastrarVoluntarioUseCaseImpl(
    private val voluntarioRepository: VoluntarioRepository,
    private val notificacaoPort: NotificacaoPort
) : CadastrarVoluntarioUseCase {
    @Transactional
    override fun cadastrar(voluntario: Voluntario): Voluntario {
        val voluntarioSalvo = voluntarioRepository.salvar(voluntario)
        notificacaoPort.enviarNotificacao(voluntarioSalvo)
        return voluntarioSalvo
    }
}