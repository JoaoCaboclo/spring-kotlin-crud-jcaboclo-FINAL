package com.jcaboclo.spring.kotlincrud.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice // 1
class CompanyErrorHandler {
    @ExceptionHandler(CompanyNotFoundException::class) // 2
    fun handleNFTNotFoundException(
        servletRequest: HttpServletRequest,
        exception: Exception
    ) : ResponseEntity<String> {
        return ResponseEntity("Companhia não cadastrada" , HttpStatus.NOT_FOUND) // 3
    }
}
