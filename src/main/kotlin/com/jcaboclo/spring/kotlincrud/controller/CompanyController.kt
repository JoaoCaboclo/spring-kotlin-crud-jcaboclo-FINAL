package com.jcaboclo.spring.kotlincrud.controller

import com.jcaboclo.spring.kotlincrud.model.Company
import com.jcaboclo.spring.kotlincrud.service.CompanyService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController(var companyService: CompanyService) {

    @Operation(summary = "Cadastrar novas Companhias", description = "Returns 202 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Companhia cadastrada com sucesso"),
            ApiResponse(responseCode = "500", description = "Não foi possível finalizar o cadastro da Companhia"),
        ]
    )
    @PostMapping("/saveCompany")
    fun saveCompany(@RequestBody company : Company) : Company {
        return companyService.saveCompany(company)
    }

    @Operation(summary = "Rertornar a relação das Companhias cadastradas", description = "Returns 202 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Lista de Companhias geradas com sucesso"),
            ApiResponse(responseCode = "500", description = "Não foi possível listar as Companhias"),
        ]
    )
    @GetMapping("/listCompanies")
    fun getCompany():List<Company> {
        return companyService.getCompany()
        // return companyRepository.findAll().filter { it.name.equals("João Caboclo 2") }
    }

    @Operation(summary = "Pesquisar Companhia por nome", description = "Returns 202 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Companhia encontrada"),
            ApiResponse(responseCode = "500", description = "Companhia não cadastrada"),
        ]
    )
    @GetMapping("/getCompanyByName/{name}")
    fun getCompanyByName(@PathVariable name : String): Company {
        return companyService.getCompanyByName(name)
    }

    @Operation(summary = "Excluir uma Companhia", description = "Returns 202 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Exclusão realizada com sucesso"),
            ApiResponse(responseCode = "500", description = "Companhia não cadastrada"),
        ]
    )
    @DeleteMapping("/deleteCompany/{id}")
    fun deleteCompany(@PathVariable id : Int) : String {
        companyService.deleteCompany(id)
        return "Companhia Excluida"
    }

    @Operation(summary = "Atualizar dados de uma Companhia", description = "Returns 202 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "202", description = "Dados atualizados com sucesso"),
            ApiResponse(responseCode = "404", description = "Companhia não cadastrada"),
        ]
    )
    @PutMapping("/updateCompany/{id}")
    fun updateCompany(@PathVariable id : Int, @RequestBody company: Company) : Company {
        return companyService.updateCompany(id, company)
    }

}