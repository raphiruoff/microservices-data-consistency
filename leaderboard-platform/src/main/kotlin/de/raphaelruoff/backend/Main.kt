package de.raphaelruoff.backend.profilemanagment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroservicDataConsistencyApplication

fun main(args: Array<String>) {
	runApplication<MicroservicDataConsistencyApplication>(*args)
}
