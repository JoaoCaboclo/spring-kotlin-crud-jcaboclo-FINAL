package com.jcaboclo.spring.kotlincrud.service

import com.jcaboclo.spring.kotlincrud.model.Company
import com.jcaboclo.spring.kotlincrud.repository.CompanyRepository
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(var companyRepository: CompanyRepository) : CompanyService  {

    override fun saveCompany(company: Company): Company {
        return companyRepository.save(company)
    }

    override fun getCompany(): List<Company> {
        return companyRepository.findAll()
    }

    override fun getCompanyByName(name: String): Company {
        return companyRepository.findByName(name)
    }

    override fun deleteCompany(id: Int): String {
        companyRepository.deleteById(id)
        return "Companhia Excluida"
    }

    override fun updateCompany(id: Int, company: Company): Company {
        var companyForUpdate = companyRepository.findById(id).get()
        companyForUpdate.name = company.name;
        companyForUpdate.address = company.address
        return companyRepository.save(companyForUpdate)
    }


}