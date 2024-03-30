package com.lfgtavora.pokemontcg.networking

import com.lfgtavora.pokemontcg.networking.model.SetsPaginationResponse

interface PokemonTcgNetworkDataSource {
    suspend fun getSets(
        q: String,
        page: Int = 1,
        pageSize: Int = 250,
        orderBy: String = "releaseDate"
    ): SetsPaginationResponse
}