package com.res_gatinhos.api.infrastructure.adapter.persistence

import com.res_gatinhos.api.domain.model.Voluntario
import org.springframework.data.jpa.repository.JpaRepository

interface JpaVoluntarioRepository: JpaRepository<Voluntario, Long>