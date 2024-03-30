package com.lfgtavora.pokemontcg.networking.model

import kotlinx.serialization.Serializable

@Serializable
data class CardResponse(
    val abilities: List<AbilityResponse> = emptyList(),
    val artist: String,
    val attacks: List<AttackResponse>? = emptyList(),
    val cardmarket: CardMarketResponse,
    val convertedRetreatCost: Int?,
    val evolvesFrom: String?,
    val evolvesTo: List<String>?,
    val flavorText: String?,
    val hp: String,
    val id: String,
    val images: ImagesResponse,
    val legalities: LegalitiesResponse,
    val name: String,
    val nationalPokedexNumbers: List<Int>,
    val number: String,
    val rarity: String,
    val retreatCost: List<String>?,
    val rules: List<String>?,
    val set: SetResponse,
    val subtypes: List<String>,
    val supertype: String,
    val tcgplayer: TcgplayerResponse,
    val types: List<String>,
    val weaknesses: List<WeaknessResponse>?
)
