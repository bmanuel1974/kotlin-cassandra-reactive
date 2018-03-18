package com.manuel.webflux.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.server.router


@Configuration
class PersonRouter(val personHandler: PersonHandler) {

    @Bean
    fun router() = router {
        accept(TEXT_HTML).nest {
            GET("/person/{id}", personHandler::findById)
            GET("/person/get/all", personHandler::findAll)
        }
    }
}