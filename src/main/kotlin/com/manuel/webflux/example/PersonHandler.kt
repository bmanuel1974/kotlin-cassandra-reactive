package com.manuel.webflux.example

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono
import java.util.*


@Component
class PersonHandler(private val personRepository: PersonRepository) {


    fun findById(request: ServerRequest): Mono<ServerResponse> {
        val id = request.pathVariable("id")

        val mono: Mono<Person> = personRepository.findById(UUID.fromString(id))
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(mono, Person::class.java)
    }

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(personRepository.findAll(), Person::class.java)
    }
}