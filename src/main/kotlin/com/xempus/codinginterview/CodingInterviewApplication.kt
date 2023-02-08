package com.xempus.codinginterview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class CodingInterviewApplication

fun main(args: Array<String>) {
	runApplication<CodingInterviewApplication>(*args)
}


