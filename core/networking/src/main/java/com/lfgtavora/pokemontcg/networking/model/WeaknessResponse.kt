package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class WeaknessResponse(
    val type: String,
    val value: String
)
