package com.manuel.webflux.example

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*



@Table("people")
class Person {

    @PrimaryKey
    var id: UUID? = null

    var lastName: String? = null
    var firstName: String? = null
}