package com.solp.displayservice.presentation

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class BoardHandler {
    suspend fun getBoards(request: ServerRequest): ServerResponse {
        return ServerResponse.ok().bodyValueAndAwait("to do things")
    }
}