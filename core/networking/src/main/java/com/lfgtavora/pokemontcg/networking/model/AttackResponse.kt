package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class AttackResponse(
    val convertedEnergyCost: Int = 0,
    val cost: List<String> = emptyList(),
    val damage: String = "",
    val name: String = "",
    val text: String = ""
)
