package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class SetsPaginationResponse(
    val count: Int = 0,
    val data: List<SetResponse> = emptyList(),
    val page: Int = 1,
    val pageSize: Int = 250,
    val totalCount: Int
)
