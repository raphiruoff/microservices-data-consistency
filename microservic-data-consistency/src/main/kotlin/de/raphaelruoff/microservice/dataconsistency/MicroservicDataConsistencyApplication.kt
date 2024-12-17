package de.raphaelruoff.microservice.microservic_data_consistency

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicDataConsistencyApplication

fun main(args: Array<String>) {
	runApplication<MicroservicDataConsistencyApplication>(*args)
}
