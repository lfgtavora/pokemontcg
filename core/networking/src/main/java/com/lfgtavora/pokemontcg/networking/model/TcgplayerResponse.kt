package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class TcgplayerResponse(
    val prices: PricesResponse?,
    val updatedAt: String,
    val url: String
)