package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class AbilityResponse(
    val name: String = "",
    val text: String = "",
    val type: String = ""
)