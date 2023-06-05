package com.solp.displayservice.presentation

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class BoardRouter(
    private val handler: BoardHandler
) {
    @Bean
    fun coBoardRouter(): RouterFunction<ServerResponse> {
        return coRouter {
            ("/display/boards").nest {
                GET("", handler::getBoards)
            }
        }
    }
}