package com.jcaboclo.spring.kotlincrud

import com.fasterxml.jackson.databind.ObjectMapper
import com.jcaboclo.spring.kotlincrud.model.Company
import com.jcaboclo.spring.kotlincrud.service.CompanyServiceImpl
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@SpringBootTest
@AutoConfigureMockMvc
class SpringKotlinCrudJcabocloApplicationTests() {

	val logger: Logger = LoggerFactory.getLogger(SpringKotlinCrudJcabocloApplicationTests::class.java)

	@Autowired
	private val mockMvc: MockMvc? = null

	@Autowired
	private val objectMapper: ObjectMapper? = null

//	@Autowired
//	private val service: CompanyServiceImpl? = null

	@Test
	fun contextLoads() {
		logger.info("Test Case executing")
		assertEquals(true,true)
	}

/*
	@Test
	fun saveCompanyTest() {

		val newCompany = Company(100000000,"God is good", "Heaven")
		mockMvc!!.perform(
			post("/saveCompany")
				.contentType("application/json")
				.content(objectMapper!!.writeValueAsString(newCompany))
		)
			.andExpect(status().isOk())
	}
*/

/*
	@Test
	fun getCompanyByNameFailTest() {
		var objCompany: Company? = null
		mockMvc!!.perform(
			get("/getCompanyByName/ze dias não será encontrado")
				.contentType("application/json")
				.content(objectMapper!!.writeValueAsString(objCompany))
		)
		.andExpect(status().isOk())
	}
*/


	@Test
	fun getCompanyByNameSuccessTest() {
		var objCompany: Company? = null
		mockMvc!!.perform(
			get("/getCompanyByName/Maria Jose")
				.contentType("application/json")
				.content(objectMapper!!.writeValueAsString(objCompany))
		)
			.andExpect(status().isOk())
	}



}
