package com.lfgtavora.pokemontcg.networking.retrofit

import com.lfgtavora.pokemontcg.networking.model.SetsPaginationResponse
import retrofit2.http.GET
import retrofit2.http.Query

internal interface PokemonTcgApi {
    @GET(value = "sets")
    suspend fun getSets(
        @Query(value = "q") q: String,
        @Query(value = "page") page: Int,
        @Query(value = "pageSize") pageSize: Int,
        @Query(value = "orderBy") orderBy: String
    ): SetsPaginationResponse
}