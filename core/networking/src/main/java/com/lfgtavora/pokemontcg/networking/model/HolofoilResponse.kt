package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class HolofoilResponse(
    val directLow: Double = 0.0,
    val high: Double = 0.0,
    val low: Double = 0.0,
    val market: Double = 0.0,
    val mid: Double = 0.0
)
