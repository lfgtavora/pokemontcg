package com.lfgtavora.pokemontcg.networking.retrofit

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.lfgtavora.pokemontcg.networking.PokemonTcgNetworkDataSource
import com.lfgtavora.pokemontcg.networking.model.SetsPaginationResponse
import kotlinx.serialization.json.Json
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class RetrofitPokemonTcgNetwork @Inject constructor(
    networkJson: Json,
    okhttpCallFactory: dagger.Lazy<Call.Factory>,
) : PokemonTcgNetworkDataSource {

    private val networkApi = Retrofit.Builder()
        .baseUrl("https://api.pokemontcg.io/v2/")
        .callFactory { okhttpCallFactory.get().newCall(it) }
        .addConverterFactory(
            networkJson.asConverterFactory("application/json".toMediaType()),
        )
        .build()
        .create(PokemonTcgApi::class.java)

    override suspend fun getSets(
        q: String,
        page: Int,
        pageSize: Int,
        orderBy: String
    ): SetsPaginationResponse {
        return networkApi.getSets(q, page, pageSize, orderBy)
    }
}