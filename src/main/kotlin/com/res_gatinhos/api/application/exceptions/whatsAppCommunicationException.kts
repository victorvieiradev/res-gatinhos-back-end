package com.res_gatinhos.api.application.exceptions


class WhatsAppCommuncationException
    (message: String = "Falha ao enviar mensagem WhatsApp") : RuntimeException(message)

