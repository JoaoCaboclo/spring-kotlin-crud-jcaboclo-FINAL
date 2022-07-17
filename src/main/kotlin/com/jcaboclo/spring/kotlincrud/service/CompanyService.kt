package com.jcaboclo.spring.kotlincrud.service

import com.jcaboclo.spring.kotlincrud.model.Company
import org.springframework.web.bind.annotation.*

interface CompanyService {

    fun saveCompany(@RequestBody company : Company) : Company
    fun getCompany():List<Company>
    fun getCompanyByName(@PathVariable name : String): Company
    fun deleteCompany(@PathVariable id : Int) : String
    fun updateCompany(@PathVariable id : Int, @RequestBody company: Company) : Company

}