package br.com.fabianoluiz.ondeehclean.domain.model

data class Cep(
    val cep: String,
    val logradouro: String,
    val complemento: String,
    val bairro: String,
    val localidade: String,
    val uf: String
)
