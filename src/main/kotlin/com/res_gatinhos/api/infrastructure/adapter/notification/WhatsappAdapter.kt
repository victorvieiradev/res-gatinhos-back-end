package com.res_gatinhos.api.infrastructure.adapter.notification

import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.output.NotificacaoPort

class WhatsappAdapter : NotificacaoPort {
    override fun enviarNotificacao(voluntario: Voluntario) {
        TODO("Not yet implemented")
    }
}