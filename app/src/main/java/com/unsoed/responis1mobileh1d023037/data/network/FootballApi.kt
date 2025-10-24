package com.unsoed.responis1mobileh1d023037.data.network

import com.unsoed.responis1mobileh1d023037.data.model.SearchResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface FootballApi {
    @GET("teams/{id}")
    suspend fun getTeamById(
        @Header("X-Auth-Token") token: String,
        @Path("id") teamId: String
    ): Response<SearchResponse>
}