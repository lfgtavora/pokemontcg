package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class ImagesResponse(
    val large: String?,
    val small: String?,
    val logo: String?,
    val symbol: String?
)
