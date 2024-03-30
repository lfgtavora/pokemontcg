package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class LegalitiesResponse(
    val expanded: String,
    val unlimited: String,
    val standard: String?,
)