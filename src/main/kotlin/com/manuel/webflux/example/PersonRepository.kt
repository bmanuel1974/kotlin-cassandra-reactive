package com.manuel.webflux.example

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
interface PersonRepository: ReactiveCassandraRepository<Person, UUID>