package com.rahman.educationinfo.network.responses

import com.rahman.educationinfo.network.model.LangDto
import com.google.gson.annotations.SerializedName

data class LangResponse (
    @SerializedName("data")
    var date: List<LangDto>)

