package br.senai.sp.jandira.clientesapp.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Conexao {

    private val BASE_URL = "https://app1.celso.dev.br/clientes-app/api/"

    private val conexao =  Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getClienteService(): ClienteService{
        return conexao.create(ClienteService::class.java)
    }
}