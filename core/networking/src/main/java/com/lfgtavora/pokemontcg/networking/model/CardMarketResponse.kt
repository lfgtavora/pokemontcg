package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class CardMarketResponse(
    val prices: PricesResponse?,
    val updatedAt: String,
    val url: String
)
