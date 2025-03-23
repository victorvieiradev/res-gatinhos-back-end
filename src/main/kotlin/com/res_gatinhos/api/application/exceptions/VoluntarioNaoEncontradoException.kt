package com.res_gatinhos.api.application.exceptions

class VoluntarioNaoEncontradoException(
    message: String = "Voluntario não encontrado."
): RuntimeException(
    message = message
)