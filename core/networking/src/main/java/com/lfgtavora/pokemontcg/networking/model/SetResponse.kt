package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class SetResponse(
    val id: String,
    val images: ImagesResponse,
    val legalities: LegalitiesResponse,
    val name: String,
    val printedTotal: Int,
    val ptcgoCode: String?,
    val releaseDate: String,
    val series: String,
    val total: Int,
    val updatedAt: String
)
