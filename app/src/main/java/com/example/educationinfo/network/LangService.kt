package com.rahman.educationinfo.network

import com.rahman.educationinfo.network.responses.LangResponse
import retrofit2.http.GET

interface LangService {

    @GET("language")
    suspend fun getLang(
//        @Header ("Authorization") toke :String,
//        @Query("page") page:Int,
//        @Query("limit") limit:Int,

    ):LangResponse

}