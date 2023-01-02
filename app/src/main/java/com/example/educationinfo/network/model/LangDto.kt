package com.rahman.educationinfo.network.model

import com.google.gson.annotations.SerializedName

data class LangDto(
    @SerializedName("name")
    val name:String? = null,

    @SerializedName("code")
    val code:String? = null,
)