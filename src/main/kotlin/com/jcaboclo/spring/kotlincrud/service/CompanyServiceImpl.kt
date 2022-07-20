package com.jcaboclo.spring.kotlincrud.service

import com.jcaboclo.spring.kotlincrud.exception.CompanyNotFoundException
import com.jcaboclo.spring.kotlincrud.model.Company
import com.jcaboclo.spring.kotlincrud.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(var companyRepository: CompanyRepository) : CompanyService  {

    private lateinit var workingCompany: Company

    override fun saveCompany(company: Company): Company {
        workingCompany = company
        if (workingCompany.name.length > 2  && workingCompany.address.length > 14 ) (
           return companyRepository.save(workingCompany)
         ) else {
            workingCompany.name = "Nome deve ter no mínimo 3 caraacteres"
            workingCompany.address = "Endereço deve ter no mínimo 15 caracteres"
            return workingCompany
        }
    }

    override fun getCompany(): List<Company> {
        return companyRepository.findAll()
    }

    override fun getCompanyByName(name: String): Company? {
        val companyRetornada:Company ? = companyRepository.findByName(name)
        return  companyRetornada?: throw CompanyNotFoundException()
    }

     override fun deleteCompany(id: Int): String {
        try {
            companyRepository.deleteById(id)
        } catch(e: java.lang.RuntimeException ) {
            throw CompanyNotFoundException()
        } catch(e: Exception) {
            //you can have multiple catch blocks
            //code to handle if this exception is occurred
        }
         return "Companhia Excluida"
    }

    override fun updateCompany(id: Int, company: Company): Company {
        try {
            workingCompany = companyRepository.findById(id).get()
            workingCompany.name = company.name;
            workingCompany.address = company.address
        } catch(e: java.lang.RuntimeException ) {
            throw CompanyNotFoundException()
        } catch(e: Exception) {
            //you can have multiple catch blocks
            //code to handle if this exception is occurred
        }
        return companyRepository.save(workingCompany)
    }
}
