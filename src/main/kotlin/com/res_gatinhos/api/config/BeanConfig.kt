package com.res_gatinhos.api.config

import com.res_gatinhos.api.domain.ports.output.VoluntarioRepository
import com.res_gatinhos.api.infrastructure.adapter.persistence.JpaVoluntarioRepository
import com.res_gatinhos.api.infrastructure.adapter.persistence.VoluntarioRepositoryAdapter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfig {

    @Bean
    fun voluntarioRepository(jpaRepository: JpaVoluntarioRepository): VoluntarioRepository {
        return VoluntarioRepositoryAdapter(jpaRepository)
    }

    @Bean
    fun notificacaoPort(): WhatsappAdapter {
        return WhatsappAdapter()
    }
}