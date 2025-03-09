package com.res_gatinhos.api.domain.ports.output

import com.res_gatinhos.api.domain.model.Voluntario

interface NotificacaoPort {
    fun enviarNotificacao(voluntario: Voluntario)
}