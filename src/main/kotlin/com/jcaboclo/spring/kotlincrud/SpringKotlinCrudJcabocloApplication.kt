package com.jcaboclo.spring.kotlincrud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct


@SpringBootApplication
class SpringKotlinCrudJcabocloApplication

fun main(args: Array<String>) {

	val logger:Logger = LoggerFactory.getLogger(SpringKotlinCrudJcabocloApplication::class.java)

	@PostConstruct
	fun init() = logger.info("Application Started")

	logger.info("Application Executed")
	runApplication<SpringKotlinCrudJcabocloApplication>(*args)
}
