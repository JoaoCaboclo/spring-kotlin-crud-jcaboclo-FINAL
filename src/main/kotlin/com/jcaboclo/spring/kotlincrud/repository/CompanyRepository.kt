package com.jcaboclo.spring.kotlincrud.repository

import com.jcaboclo.spring.kotlincrud.model.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository:JpaRepository<Company, Int> {

    fun findByName(name:String) : Company
}