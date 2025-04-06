package com.res_gatinhos.api.infrastructure.adapter.notification

import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.entities.ChatId
import com.res_gatinhos.api.domain.model.Voluntario
import com.res_gatinhos.api.domain.ports.output.NotificacaoPort
import org.springframework.stereotype.Service


@Service
class TelegramService(
    private val chatId: Long
) : NotificacaoPort {
    private val bot = bot {
        token = "token"
    }


    override fun enviarNotificacao(voluntario: Voluntario) {
        val mensagem = """
            📢 Novo voluntário cadastrado!
            
            🙋 Nome: ${voluntario.nome}
            📧 Email: ${voluntario.email}
            📞 Telefone: ${voluntario.telefone}
        """.trimIndent()

        val chatId = ChatId.fromId(chatId)

        bot.sendMessage(chatId, mensagem)
    }


}