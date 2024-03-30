package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class NormalResponse(
    val directLow: Double?,
    val high: Double,
    val low: Double,
    val market: Double,
    val mid: Double
)
