package com.res_gatinhos.api.application.exceptions

class ServiceException
    (message: String = "Falha interna no serviço") : RuntimeException(message)