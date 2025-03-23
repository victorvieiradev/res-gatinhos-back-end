package com.res_gatinhos.api.application.exceptions

class VoluntarioNaoEncontradoException(
    msg: String = "Voluntario não encontrado."
): RuntimeException(
    msg

)