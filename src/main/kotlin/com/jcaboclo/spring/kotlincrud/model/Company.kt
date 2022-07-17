package com.jcaboclo.spring.kotlincrud.model

import io.swagger.v3.oas.annotations.media.Schema
import javax.persistence.*

@Entity
@Table(name="tb_company")
@Schema(description = "Contem as propriedades da entidade Company.")
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Int = 0,
    var name:String = "",
    var address:String = ""
)

/*
  Kotlin possui classes e data classes. A diferença é que
  data classes entregam muito mais a partir de um código conciso.
  A partir do código data class Pessoa(val nome: String, val sobrenome: String)
  serão gerados, por exemplo, os métodos equals() e hashCode() automaticamente.
*/
