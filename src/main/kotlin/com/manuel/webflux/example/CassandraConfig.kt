package com.manuel.webflux.example

import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration


@Configuration
class CassandraConfig: AbstractReactiveCassandraConfiguration() {
    override fun getKeyspaceName() = "reactive"

}